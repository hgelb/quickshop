package com.quickshop.utils;

import java.lang.reflect.Type;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.quickshop.response.AckValue;
/**
 * 
 * @author hadasg
 * @author naamab
 * @Date Mar 6, 2016
 */
public class AckValueSerializer implements JsonSerializer<AckValue> {

	@Override
	public JsonElement serialize(AckValue src, Type typeOfSrc,
			JsonSerializationContext context) {
		
		 return new JsonPrimitive(src.value());
	}

}
