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

	private Map<Key, GetMetadataResponseWrapper> errorResponsesMap = null;

	private final static String PATH = "responsedata";
	

	public ExpectedResponsesRepository() {
		
		ExpectedResponses exp = getResourcesFromFile("responses");
		initExpectedResponsesMap(exp.getResponses());
		ExpectedResponses errors = getResourcesFromFile("error_responses");
		initErrorResponsesMap(errors.getResponses());

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
	
	private void initErrorResponsesMap(List<ExpectedResponse> expectedResponsesList) {
		errorResponsesMap = Maps.newHashMap();
		for (ExpectedResponse expectedResponse : expectedResponsesList) {
				if (errorResponsesMap.containsKey(expectedResponse.getKey())) {
					throw new RuntimeException("Response data json contains duplicate categories: "+ expectedResponse.getKey());
				}
				errorResponsesMap.put(expectedResponse.getKey(), expectedResponse.getMetadataResponseWrapper());		
		}
		System.out.println("Error Responses: " + errorResponsesMap);
	}
	

	public Map<Key, GetMetadataResponseWrapper> getExpectedResponsesMap() {
		return expectedResponsesMap;
	}

	public GetMetadataResponseWrapper getExpectedResponsesByCategoryAndSite(int category, int site) {
		return expectedResponsesMap.get(new Key(category, site));

	}
	
	public GetMetadataResponseWrapper getErrorResponsesByCategory(int category) {
		return errorResponsesMap.get(new Key(category, 0));

	}

	
	public static ExpectedResponses getResourcesFromFile(String fileName){
		String filePath = String.format(PATH + File.separatorChar + "%s.json", fileName);
		String json = SerializerDeserializer.extractStringFromFile(filePath);
		ExpectedResponses expectedresponse = SerializerDeserializer.deserilizer(json, ExpectedResponses.class);
		return expectedresponse;
	}


}
