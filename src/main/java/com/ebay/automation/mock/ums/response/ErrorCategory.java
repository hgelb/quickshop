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
@XmlType(name = "ErrorCategory")
@XmlEnum
public enum ErrorCategory {

	@XmlEnumValue("System")
	SYSTEM("System"), @XmlEnumValue("Application")
	APPLICATION("Application"), @XmlEnumValue("Request")
	REQUEST("Request");
	private final String value;

	ErrorCategory(String v) {
		value = v;
	}

	public String value() {
		return value;
	}

	public static ErrorCategory fromValue(String v) {
		for (ErrorCategory c : ErrorCategory.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}
