package com.ebay.automation.mock.ums.response;


/**
*
* @author hgelb
* @date Oct 27, 2015
* 
*/
public enum ErrorSeverity {


	ERROR("Error"),
	
	WARNING("Warning");
	
	private final String value;

	ErrorSeverity(String v) {
		value = v;
	}

	public String value() {
		return value;
	}

	public static ErrorSeverity fromValue(String v) {
		for (ErrorSeverity c : ErrorSeverity.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}
