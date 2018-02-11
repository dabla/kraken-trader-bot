package com.kraken.api;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Reponse<RESULT> {
	private final String[] error;
	private final Result<RESULT> result;
	
	@SuppressWarnings("unused")
	private Reponse() {
		this(null, Result.<RESULT>emptyResult());
	}
	
	@JsonIgnore
	public Reponse(String[] error, Result<RESULT> result) {
		this.error = error;
		this.result = result;
	}
	
	@JsonProperty("error")
	public String[] getError() {
		return error;
	}
	
	@JsonProperty("result")
	public Result<RESULT> getResult() {
		return result;
	}
	
	@Override
	public String toString() {
		return new ToStringBuilder(this)
				.append("error", error)
				.append("result", result)
				.toString();
	}
}
