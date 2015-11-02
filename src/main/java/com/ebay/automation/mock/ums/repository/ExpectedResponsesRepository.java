package com.ebay.automation.mock.ums.repository;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Repository;

import com.ebay.automation.mock.ums.model.ExpectedResponse;
import com.ebay.automation.mock.ums.model.ExpectedResponses;
import com.ebay.automation.mock.ums.model.Key;
import com.ebay.automation.mock.ums.response.GetMetadataResponseWrapper;
import com.ebay.automation.mock.ums.response.error.ErrorResponseCalc;
import com.ebay.automation.mock.ums.utils.SerializerDeserializer;
import com.google.common.collect.Maps;
/**
*
* @author hgelb
* @date Oct 27, 2015
* 
*/
@Repository
public class ExpectedResponsesRepository {

	@Autowired
	private ApplicationContext context;

	private Map<Key, GetMetadataResponseWrapper> expectedResponsesMap = null;
	private GetMetadataResponseWrapper noMatchResponse = null;
	private GetMetadataResponseWrapper errorResponse = null;

	private final static String PATH = "responsedata";
	
	public ExpectedResponsesRepository() {
		ExpectedResponses exp = getResourcesFromFile();
		initExpectedResponsesMap(exp.getResponses());
//		initNoMatchResponse();
	}


	private void initExpectedResponsesMap(List<ExpectedResponse> expectedResponsesList) {
		expectedResponsesMap = Maps.newHashMap();
		for (ExpectedResponse expectedResponse : expectedResponsesList) {
				if (expectedResponsesMap.containsKey(expectedResponse.getKey())) {
					throw new RuntimeException("Response data json contains duplicate categories: "+ expectedResponse.getKey());
				}
				expectedResponsesMap.put(expectedResponse.getKey(), expectedResponse.getMetadataResponseWrapper());		
		}
		System.out.println("Expected Responses: " + expectedResponsesMap);
	}

	public Map<Key, GetMetadataResponseWrapper> getExpectedResponsesMap() {
		return expectedResponsesMap;
	}

	public GetMetadataResponseWrapper getExpectedResponsesByCategoryAndSite(int category, int site) {
		return expectedResponsesMap.get(new Key(category, site));

	}

	public GetMetadataResponseWrapper getNoMatchResponse() {
		return noMatchResponse;
	}


	public GetMetadataResponseWrapper getErrorResponse(int category) {
		initErrorResponse(category);
		return errorResponse;
	}

	
	public static ExpectedResponses getResourcesFromFile(){
		String json = SerializerDeserializer.extractStringFromFile(PATH + File.separatorChar + "responses.json");
		ExpectedResponses expectedresponse = SerializerDeserializer.deserilizer(json, ExpectedResponses.class);
		return expectedresponse;
	}
	
	public void initErrorResponse(int category) {
		errorResponse = null;
		ErrorResponseCalc errorResponseCalc = new ErrorResponseCalc();
		int num = errorResponseCalc.errorResponseCalculater(category);
		//no appropriate error msg
		if(num != 0){
			 String filename = String.format("error_response_%s.json", num);
			 String json = SerializerDeserializer.extractStringFromFile(PATH + File.separatorChar + filename);
			 errorResponse = SerializerDeserializer.deserilizer(json, GetMetadataResponseWrapper.class);
		}
	}


	@SuppressWarnings("unused")
	private void initNoMatchResponse() {
		ExpectedResponses expectedresponse = SerializerDeserializer.getJsonFromFile(ExpectedResponses.class, PATH + File.separatorChar +"no_match_response.json");
		noMatchResponse = expectedresponse.getResponses().get(0).getMetadataResponseWrapper();
		System.out.println("No match response: " + noMatchResponse);
	}



}
