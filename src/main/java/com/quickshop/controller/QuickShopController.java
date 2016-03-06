package com.quickshop.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.ServletWebRequest;

import com.quickshop.response.ProductResponse;
import com.quickshop.response.ResponseGenerator;

/**
 * 
 * @author hadasg
 * @author naamab
 * @Date Mar 6, 2016
 */
@Controller
public class QuickShopController {

	@Autowired
	ResponseGenerator responseGenerator;
	
	private ResponseEntity<ProductResponse> responseEntity = null;
	
	private ProductResponse response = null;


	
	@RequestMapping(value = "/quickshop", method = RequestMethod.GET)
	public ResponseEntity<ProductResponse> getProductById (
			
			@RequestParam(value = "id" , required = true) String id,
			HttpServletResponse httpResponse,
			ServletWebRequest httpRequest) {


		System.out.println("hello getProductById");

		response = responseGenerator.getMetadataResponse(id);
		
		responseEntity = new ResponseEntity<ProductResponse>(response,HttpStatus.OK);
		
		System.out.println("response: " + response);

		return responseEntity;
	}

}
