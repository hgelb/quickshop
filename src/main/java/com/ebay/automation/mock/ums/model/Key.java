package com.ebay.automation.mock.ums.model;


import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

/**
*
* @author hgelb
* @date Oct 27, 2015
* 
*/
public class Key {
	
	private int category;
	private int site;
		
	
	public Key() {

	}


	public Key(int category, int site) {
		super();
		this.category = category;
		this.site = site;
	}
	
	
	
	@Override
	  public String toString() {
	    return MoreObjects.toStringHelper(this).add("category", category).add("site", site).toString();
	  }


	 @Override
	  public int hashCode() {
	    return Objects.hashCode(category, site);
	  }

	  @Override
	  public boolean equals(Object object) {
	    if (object instanceof Key) {
	      Key that = (Key) object;
	      return Objects.equal(this.category, that.category) && Objects.equal(this.site, that.site);
	    }
	    return false;
	  }



	/**
	 * @return the category
	 */
	public int getCategory() {
		return category;
	}
	
	/**
	 * @return the site
	 */
	public int getSite() {
		return site;
	}
	
	
	

}
