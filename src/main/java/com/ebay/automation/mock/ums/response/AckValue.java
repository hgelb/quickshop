package com.ebay.automation.mock.ums.response;

/**
*
* @author hgelb
* @date Oct 27, 2015
* 
*/
public enum AckValue {
	
	 /**
     * 
     * 						The request was processed successfully, but something occurred that may
     * 						affect your application or the user.				
     * 					
     * 
     */
    SUCCESS("Success"),

    /**
     * 
     * 						The request that triggered the error was not processed successfully.
     * 						When a serious application-level error occurs, the error is returned
     * 						instead of the business data.
     * 					
     * 
     */
    FAILURE("Failure"),

    /**
     * 
     * 						The request that triggered the error was processed successfully but with some warnings.
     * 					
     * 
     */
    WARNING("Warning"),

    /**
     * 
     * 						The request that triggered the error was processed successfully but with some warnings.				
     * 
     */
    PARTIAL_FAILURE("PartialFailure");
    private final String value;

    AckValue(String v) {
        value = v;
    }

   

    public String value() {
		return value;
	}



	public static AckValue fromValue(String v) {
        for (AckValue c: AckValue.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
	    

}
