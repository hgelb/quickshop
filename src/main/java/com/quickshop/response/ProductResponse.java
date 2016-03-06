package com.quickshop.response;

import com.google.common.base.MoreObjects;

/**
 * 
 * @author hadasg
 * @author naamab
 * @Date Mar 6, 2016
 */
public class ProductResponse extends BaseResponse {

	private String id;
	private String imageURL;
	private String name;
	private double price;
	
	public ProductResponse(String id, String imageURL, String name, double price) {
		super();
		this.id = id;
		this.imageURL = imageURL;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this).add("id", id).add("imageURL", imageURL).add("name", name).add("price", price).toString();
	}
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getImageURL() {
		return imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
