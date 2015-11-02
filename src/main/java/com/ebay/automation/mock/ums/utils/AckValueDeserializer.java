package com.ebay.automation.mock.ums.utils;

import java.lang.reflect.Type;

import com.ebay.automation.mock.ums.response.AckValue;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

/**
*
* @author hgelb
* @date Oct 28, 2015
* @link {http://stackoverflow.com/questions/8211304/using-enums-while-parsing-json-with-gson}
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
