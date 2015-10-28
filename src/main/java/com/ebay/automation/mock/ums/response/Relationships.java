package com.ebay.automation.mock.ums.response;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
*
* @author hgelb
* @date Oct 27, 2015
* 
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Relationships", propOrder = { "relationship" })
public class Relationships {

	protected List<Relationship> relationship;
	
	

	public Relationships() {

	}



	/**
	 * Gets the value of the relationship property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the relationship property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getRelationship().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link Relationship }
	 * 
	 * 
	 */
	public List<Relationship> getRelationship() {
		if (relationship == null) {
			relationship = new ArrayList<Relationship>();
		}
		return this.relationship;
	}

}
