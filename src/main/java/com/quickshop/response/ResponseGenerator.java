package com.quickshop.response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.quickshop.repository.ExpectedResponsesRepository;

/**
 * 
 * @author hadasg
 * @author naamab
 * @Date Mar 6, 2016
 */
@Component
public class ResponseGenerator {

	@Autowired
	ExpectedResponsesRepository expectedResponseRepository;

	public ResponseGenerator() {
	}

	public ProductResponse getMetadataResponse(String id) {
		
		return expectedResponse(id);
	}

	private ProductResponse expectedResponse(String id) {
		return expectedResponseRepository.getExpectedResponsesByProductId(id);
	}

	
	public ProductResponse getErrorResponse(String id) {
		return expectedResponseRepository.getErrorResponsesByProductId(id);
	}

}
