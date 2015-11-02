package com.ebay.automation.mock.ums.utils;

import java.lang.reflect.Type;

import com.ebay.automation.mock.ums.response.ErrorCategory;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

/**
 * 
 * @author hgelb
 * @date Nov 1, 2015
 */
public class ErrorCategorySerializer implements JsonSerializer<ErrorCategory> {

	@Override
	public JsonElement serialize(ErrorCategory src, Type typeOfSrc,
			JsonSerializationContext context) {

		return new JsonPrimitive(src.value());
	}

}
