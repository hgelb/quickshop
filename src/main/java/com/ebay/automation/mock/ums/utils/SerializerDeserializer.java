package com.ebay.automation.mock.ums.utils;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.ebay.automation.mock.ums.repository.ExpectedResponsesRepository;
import com.google.gson.Gson;

/**
*
* @author hgelb
* @date Oct 27, 2015
* 
*/
public class SerializerDeserializer {

	
	
	/**
	 * Get Object from File
	 * @param type
	 * @param fileName
	 * @return
	 */
    public static <T> T getJsonFromFile(Class<?> type, String fileName) {
		String json = ExtractStringFromFile(fileName);
		T result = fromJson(json, type);
		return result;

	}
    
    /**
   	 * This method extract json from a file
   	 * @param fileName
   	 * @return
   	 */
   	public static String ExtractStringFromFile(String fileName) {
   		URI uri = null;
   		String file = null;
   		try {
   			uri = ExpectedResponsesRepository.class.getClassLoader().getResource(fileName).toURI();
   			System.out.println("File URI: " + uri);
   		} catch (URISyntaxException e1) {
   			e1.printStackTrace();
   		}
   		try {
   			file = new String(Files.readAllBytes(Paths.get(uri)), Charset.forName("UTF-8"));
   			System.out.println("File: " + file);
   		} catch (IOException e) {
   			e.printStackTrace();
   		}
   		return file;
   	}
   	
   	/**
	 * Convert object to json
	 * @param obj
	 * @return
	 */
	public static String toJson(Object obj) {

		String json = new Gson().toJson(obj);
		System.out.println("json: " + json);
		return json;
	}
   	
   	/**
	 * Convert json the object
	 * @param json
	 * @param type
	 * @return
	 */
	public static <T> T fromJson(String json, Class<?> type) {

		System.out.println("json: " + json);
		T result = new Gson().<T>fromJson(json, type);
		return result;
	}

}
