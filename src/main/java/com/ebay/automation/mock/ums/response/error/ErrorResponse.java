package com.ebay.automation.mock.ums.response.error;
/**
*
* @author hgelb
* @date Oct 28, 2015
* 
*/
public enum ErrorResponse {
	
	MISSING_SOA_SERVICE_NAME(1, 9355),
	MISSING_SOA_OPERATION_NAME(2, 9388),
	MISSING_SITE_ID(3, 93876),
	MISSING_CATEGORY_ID(4, 1234);
	
	private int key; // file number
	private int value; // category
	
	
	private ErrorResponse(int key, int value) {
		this.key = key;
		this.value = value;
	}


	public int getKey() {
		return key;
	}


	public void setKey(int key) {
		this.key = key;
	}


	public int getValue() {
		return value;
	}


	public void setValue(int value) {
		this.value = value;
	}


	
	
	

}
