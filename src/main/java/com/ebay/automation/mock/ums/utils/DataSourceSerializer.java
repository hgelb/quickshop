package com.ebay.automation.mock.ums.utils;

import java.lang.reflect.Type;

import com.ebay.automation.mock.ums.response.DataSource;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

/**
*
* @author hgelb
* @date Nov 1, 2015
* @link {http://www.eelingshi.com/questions/127541/using-enums-while-parsing-json-with-gson}
* @link {https://google-gson.googlecode.com/svn/trunk/gson/docs/javadocs/com/google/gson/JsonSerializer.html}
*/
public class DataSourceSerializer implements JsonSerializer<DataSource>{

	@Override
	public JsonElement serialize(DataSource src, Type typeOfSrc,
			JsonSerializationContext context) {

		return new JsonPrimitive(src.value());
	}

}
