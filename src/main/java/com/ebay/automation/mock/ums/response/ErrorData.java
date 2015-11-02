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
public class ErrorData {

	protected long errorId;

	protected String domain;
	
	protected String subdomain;

	protected ErrorSeverity severity;

	protected ErrorCategory category;

	protected String message;

	protected String exceptionId;
	
	protected List<ErrorParameter> parameter;
	

	public ErrorData() {

	}
	
	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this).add("errorId", errorId).add("domain", domain).
				add("subdomain", subdomain).add("severity", severity).
				add("category", category).add("message", message).
				add("exceptionId", exceptionId).add("parameter", parameter).toString();
	}

	



	public ErrorData(long errorId, String domain, String subdomain,
			ErrorSeverity severity, ErrorCategory category, String message,
			String exceptionId, List<ErrorParameter> parameter) {
		super();
		this.errorId = errorId;
		this.domain = domain;
		this.subdomain = subdomain;
		this.severity = severity;
		this.category = category;
		this.message = message;
		this.exceptionId = exceptionId;
		this.parameter = parameter;
	}

	/**
	 * Gets the value of the errorId property.
	 * 
	 */
	public long getErrorId() {
		return errorId;
	}

	/**
	 * Sets the value of the errorId property.
	 * 
	 */
	public void setErrorId(long value) {
		this.errorId = value;
	}

	/**
	 * Gets the value of the domain property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDomain() {
		return domain;
	}

	/**
	 * Sets the value of the domain property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDomain(String value) {
		this.domain = value;
	}

	/**
	 * Gets the value of the subdomain property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSubdomain() {
		return subdomain;
	}

	/**
	 * Sets the value of the subdomain property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSubdomain(String value) {
		this.subdomain = value;
	}
	
	

	/**
	 * Gets the value of the severity property.
	 * 
	 * @return possible object is {@link ErrorSeverity }
	 * 
	 */
	public ErrorSeverity getSeverity() {
		return severity;
	}

	/**
	 * Sets the value of the severity property.
	 * 
	 * @param value
	 *            allowed object is {@link ErrorSeverity }
	 * 
	 */
	public void setSeverity(ErrorSeverity value) {
		this.severity = value;
	}

	/**
	 * Gets the value of the category property.
	 * 
	 * @return possible object is {@link ErrorCategory }
	 * 
	 */
	public ErrorCategory getCategory() {
		return category;
	}

	/**
	 * Sets the value of the category property.
	 * 
	 * @param value
	 *            allowed object is {@link ErrorCategory }
	 * 
	 */
	public void setCategory(ErrorCategory value) {
		this.category = value;
	}

	
	/**
	 * Gets the value of the message property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * Sets the value of the message property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMessage(String value) {
		this.message = value;
	}

	/**
	 * Gets the value of the exceptionId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getExceptionId() {
		return exceptionId;
	}

	/**
	 * Sets the value of the exceptionId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setExceptionId(String value) {
		this.exceptionId = value;
	}

	/**
	 * Gets the value of the parameter property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the parameter property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getParameter().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link ErrorParameter }
	 * 
	 * 
	 */
	public List<ErrorParameter> getParameter() {
		if (parameter == null) {
			parameter = new ArrayList<ErrorParameter>();
		}
		return this.parameter;
	}

}
