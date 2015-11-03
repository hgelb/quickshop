package com.ebay.automation.mock.ums.utils;

import java.lang.reflect.Type;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

/**
 * 
 * @author hgelb
 * @date Nov 1, 2015
 * @link {https://github.com/google/gson/issues/368}
 */
public class XMLGregorianCalendarDeserializer implements JsonDeserializer<XMLGregorianCalendar> {

	@Override
	public XMLGregorianCalendar deserialize(JsonElement json, Type typeOfT,
			JsonDeserializationContext context) throws JsonParseException {
		 try {
			/** XMLGregorianCalendar xmlCalendar = null;
			 Date date = new Date(json.getAsLong());
			 GregorianCalendar gCalendar = new GregorianCalendar();
		     gCalendar.setTime(date);
		     xmlCalendar =  DatatypeFactory.newInstance().newXMLGregorianCalendar(gCalendar);
			 return xmlCalendar;**/
			 return DatatypeFactory.newInstance().newXMLGregorianCalendar(json.getAsString());
         } catch (Exception ex) {
        	 Logger.getLogger(XMLGregorianCalendarDeserializer.class.getName()).log(Level.SEVERE, null, ex);
             return null;
         }	
	}

}
