package com.ebay.automation.mock.ums.response;

import com.google.common.base.MoreObjects;

/**
*
* @author hgelb
* @date Oct 27, 2015
* 
*/
public class TagValue {


	protected String value;
	
	protected String tvalue;
	
	protected Properties properties;
	
	protected Relationships relationships;

	protected DataSource datasource;
	
	public TagValue() {

	}
	
	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this).add("value", value).add("tvalue", tvalue).add("properties", properties)
				.add("relationships", relationships).add("datasource", datasource).toString();
	}

	/**
	 * Gets the value of the value property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValue() {
		return value;
	}

	/**
	 * Sets the value of the value property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValue(String value) {
		this.value = value;
	}

	/**
	 * Gets the value of the tvalue property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTvalue() {
		return tvalue;
	}

	/**
	 * Sets the value of the tvalue property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTvalue(String value) {
		this.tvalue = value;
	}

	/**
	 * Gets the value of the properties property.
	 * 
	 * @return possible object is {@link Properties }
	 * 
	 */
	public Properties getProperties() {
		return properties;
	}

	/**
	 * Sets the value of the properties property.
	 * 
	 * @param value
	 *            allowed object is {@link Properties }
	 * 
	 */
	public void setProperties(Properties value) {
		this.properties = value;
	}

	/**
	 * Gets the value of the relationships property.
	 * 
	 * @return possible object is {@link Relationships }
	 * 
	 */
	public Relationships getRelationships() {
		return relationships;
	}

	/**
	 * Sets the value of the relationships property.
	 * 
	 * @param value
	 *            allowed object is {@link Relationships }
	 * 
	 */
	public void setRelationships(Relationships value) {
		this.relationships = value;
	}

	/**
	 * Gets the value of the datasource property.
	 * 
	 * @return possible object is {@link DataSource }
	 * 
	 */
	public DataSource getDatasource() {
		return datasource;
	}

	/**
	 * Sets the value of the datasource property.
	 * 
	 * @param value
	 *            allowed object is {@link DataSource }
	 * 
	 */
	public void setDatasource(DataSource value) {
		this.datasource = value;
	}

}
