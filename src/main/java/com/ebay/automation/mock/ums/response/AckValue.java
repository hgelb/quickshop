package com.ebay.automation.mock.ums.response;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
/**
*
* @author hgelb
* @date Oct 27, 2015
* 
*/
@XmlType(name = "AckValue")
@XmlEnum
public enum AckValue {
	
	 /**
     * 
     * 						The request was processed successfully, but something occurred that may
     * 						affect your application or the user.				
     * 					
     * 
     */
    @XmlEnumValue("Success")
    SUCCESS("Success"),

    /**
     * 
     * 						The request that triggered the error was not processed successfully.
     * 						When a serious application-level error occurs, the error is returned
     * 						instead of the business data.
     * 					
     * 
     */
    @XmlEnumValue("Failure")
    FAILURE("Failure"),

    /**
     * 
     * 						The request that triggered the error was processed successfully but with some warnings.
     * 					
     * 
     */
    @XmlEnumValue("Warning")
    WARNING("Warning"),

    /**
     * 
     * 						The request that triggered the error was processed successfully but with some warnings.				
     * 
     */
    @XmlEnumValue("PartialFailure")
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
