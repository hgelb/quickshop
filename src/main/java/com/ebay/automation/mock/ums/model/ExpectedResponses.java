package com.ebay.automation.mock.ums.model;

import java.util.List;

import com.google.common.base.MoreObjects;

/**
*
* @author hgelb
* @date Oct 27, 2015
* 
*/
public class ExpectedResponses {

	private List<ExpectedResponse> responses;

	public ExpectedResponses() {
	}

	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this).add("responses", responses)
				.toString();
	}

	public ExpectedResponses(List<ExpectedResponse> responses) {
		this.responses = responses;
	}

	public List<ExpectedResponse> getResponses() {
		return responses;
	}

}
