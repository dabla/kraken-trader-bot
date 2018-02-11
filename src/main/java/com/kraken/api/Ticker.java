package com.kraken.api;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Ticker {
	private final double[] ask;
	private final double[] bid;
	private final double[] lastTradeClosed;
	private final double[] volume;
	private final double[] volumeWeightedAveragePrice;
	private final int[] numberOfTrades;
	private final double[] low;
	private final double[] high;
	private final double openingPrice;
	
	@SuppressWarnings("unused")
	private Ticker() {
		this(null, null, null, null, null, null, null, null, 0);
	}

	@JsonIgnore
	public Ticker(double[] ask, double[] bid, double[] lastTradeClosed, double[] volume,
				  double[] volumeWeightedAveragePrice, int[] numberOfTrades, double[] low,
				  double[] high, double openingPrice) {
		this.ask = ask;
		this.bid = bid;
		this.lastTradeClosed = lastTradeClosed;
		this.volume = volume;
		this.volumeWeightedAveragePrice = volumeWeightedAveragePrice;
		this.numberOfTrades = numberOfTrades;
		this.low = low;
		this.high = high;
		this.openingPrice = openingPrice;
	}

	@JsonProperty("a")
	public double[] getAsk() {
		return ask;
	}

	@JsonProperty("b")
	public double[] getBid() {
		return bid;
	}

	@JsonProperty("c")
	public double[] getLastTradeClosed() {
		return lastTradeClosed;
	}

	@JsonProperty("v")
	public double[] getVolume() {
		return volume;
	}

	@JsonProperty("p")
	public double[] getVolumeWeightedAveragePrice() {
		return volumeWeightedAveragePrice;
	}

	@JsonProperty("t")
	public int[] getNumberOfTrades() {
		return numberOfTrades;
	}

	@JsonProperty("l")
	public double[] getLow() {
		return low;
	}

	@JsonProperty("h")
	public double[] getHigh() {
		return high;
	}

	@JsonProperty("o")
	public double getOpeningPrice() {
		return openingPrice;
	}
	
	@Override
	public String toString() {
		return new ToStringBuilder(this)
				.append("ask", ask)
				.append("bid", bid)
				.append("lastTradeClosed", lastTradeClosed)
				.append("volume", volume)
				.append("volumeWeightedAveragePrice", volumeWeightedAveragePrice)
				.append("numberOfTrades", numberOfTrades)
				.append("low", low)
				.append("high", high)
				.append("openingPrice", openingPrice)
				.toString();
	}
}
