package com.ebay.automation.mock.ums.model;

import com.ebay.automation.mock.ums.response.GetMetadataResponse;
import com.google.common.base.MoreObjects;

/**
*
* @author hgelb
* @date Oct 27, 2015
* 
*/
public class ExpectedResponse {

	private Key key;

	private GetMetadataResponse getMetadataResponse;

	public ExpectedResponse() {
	}

	public ExpectedResponse(int category, int site, GetMetadataResponse getMetadataResponse) {
		this.key = new Key(category, site);
		this.getMetadataResponse = getMetadataResponse;
	}

	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this).add("key", key).add("getMetadataResponse", getMetadataResponse).toString();
	}

	public GetMetadataResponse getMetadataResponse() {
		return getMetadataResponse;
	}

	public Key getKey() {
		return key;
	}

}
