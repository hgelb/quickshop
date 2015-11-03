package com.ebay.automation.mock.ums.repository;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import com.ebay.automation.mock.ums.response.ErrorCategory;
import com.ebay.automation.mock.ums.response.ErrorData;
import com.ebay.automation.mock.ums.response.ErrorMessage;
import com.ebay.automation.mock.ums.response.ErrorSeverity;
import com.ebay.automation.mock.ums.response.GetMetadataResponse;
import com.ebay.automation.mock.ums.response.Properties;
import com.ebay.automation.mock.ums.response.Recommendation;
import com.ebay.automation.mock.ums.utils.SerializerDeserializer;

/**
*
* @author hgelb
* @date Oct 27, 2015
* 
*/
@ContextConfiguration(locations = { "/servlet-context.xml" })
public class ExpectedResponsesRepositoryTest extends AbstractJUnit4SpringContextTests {
	
	  @Autowired
	  private ExpectedResponsesRepository expectedResponsesRepository;
	  
	  
	  @Test
	  public void testExpectedResponsesRepository() {
		ExpectedResponsesRepository expectedResponsesRepository = new ExpectedResponsesRepository();  
		GetMetadataResponse actualResponse = expectedResponsesRepository.getExpectedResponsesByCategoryAndSite(9355, 0).getGetMetadataResponse();
		List<Recommendation> recommendations = actualResponse.getRecommendations().getRecommendation();
	    assertTrue("Category id is not as expected", recommendations.get(0).getCategoryId() == 9355);
	    Properties properties = recommendations.get(0).getTag().get(0).getProperties();
	    assertEquals("Property name is not as expected", "DisableAsVariant", properties.getProperty().get(0).getName());
	    assertEquals("Property value is not as expected", "true", properties.getProperty().get(0).getValue());
	  }
	  
	  @Ignore
	  @Test
	  public void deserzilaizeTimestampTest(){
		  
		 String jsonDate = "{\"timestamp\":\"2015-10-18T13:11:54.461Z\",\"lastModifiedDate\":\"2015-10-17T02:54:49.000-07:00\"}";
		 XMLGregorianCalendar xMLGregorianCalendar = SerializerDeserializer.xMLGregorianCalendarDeserialize(jsonDate);
		 assertNotNull("XMLGregorianCalendar in null", xMLGregorianCalendar);
	  }

	  @Test
	  public void testExpectedErrorResponse() {
		ExpectedResponsesRepository expectedResponsesRepository = new ExpectedResponsesRepository();  
		
		GetMetadataResponse actualResponse = expectedResponsesRepository.getErrorResponsesByCategory(48163).getGetMetadataResponse();
		ErrorMessage errorMessage = actualResponse.getErrorMessage();
		assertNotNull("ErrorMessage in null", errorMessage);
		ErrorData errorData = errorMessage.getError().get(0);
		assertNotNull("ErrorData in null", errorData);
	    assertTrue("Error id is not as expected", errorData.getErrorId() == 2003);
	    assertEquals("Msg is not as expected", "MissingSOAservicenameheader", errorData.getMessage());
	    assertEquals("Domain value is not as expected", "CoreRuntime", errorData.getDomain());
	  }
	  
	  @Test
	  public void errorMessageTest() {
	
		ErrorMessage errorMessage = new ErrorMessage();

		ErrorData errorData = new ErrorData(2003,"CoreRuntime", "Inbound_Meta_Data",ErrorSeverity.ERROR,ErrorCategory.REQUEST, "MissingSOAservicenameheader", null, null);
		errorMessage.setError(Arrays.asList(errorData));
		
		String errorMessageJson = SerializerDeserializer.toJson(errorMessage);
		System.out.println("ErrorMessage Json: " + errorMessageJson);
		assertNotNull("errorMessageJson in null", errorMessageJson);
		
		ErrorMessage errorMessageObj = SerializerDeserializer.fromJson(errorMessageJson,ErrorMessage.class);
		assertNotNull("errorMessageObj in null", errorMessageObj);
		
		
		GetMetadataResponse actualResponse = new GetMetadataResponse(null,errorMessage,null,null,null,null);
		String metadataResponseJson = SerializerDeserializer.toJson(actualResponse);
		System.out.println("GetMetadataResponse Json: " + metadataResponseJson);
		assertNotNull("GetMetadataResponseJson in null", errorMessageJson);
		
		GetMetadataResponse actualResponseObj = SerializerDeserializer.fromJson(metadataResponseJson ,GetMetadataResponse.class);
		assertNotNull("GetMetadataResponse in null", actualResponseObj);
		assertNotNull("ErrorMessagein GetMetadataResponse in null", actualResponseObj.getErrorMessage());
	  }
	  
	  

}
