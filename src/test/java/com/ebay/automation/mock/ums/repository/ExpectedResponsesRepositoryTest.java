package com.ebay.automation.mock.ums.repository;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import com.ebay.automation.mock.ums.response.GetMetadataResponse;
import com.ebay.automation.mock.ums.response.Properties;
import com.ebay.automation.mock.ums.response.Recommendation;

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
		GetMetadataResponse actualResponse = expectedResponsesRepository.getExpectedResponsesByCategoryAndSite(9355, 0);
		List<Recommendation> recommendations = actualResponse.getRecommendations().getRecommendation();
	    assertTrue("Category id is not as expected", recommendations.get(0).getCategoryId() == 9355);
	    Properties properties = recommendations.get(0).getTag().get(0).getProperties();
	    assertEquals("Property name is not as expected", "DisableAsVariant", properties.getProperty().get(0).getName());
	    assertEquals("Property value is not as expected", "true", properties.getProperty().get(0).getValue());
	  }

}
