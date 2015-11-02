package com.ebay.automation.mock.ums.response;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import com.google.common.base.MoreObjects;

/**
 *
 * @author hgelb
 * @date Oct 27, 2015
 * 
 */
public class Recommendation {

	protected int categoryId;

	protected XMLGregorianCalendar lastModifiedDate;
	
	protected List<Tag> tag;
	
	

	public Recommendation() {

	}
	
	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this).add("categoryId", categoryId).add("lastModifiedDate", lastModifiedDate).add("tag", tag).toString();
	}

	/**
	 * Gets the value of the categoryId property.
	 * 
	 */
	public int getCategoryId() {
		return categoryId;
	}

	/**
	 * Sets the value of the categoryId property.
	 * 
	 */
	public void setCategoryId(int value) {
		this.categoryId = value;
	}
	

	/**
	 * Gets the value of the tag property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the tag property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getTag().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Tag }
	 * 
	 * 
	 */
	public List<Tag> getTag() {
		if (tag == null) {
			tag = new ArrayList<Tag>();
		}
		return this.tag;
	}


	/**
	 * Gets the value of the lastModifiedDate property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getLastModifiedDate() {
		return lastModifiedDate;
	}

	/**
	 * Sets the value of the lastModifiedDate property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setLastModifiedDate(XMLGregorianCalendar value) {
		this.lastModifiedDate = value;
	}
}
