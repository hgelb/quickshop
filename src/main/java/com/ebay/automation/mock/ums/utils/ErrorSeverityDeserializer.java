package com.ebay.automation.mock.ums.utils;

import java.lang.reflect.Type;

import com.ebay.automation.mock.ums.response.ErrorSeverity;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

/**
 * 
 * @author hgelb
 * @date Nov 1, 2015
 */
public class ErrorSeverityDeserializer implements JsonDeserializer<ErrorSeverity> {

	@Override
	public ErrorSeverity deserialize(JsonElement json, Type typeOfT,
			JsonDeserializationContext context) throws JsonParseException {
		
		ErrorSeverity[] values = ErrorSeverity.values();
	    for (ErrorSeverity val : values)
	    {
	      if (val.value().equals(json.getAsString()))
	        return val;
	    }
	    return null;
	}

}
