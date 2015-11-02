package com.ebay.automation.mock.ums.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.ServletWebRequest;

import com.ebay.automation.mock.ums.response.GetMetadataResponseWrapper;
import com.ebay.automation.mock.ums.response.ResponseGenerator;

/**
 * 
 * @author hgelb
 * @date Oct 27, 2015
 * 
 */
@Controller
public class UmsController {

	@Autowired
	ResponseGenerator responseGenerator;
	
	private ResponseEntity<GetMetadataResponseWrapper> responseEntity = null;
	
	private GetMetadataResponseWrapper response = null;


	
	@RequestMapping(value = "/ws/spf", method = {RequestMethod.GET, RequestMethod.POST})
	public ResponseEntity<GetMetadataResponseWrapper> getMetadata (
			
			@RequestParam(value = "X-EBAY-SOA-SERVICE-NAME", required = false, defaultValue = "UnifiedMetadataServiceV1") String soaServiceName,
			
			@RequestParam(value = "X-EBAY-SOA-RESPONSE-DATA-FORMAT", required = false, defaultValue = "JSON") String responseDataFormat,
			
			@RequestParam(value = "X-EBAY-SOA-OPERATION-NAME", required = false, defaultValue="getMetadata") String soaOperationName,
			
			@RequestParam(value = "categoryId", required = true) int category,
			
			@RequestParam(value = "siteId", required = true) int site,
			
			HttpServletResponse httpResponse, ServletWebRequest httpRequest) {


		System.out.println("hello getMetadata");

		response = null;
		
		response = responseGenerator.getErrorResponse(category);
		
		if(response != null) {
		
			long errorId = response.getGetMetadataResponse().getErrorMessage().getError().get(0).getErrorId();
			
			if (!(errorId == 10003L)) {
				responseEntity = new ResponseEntity<GetMetadataResponseWrapper>(response, HttpStatus.INTERNAL_SERVER_ERROR);
			} 
			else { //errorId == 10003L
				responseEntity = new ResponseEntity<GetMetadataResponseWrapper>(response,HttpStatus.OK);
			}
		}
		else { //response == null
			response = responseGenerator.getMetadataResponse(category, site);
			responseEntity = new ResponseEntity<GetMetadataResponseWrapper>(response, HttpStatus.OK);
		}

		System.out.println("response: " + response);

		return responseEntity;
	}

}
