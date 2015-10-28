package com.ebay.automation.mock.ums.response.error;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 
 * @author hgelb
 * @date Oct 28, 2015
 * 
 */
public class ErrorResponseCalc {

	public HashMap<Integer, Integer> hmap;

	public ErrorResponseCalc() {
		hmap = new HashMap<Integer, Integer>();
		hmap.put(48163, 1);
		hmap.put(9388, 2);
		hmap.put(27386, 3);
		hmap.put(51542, 4);
	}

	public HashMap<Integer, Integer> getHmap() {
		return hmap;
	}

	public void setHmap(HashMap<Integer, Integer> hmap) {
		this.hmap = hmap;
	}

	public int errorResponseCalculater(int category) {
		Set<Entry<Integer, Integer>> set = hmap.entrySet();
		Iterator<Entry<Integer, Integer>> iterator = set.iterator();
		int num = 0;
		while (iterator.hasNext() && num == 0) {
			Map.Entry mentry = iterator.next();
			if(mentry.getKey().equals(category)){
			System.out.print("key is: " + mentry.getKey() + " & Value is: " + mentry.getValue());
			num = (int) mentry.getValue();
			}	
		}
		return num;
	}
	
	

}
