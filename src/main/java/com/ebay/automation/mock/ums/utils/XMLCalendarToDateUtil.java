package com.ebay.automation.mock.ums.utils;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
/**
 * 
 * @author hgelb
 * @date Nov 3, 2015
 * @link {http://javarevisited.blogspot.co.il/2011/12/java-string-replace-example-tutorial.html}
 * @link {http://grepcode.com/file/repository.springsource.com/org.apache.xerces/com.springsource.org.apache.xerces/2.8.1/org/apache/xerces/jaxp/datatype/XMLGregorianCalendarImpl.java#XMLGregorianCalendarImpl.%3Cinit%3E%28%29}
 */
public class XMLCalendarToDateUtil {
	
	
	/*
     * Converts java.util.Date to javax.xml.datatype.XMLGregorianCalendar
     */
    public static XMLGregorianCalendar toXMLGregorianCalendar(Date date){
        GregorianCalendar gCalendar = new GregorianCalendar();
        gCalendar.setTime(date);
        XMLGregorianCalendar xmlCalendar = null;
        try {
            xmlCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(gCalendar);
        } catch (DatatypeConfigurationException ex) {
            Logger.getLogger(XMLCalendarToDateUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        return xmlCalendar;
    }
  
    
    /*
     * Converts XMLGregorianCalendar to java.util.Date in Java
     */
    public static Date toDate(XMLGregorianCalendar calendar){
        if(calendar == null) {
            return null;
        }
        return calendar.toGregorianCalendar().getTime();
    }



}
