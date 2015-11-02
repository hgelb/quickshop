package com.ebay.automation.mock.ums.response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ebay.automation.mock.ums.repository.ExpectedResponsesRepository;

/**
*
* @author hgelb
* @date Oct 27, 2015
* 
*/
@Component
public class ResponseGenerator {

	@Autowired
	ExpectedResponsesRepository expectedResponseRepository;

	public ResponseGenerator() {
	}

	public GetMetadataResponseWrapper getMetadataResponse(int category, int site) {
		if (site < 0) {
//			return invalidSiteResponse(site);
		}

		if (category == 9999) {
			throw new RuntimeException("returned an exception as requested");
		}
		return expectedResponse(category, site);
	}

	private GetMetadataResponseWrapper expectedResponse(int category, int site) {
		GetMetadataResponseWrapper metadataResponse = expectedResponseRepository.getExpectedResponsesByCategoryAndSite(category, site);
		if (metadataResponse == null) {
			return expectedResponseRepository.getNoMatchResponse();
		}
		return metadataResponse;
	}

	private GetMetadataResponseWrapper invalidSiteResponse(int site) {
		return expectedResponseRepository.getErrorResponse(site);
	}
	
	
	public GetMetadataResponseWrapper getErrorResponse(int category) {
		return expectedResponseRepository.getErrorResponse(category);
	}

}
