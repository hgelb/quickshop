package com.quickshop.model;


import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

/**
 * @author hadasg
 * @author naamab
 * @Date Mar 6, 2016
 */
public class Key {
	
	private String id;
		
	
	public Key() {

	}


	public Key(String id) {
		super();
		this.id = id;
	}
	
	
	
	@Override
	  public String toString() {
	    return MoreObjects.toStringHelper(this).add("id", id).toString();
	  }


	 @Override
	  public int hashCode() {
	    return Objects.hashCode(id);
	  }

	  @Override
	  public boolean equals(Object object) {
	    if (object instanceof Key) {
	      Key that = (Key) object;
	      return Objects.equal(this.id, that.id);
	    }
	    return false;
	  }


	public String getId() {
		return id;
	}


	
	
	

}
