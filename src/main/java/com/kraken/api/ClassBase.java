package com.kraken.api;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ClassBase {
	private final String classBase;
	private final String base;
	
	@SuppressWarnings("unused")
	private ClassBase() {
		this(null, null);
	}

	public ClassBase(String classBase, String base) {
		this.classBase = classBase;
		this.base = base;
	}

	@JsonProperty("aclass_base")
	public String getClassBase() {
		return classBase;
	}
	
	@JsonProperty("base")
	public String getBase() {
		return base;
	}
}
