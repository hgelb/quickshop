package com.quickshop.model;

import com.google.common.base.MoreObjects;
import com.quickshop.response.ProductResponse;

/**
 * @author hadasg
 * @author naamab
 * @Date Mar 6, 2016
 */
public class ExpectedResponse {

	private Key key;

	private ProductResponse product;

	public ExpectedResponse() {
	}

	public ExpectedResponse(String id, ProductResponse product) {
		this.key = new Key(id);
		this.product = product;
	}

	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this).add("key", key).add("product", product).toString();
	}

	public ProductResponse getProductResponse() {
		return product;
	}

	public Key getKey() {
		return key;
	}

}
