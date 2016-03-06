package com.quickshop.repository;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Repository;

import com.google.common.collect.Maps;
import com.quickshop.model.ExpectedResponse;
import com.quickshop.model.ExpectedResponses;
import com.quickshop.model.Key;
import com.quickshop.response.ProductResponse;
import com.quickshop.utils.SerializerDeserializer;
/**
 * 
 * @author hadasg
 * @author naamab
 * @Date Mar 6, 2016
 */
@Repository
public class ExpectedResponsesRepository {

	@Autowired
	private ApplicationContext context;

	private Map<Key, ProductResponse> expectedResponsesMap = null;

	private Map<Key, ProductResponse> errorResponsesMap = null;

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
					throw new RuntimeException("Response data json contains duplicate ids: "+ expectedResponse.getKey());
				}
				expectedResponsesMap.put(expectedResponse.getKey(), expectedResponse.getProductResponse());		
		}
		System.out.println("Expected Responses: " + expectedResponsesMap);
	}
	
	private void initErrorResponsesMap(List<ExpectedResponse> expectedResponsesList) {
		errorResponsesMap = Maps.newHashMap();
		for (ExpectedResponse expectedResponse : expectedResponsesList) {
				if (errorResponsesMap.containsKey(expectedResponse.getKey())) {
					throw new RuntimeException("Response data json contains duplicate ids: "+ expectedResponse.getKey());
				}
				errorResponsesMap.put(expectedResponse.getKey(), expectedResponse.getProductResponse());		
		}
		System.out.println("Error Responses: " + errorResponsesMap);
	}
	

	public Map<Key, ProductResponse> getExpectedResponsesMap() {
		return expectedResponsesMap;
	}

	public ProductResponse getExpectedResponsesByProductId(String id) {
		return expectedResponsesMap.get(new Key(id));

	}
	
	public ProductResponse getErrorResponsesByProductId(String id) {
		return errorResponsesMap.get(new Key(id));

	}

	
	public static ExpectedResponses getResourcesFromFile(String fileName){
		String filePath = String.format(PATH + File.separatorChar + "%s.json", fileName);
		String json = SerializerDeserializer.extractStringFromFile(filePath);
		ExpectedResponses expectedresponse = SerializerDeserializer.deserilizer(json, ExpectedResponses.class);
		return expectedresponse;
	}


}
