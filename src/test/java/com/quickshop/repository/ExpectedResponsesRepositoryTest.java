package com.quickshop.repository;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import com.quickshop.response.ProductResponse;

/**
 * 
 * @author hadasg
 * @author naamab
 * @Date Mar 6, 2016
 */
@ContextConfiguration(locations = { "/servlet-context.xml" })
public class ExpectedResponsesRepositoryTest extends AbstractJUnit4SpringContextTests {
	
//	@Autowired
//	private ExpectedResponsesRepository expectedResponsesRepository;
	
	@Test
	public void testExpectedResponsesRepository() {
		ExpectedResponsesRepository expectedResponsesRepository = new ExpectedResponsesRepository();
		ProductResponse actualResponse = expectedResponsesRepository.getExpectedResponsesByProductId("123");
		assertTrue("Product id is not as expected", actualResponse.getId().equals("123"));
		assertTrue("Product name is not as expected", actualResponse.getName().equals("milk"));
		assertTrue("price is not as expected", 6.5 == actualResponse.getPrice());
	}
	
	
	@Test
	public void testExpectedErrorResponse() {
		ExpectedResponsesRepository expectedResponsesRepository = new ExpectedResponsesRepository();
		
		ProductResponse actualResponse = expectedResponsesRepository.getErrorResponsesByProductId("125");
		String errorMessage = actualResponse.getErrorMessage();
		assertNotNull("ErrorMessage in null", errorMessage);
		assertNotNull("ErrorData in null", errorMessage);
		assertEquals("error msg is not as expected", "this product is not existing", errorMessage);
	}
	
	
	
}
