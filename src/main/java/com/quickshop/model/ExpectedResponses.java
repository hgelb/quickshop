package com.quickshop.model;

import java.util.List;

import com.google.common.base.MoreObjects;

/**
 * @author hadasg
 * @author naamab
 * @Date Mar 6, 2016
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
