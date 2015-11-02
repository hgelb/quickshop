package com.ebay.automation.mock.ums.response;

import java.util.ArrayList;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import com.google.common.base.MoreObjects;

/**
*
* @author hgelb
* @date Oct 27, 2015
* 
*/
public abstract class BaseResponse {

	protected AckValue ack;
	protected ErrorMessage errorMessage;
	protected String version;
	protected XMLGregorianCalendar timestamp;
	protected List<ExtensionType> extension;

	
	
	public BaseResponse() {
		
	}
	

	public BaseResponse(AckValue ack, ErrorMessage errorMessage,
			String version, XMLGregorianCalendar timestamp,
			List<ExtensionType> extension) {
		this.ack = ack;
		this.errorMessage = errorMessage;
		this.version = version;
		this.timestamp = timestamp;
		this.extension = extension;
	}


	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this).add("ack", ack).add("errorMessage", errorMessage).add("version", version).add("timestamp", timestamp).add("extension", extension).toString();
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
	 * @return possible object is {@link ErrorMessage }
	 * 
	 */
	public ErrorMessage getErrorMessage() {
		return errorMessage;
	}

	/**
	 * Sets the value of the errorMessage property.
	 * 
	 * @param value
	 *            allowed object is {@link ErrorMessage }
	 * 
	 */
	public void setErrorMessage(ErrorMessage value) {
		this.errorMessage = value;
	}

	/**
	 * Gets the value of the version property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * Sets the value of the version property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setVersion(String value) {
		this.version = value;
	}
	

	/**
	 * Gets the value of the extension property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the extension property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getExtension().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link ExtensionType }
	 * 
	 * 
	 */
	public List<ExtensionType> getExtension() {
		if (extension == null) {
			extension = new ArrayList<ExtensionType>();
		}
		return this.extension;
	}
	

	/**
	 * Gets the value of the timestamp property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getTimestamp() {
		return timestamp;
	}

	/**
	 * Sets the value of the timestamp property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setTimestamp(XMLGregorianCalendar value) {
		this.timestamp = value;
	}

}
