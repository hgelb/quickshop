package com.quickshop.utils;

import java.lang.reflect.Type;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.quickshop.response.AckValue;

/**
 * 
 * @author hadasg
 * @author naamab
 * @Date Mar 6, 2016
 */
public class AckValueDeserializer implements JsonDeserializer<AckValue> {

	@Override
	public AckValue deserialize(JsonElement json, Type typeOfT,
			JsonDeserializationContext context) throws JsonParseException {
		
		AckValue[] values = AckValue.values();
	    for (AckValue val : values)
	    {
	      if (val.value().equals(json.getAsString()))
	        return val;
	    }
	    return null;
	
		  
	}

}
