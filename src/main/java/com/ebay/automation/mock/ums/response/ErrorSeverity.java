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
@XmlType(name = "ErrorSeverity", namespace = "http://www.ebay.com/marketplace/services")
@XmlEnum
public enum ErrorSeverity {

	@XmlEnumValue("Error")
	ERROR("Error"), @XmlEnumValue("Warning")
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
