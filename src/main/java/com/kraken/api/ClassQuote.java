package com.kraken.api;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ClassQuote {
	private final String classQuote;
	private final String quote;
	
	@SuppressWarnings("unused")
	private ClassQuote() {
		this(null, null);
	}

	public ClassQuote(String classQuote, String quote) {
		this.classQuote = classQuote;
		this.quote = quote;
	}

	@JsonProperty("aclass_quote")
	public String getClassQuote() {
		return classQuote;
	}
	
	@JsonProperty("quote")
	public String getQuote() {
		return quote;
	}
}
