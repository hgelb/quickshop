package com.ebay.automation.mock.ums.response;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
*
* @author hgelb
* @date Oct 27, 2015
* 
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseResponse", propOrder = { "ack", "errorMessage", "version",
		"timestamp", "extension" })
public abstract class BaseResponse {

	@XmlElement(required = true)
	protected AckValue ack;
	protected ErrorMessage errorMessage;
	protected String version;
	@XmlSchemaType(name = "dateTime")
	protected String timestamp; //XMLGregorianCalendar
	protected List<ExtensionType> extension;

	
	
	public BaseResponse() {
		
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
	
	

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
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
	

//	/**
//	 * Gets the value of the timestamp property.
//	 * 
//	 * @return possible object is {@link XMLGregorianCalendar }
//	 * 
//	 */
//	public XMLGregorianCalendar getTimestamp() {
//		return timestamp;
//	}
//
//	/**
//	 * Sets the value of the timestamp property.
//	 * 
//	 * @param value
//	 *            allowed object is {@link XMLGregorianCalendar }
//	 * 
//	 */
//	public void setTimestamp(XMLGregorianCalendar value) {
//		this.timestamp = value;
//	}

}
