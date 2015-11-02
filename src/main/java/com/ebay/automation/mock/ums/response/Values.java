package com.ebay.automation.mock.ums.response;

import java.util.ArrayList;
import java.util.List;

import com.google.common.base.MoreObjects;

/**
*
* @author hgelb
* @date Oct 27, 2015
* 
*/
public class Values {

	
	protected List<TagValue> tagValue;

	
	
	public Values() {

	}
	
	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this).add("tagValue", tagValue).toString();
	}



	/**
	 * Gets the value of the tagValue property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the tagValue property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getTagValue().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link TagValue }
	 * 
	 * 
	 */
	public List<TagValue> getTagValue() {
		if (tagValue == null) {
			tagValue = new ArrayList<TagValue>();
		}
		return this.tagValue;
	}

}
