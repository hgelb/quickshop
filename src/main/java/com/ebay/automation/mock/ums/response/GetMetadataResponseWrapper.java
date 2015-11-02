package com.ebay.automation.mock.ums.response;

import com.google.common.base.MoreObjects;

/**
*
* @author hgelb
* @date Oct 28, 2015
* 
*/
public class GetMetadataResponseWrapper {
	
	
	private GetMetadataResponse getMetadataResponse;

	
	public GetMetadataResponseWrapper() {

	}
	

	public GetMetadataResponseWrapper(GetMetadataResponse getMetadataResponse) {
		this.getMetadataResponse = getMetadataResponse;
	}


	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this).add("getMetadataResponse", getMetadataResponse).toString();
	}
	

	public GetMetadataResponse getGetMetadataResponse() {
		return getMetadataResponse;
	}

	public void setGetMetadataResponse(GetMetadataResponse getMetadataResponse) {
		this.getMetadataResponse = getMetadataResponse;
	}
	
	
	

}
