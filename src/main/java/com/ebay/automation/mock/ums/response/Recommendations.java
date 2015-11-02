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
public class Recommendations {

	
	protected int siteId;
	
	protected Integer languageId;
	
	protected List<Recommendation> recommendation;
	
	

	public Recommendations() {

	}
	
	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this).add("siteId", siteId).add("languageId", languageId).add("recommendation", recommendation).toString();
	}

	/**
	 * Gets the value of the siteId property.
	 * 
	 */
	public int getSiteId() {
		return siteId;
	}

	/**
	 * Sets the value of the siteId property.
	 * 
	 */
	public void setSiteId(int value) {
		this.siteId = value;
	}

	/**
	 * Gets the value of the languageId property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getLanguageId() {
		return languageId;
	}

	/**
	 * Sets the value of the languageId property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setLanguageId(Integer value) {
		this.languageId = value;
	}

	/**
	 * Gets the value of the recommendation property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the recommendation property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getRecommendation().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link Recommendation }
	 * 
	 * 
	 */
	public List<Recommendation> getRecommendation() {
		if (recommendation == null) {
			recommendation = new ArrayList<Recommendation>();
		}
		return this.recommendation;
	}

}
