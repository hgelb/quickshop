package com.ebay.automation.mock.ums.response;

import com.google.common.base.MoreObjects;

/**
*
* @author hgelb
* @date Oct 27, 2015
* 
*/
public class Relationship {


	protected String parentName;
	
	protected String parentValue;

	
	
	public Relationship() {

	}
	
	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this).add("parentName", parentName).add("parentValue", parentValue).toString();
	}

	/**
	 * Gets the value of the parentName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getParentName() {
		return parentName;
	}

	/**
	 * Sets the value of the parentName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setParentName(String value) {
		this.parentName = value;
	}

	/**
	 * Gets the value of the parentValue property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getParentValue() {
		return parentValue;
	}

	/**
	 * Sets the value of the parentValue property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setParentValue(String value) {
		this.parentValue = value;
	}

}
