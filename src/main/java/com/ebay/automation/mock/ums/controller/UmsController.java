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

import com.ebay.automation.mock.ums.response.ResponseGenerator;
import com.ebay.automation.mock.ums.utils.SerializerDeserializer;

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
	private ResponseEntity<String> responseEntity = null;
	private String responsejson = null;
	private String getMetadataResponse = "getMetadataResponse";

	@RequestMapping(value = "/ws/spf", method = RequestMethod.GET)
	public ResponseEntity<String> getMetadata(
			@RequestParam(value = "X-EBAY-SOA-SERVICE-NAME", required = false, defaultValue = "UnifiedMetadataServiceV1") String soaServiceName,
			@RequestParam(value = "X-EBAY-SOA-RESPONSE-DATA-FORMAT", required = false, defaultValue = "JSON") String responseDataFormat,
			@RequestParam(value = "X-EBAY-SOA-OPERATION-NAME", required = true, defaultValue="getMetadata") String soaOperationName,
			@RequestParam(value = "categoryId", required = true) int category,
			@RequestParam(value = "siteId", required = true) int site,
			HttpServletResponse httpResponse, ServletWebRequest httpRequest) {

		System.out.println("hello getMetadata");

		responsejson = responseGenerator.getErrorResponse(category);

		if (responsejson != null && !responsejson.contains(getMetadataResponse)) {
			responseEntity = new ResponseEntity<String>(responsejson, HttpStatus.INTERNAL_SERVER_ERROR);
			
		} else if (responsejson != null && responsejson.contains(getMetadataResponse)) {
			responseEntity = new ResponseEntity<String>(responsejson,HttpStatus.OK);
			
		} else if (responsejson == null) {
			responsejson = SerializerDeserializer.toJson(responseGenerator.getMetadataResponse(category, site));
			responseEntity = new ResponseEntity<String>(responsejson, HttpStatus.OK);
		}

		System.out.println("response: " + responsejson);

		return responseEntity;
	}

}
