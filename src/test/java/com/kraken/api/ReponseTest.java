package com.kraken.api;

import java.util.List;

import org.apache.commons.io.IOUtils;
import org.junit.Test;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ReponseTest {
	@Test
	public void asset() throws Exception {
		String json = IOUtils.toString(getClass().getClassLoader().getResourceAsStream("AssetPairs.json"));
		
		System.out.println("json: " + json);
		
		Reponse<Asset> actual = new ObjectMapper().readValue(json, new TypeReference<Reponse<Asset>>() {});
		
		System.out.println("actual: " + actual);
	}
	
	@Test
	public void ticker() throws Exception {
		String json = IOUtils.toString(getClass().getClassLoader().getResourceAsStream("Ticker.json"));
		
		System.out.println("json: " + json);
		
		Reponse<Ticker> actual = new ObjectMapper().readValue(json, new TypeReference<Reponse<Ticker>>() {});
		
		System.out.println("actual: " + actual);
	}
	
	@Test
	public void ohlc() throws Exception {
		String json = IOUtils.toString(getClass().getClassLoader().getResourceAsStream("OHLC.json"));
		
		System.out.println("json: " + json);
		
		Reponse<List<OpenHighLowClose>> actual = new ObjectMapper().readValue(json, new TypeReference<Reponse<List<OpenHighLowClose>>>() {});
		
		System.out.println("actual: " + actual);
	}
}
