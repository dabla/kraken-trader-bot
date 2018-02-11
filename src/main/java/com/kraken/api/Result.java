package com.kraken.api;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(NON_NULL)
public class Result<RESULT> {
	private final Map<String, RESULT> map;
	private final Integer last;

	@SuppressWarnings("unused")
	private Result() {
		this(new HashMap<String, RESULT>(), null);
	}
	
	public Result(Map<String, RESULT> map, Integer last) {
		this.map = map;
		this.last = last;
	}

	@JsonAnyGetter
	public Map<String, RESULT> values() {
		return map;
	}

	@JsonAnySetter
	public void put(String name, RESULT value) {
		map.put(name, value);
	}
	
	@JsonProperty("last")
	public Integer getLast() {
		return last;
	}
	
	@Override
	public String toString() {
		return new ToStringBuilder(this)
		    .append(map)
			.append("last", last)
			.toString();
	}
}
