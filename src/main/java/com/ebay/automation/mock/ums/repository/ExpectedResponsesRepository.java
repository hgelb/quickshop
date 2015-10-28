package com.ebay.automation.mock.ums.repository;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Repository;

import com.ebay.automation.mock.ums.model.ExpectedResponse;
import com.ebay.automation.mock.ums.model.ExpectedResponses;
import com.ebay.automation.mock.ums.model.Key;
import com.ebay.automation.mock.ums.response.ErrorMessage;
import com.ebay.automation.mock.ums.response.GetMetadataResponse;
import com.ebay.automation.mock.ums.response.error.ErrorResponse;
import com.ebay.automation.mock.ums.response.error.ErrorResponseCalc;
import com.ebay.automation.mock.ums.utils.SerializerDeserializer;
import com.google.common.collect.Lists;
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

	private Map<Key, GetMetadataResponse> expectedResponsesMap = null;
	private GetMetadataResponse noMatchResponse = null;
	private String errorResponse = null;

	private final static String PATH = "responsedata";
	
	public ExpectedResponsesRepository() {
		ExpectedResponses exp = getResourcesFromFile();
		initExpectedResponsesMap(exp.getResponses());
//		initNoMatchResponse();
		System.out.println("Expected Responses: " + expectedResponsesMap);
//		System.out.println("No match response: " + noMatchResponse);
	}


	private void initExpectedResponsesMap(List<ExpectedResponse> expectedResponsesList) {
		expectedResponsesMap = Maps.newHashMap();
		for (ExpectedResponse expectedResponse : expectedResponsesList) {
				if (expectedResponsesMap.containsKey(expectedResponse.getKey())) {
					throw new RuntimeException("Response data json contains duplicate categories: "+ expectedResponse.getKey());
				}
				expectedResponsesMap.put(expectedResponse.getKey(), expectedResponse.getMetadataResponse());		
		}
	}

	public Map<Key, GetMetadataResponse> getExpectedResponsesMap() {
		return expectedResponsesMap;
	}

	public GetMetadataResponse getExpectedResponsesByCategoryAndSite(
			int category, int site) {
		return expectedResponsesMap.get(new Key(category, site));

	}

	public GetMetadataResponse getNoMatchResponse() {
		return noMatchResponse;
	}


	public String getErrorResponse(int category) {
		initErrorResponse(category);
		return errorResponse;
	}

	
	public static ExpectedResponses getResourcesFromFile(){
		ExpectedResponses expectedresponse = SerializerDeserializer.getJsonFromFile(ExpectedResponses.class, PATH + File.separatorChar + "responses.json");
		return expectedresponse;
	}
	
	public void initErrorResponse(int category) {
		ErrorResponseCalc errorResponseCalc = new ErrorResponseCalc();
		int num = errorResponseCalc.errorResponseCalculater(category);
		//no appropriate error msg
		if(num != 0){
			String filename = String.format("error_response_%s.json", num);
			errorResponse = SerializerDeserializer.ExtractStringFromFile(PATH + File.separatorChar + filename);
		}
	}


	private void initNoMatchResponse() {
		ExpectedResponses expectedresponse = SerializerDeserializer.getJsonFromFile(ExpectedResponses.class, PATH + File.separatorChar +"no_match_response.json");
		noMatchResponse = expectedresponse.getResponses().get(0).getMetadataResponse();
	}



}
