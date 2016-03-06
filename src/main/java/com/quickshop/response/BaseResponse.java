package com.quickshop.response;

import com.google.common.base.MoreObjects;

/**
 * 
 * @author hadasg
 * @author naamab
 * @Date Mar 6, 2016
 */
public abstract class BaseResponse {

	protected AckValue ack;
	protected String errorMessage;


	
	
	public BaseResponse() {
		
	}
	

	public BaseResponse(AckValue ack, String errorMessage) {
		this.ack = ack;
		this.errorMessage = errorMessage;
		
	}


	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this).add("ack", ack).add("errorMessage", errorMessage).toString();
	}



	/**
	 * Gets the value of the ack property.
	 * 
	 * @return possible object is {@link AckValue }
	 * 
	 */
	public AckValue getAck() {
		return ack;
	}

	/**
	 * Sets the value of the ack property.
	 * 
	 * @param value
	 *            allowed object is {@link AckValue }
	 * 
	 */
	public void setAck(AckValue value) {
		this.ack = value;
	}



	/**
	 * Gets the value of the errorMessage property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getErrorMessage() {
		return errorMessage;
	}

	/**
	 * Sets the value of the errorMessage property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setErrorMessage(String value) {
		this.errorMessage = value;
	}

	
}
