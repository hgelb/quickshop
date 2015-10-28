package com.ebay.automation.mock.ums.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
*
* @author hgelb
* @date Oct 27, 2015
* 
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Relationship", propOrder = { "parentName", "parentValue" })
public class Relationship {

	@XmlElement(required = true)
	protected String parentName;
	protected String parentValue;

	
	
	public Relationship() {

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
