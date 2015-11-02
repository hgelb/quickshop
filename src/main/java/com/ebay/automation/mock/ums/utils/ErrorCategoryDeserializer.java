package com.ebay.automation.mock.ums.utils;

import java.lang.reflect.Type;

import com.ebay.automation.mock.ums.response.ErrorCategory;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

/**
 * 
 * @author hgelb
 * @date Nov 1, 2015
 */
public class ErrorCategoryDeserializer implements JsonDeserializer<ErrorCategory> {

	@Override
	public ErrorCategory deserialize(JsonElement json, Type typeOfT,
			JsonDeserializationContext context) throws JsonParseException {
		
		ErrorCategory[] values = ErrorCategory.values();
	    for (ErrorCategory val : values)
	    {
	      if (val.value().equals(json.getAsString()))
	        return val;
	    }
	    return null;
	}

}
