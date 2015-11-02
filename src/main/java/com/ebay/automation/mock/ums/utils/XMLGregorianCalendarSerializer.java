package com.ebay.automation.mock.ums.utils;

import java.lang.reflect.Type;

import javax.xml.datatype.XMLGregorianCalendar;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

/**
 * 
 * @author hgelb
 * @date Nov 1, 2015
 * @link {https://github.com/google/gson/issues/368}
 */
public class XMLGregorianCalendarSerializer implements JsonSerializer<XMLGregorianCalendar> {

	@Override
	public JsonElement serialize(XMLGregorianCalendar src, Type typeOfSrc,
			JsonSerializationContext context) {
		 XMLGregorianCalendar xgcal = (XMLGregorianCalendar) src;
         return new JsonPrimitive(xgcal.toXMLFormat());
	}

}
