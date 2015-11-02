package com.ebay.automation.mock.ums.utils;

import java.lang.reflect.Type;

import com.ebay.automation.mock.ums.response.AckValue;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class AckValueSerializer implements JsonSerializer<AckValue> {

	@Override
	public JsonElement serialize(AckValue src, Type typeOfSrc,
			JsonSerializationContext context) {
		
		 return new JsonPrimitive(src.value());
	}

}
