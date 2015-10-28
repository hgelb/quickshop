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

	public GetMetadataResponse getMetadataResponse(int category, int site) {
		if (site < 0) {
//			return invalidSiteResponse(site);
		}

		if (category == 9999) {
			throw new RuntimeException("returned an exception as requested");
		}
		return expectedResponse(category, site);
	}

	private GetMetadataResponse expectedResponse(int category, int site) {
		GetMetadataResponse metadataResponse = expectedResponseRepository.getExpectedResponsesByCategoryAndSite(category, site);
		if (metadataResponse == null) {
			return expectedResponseRepository.getNoMatchResponse();
		}
		return metadataResponse;
	}

//	private GetMetadataResponse invalidSiteResponse(int site) {
//		return expectedResponseRepository.getErrorResponse(String.format(
//				"Invalid Site [%s] in resource path", site));
//	}
	
	
	public String getErrorResponse(int category) {
		return expectedResponseRepository.getErrorResponse(category);
	}

}
