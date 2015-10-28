package com.ebay.automation.mock.ums.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
*
* @author hgelb
* @date Oct 27, 2015
* 
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Tag", propOrder = { "name", "tname", "properties",
		"relationships", "values" })
public class Tag {

	@XmlElement(required = true)
	protected String name;
	protected String tname;
	protected Properties properties;
	protected Relationships relationships;
	protected Values values;
	@XmlAttribute(name = "datasource")
	protected DataSource datasource;
	
	

	public Tag() {

	}

	/**
	 * Gets the value of the name property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the value of the name property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setName(String value) {
		this.name = value;
	}

	/**
	 * Gets the value of the tname property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTname() {
		return tname;
	}

	/**
	 * Sets the value of the tname property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTname(String value) {
		this.tname = value;
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
	 * Gets the value of the values property.
	 * 
	 * @return possible object is {@link Values }
	 * 
	 */
	public Values getValues() {
		return values;
	}

	/**
	 * Sets the value of the values property.
	 * 
	 * @param value
	 *            allowed object is {@link Values }
	 * 
	 */
	public void setValues(Values value) {
		this.values = value;
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
