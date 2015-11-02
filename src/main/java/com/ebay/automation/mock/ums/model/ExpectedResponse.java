package com.ebay.automation.mock.ums.model;

import com.ebay.automation.mock.ums.response.GetMetadataResponseWrapper;
import com.google.common.base.MoreObjects;

/**
*
* @author hgelb
* @date Oct 27, 2015
* 
*/
public class ExpectedResponse {

	private Key key;

	private GetMetadataResponseWrapper getMetadataResponseWrapper;

	public ExpectedResponse() {
	}

	public ExpectedResponse(int category, int site, GetMetadataResponseWrapper getMetadataResponseWrapper) {
		this.key = new Key(category, site);
		this.getMetadataResponseWrapper = getMetadataResponseWrapper;
	}

	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this).add("key", key).add("getMetadataResponseWrapper", getMetadataResponseWrapper).toString();
	}

	public GetMetadataResponseWrapper getMetadataResponseWrapper() {
		return getMetadataResponseWrapper;
	}

	public Key getKey() {
		return key;
	}

}
