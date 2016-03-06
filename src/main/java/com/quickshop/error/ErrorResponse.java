package com.quickshop.error;
/**
 * 
 * @author hadasg
 * @author naamab
 * @Date Mar 6, 2016
 */
public enum ErrorResponse {
	
	PRODUCT_IS_NOT_EXISTING("product is not existing");
	
	private String value;
	
	
	private ErrorResponse(String value) {
		this.value = value;
	}


	public String getValue() {
		return value;
	}



	
	
	

}
