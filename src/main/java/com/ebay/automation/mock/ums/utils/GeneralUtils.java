package com.ebay.automation.mock.ums.utils;

/**
*
* @author hgelb
* @date Oct 27, 2015
* 
*/
public class GeneralUtils {

	public static void sleep(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}

	private GeneralUtils() {
	}
}
