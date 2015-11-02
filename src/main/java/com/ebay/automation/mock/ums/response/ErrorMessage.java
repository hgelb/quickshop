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

public class ErrorMessage {

	protected List<ErrorData> error;
	

	public ErrorMessage() {

	}


	public ErrorMessage(List<ErrorData> error) {
		super();
		this.error = error;
	}


	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this).add("error", error).toString();
	}
	


	public void setError(List<ErrorData> error) {
		this.error = error;
	}



	/**
	 * Gets the value of the error property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the error property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getError().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link ErrorData }
	 * 
	 * 
	 */
	public List<ErrorData> getError() {
		if (error == null) {
			error = new ArrayList<ErrorData>();
		}
		return this.error;
	}
	
	

}
