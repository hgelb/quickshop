package com.ebay.automation.mock.ums.utils;

import java.lang.reflect.Type;

import com.ebay.automation.mock.ums.response.DataSource;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

/**
 * 
 * @author hgelb
 * @date Nov 1, 2015
 * @link {https://google-gson.googlecode.com/svn/trunk/gson/docs/javadocs/com/google/gson/JsonDeserializer.html}
 */
public class DataSourceDeserializer implements JsonDeserializer<DataSource>{

	@Override
	public DataSource deserialize(JsonElement json, Type typeOfT,
			JsonDeserializationContext context) throws JsonParseException {
		
		DataSource[] values = DataSource.values();
	    for (DataSource val : values)
	    {
	      if (val.value().equals(json.getAsString()))
	        return val;
	    }
	    return null;
	}

}
