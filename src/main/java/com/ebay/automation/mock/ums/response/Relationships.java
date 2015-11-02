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
public class Relationships {

	
	protected List<Relationship> relationship;
	
	

	public Relationships() {

	}

	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this).add("relationship", relationship).toString();
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
