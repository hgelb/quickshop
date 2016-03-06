package com.quickshop.utils;

/**
 * 
 * @author hadasg
 * @author naamab
 * @Date Mar 6, 2016
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
