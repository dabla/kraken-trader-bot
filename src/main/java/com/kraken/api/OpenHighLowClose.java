package com.kraken.api;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonFormat(shape = JsonFormat.Shape.ARRAY)
public class OpenHighLowClose {
	private final long time;
	private final double open;
	private final double high;
	private final double low;
	private final double close;
	private final double vwap;
	private final double volume;
	private final int count;
	
	@SuppressWarnings("unused")
	private OpenHighLowClose() {
		this(0, 0, 0, 0, 0, 0, 0, 0);
	}
	
	public OpenHighLowClose(@JsonProperty(index = 0) long time,
							@JsonProperty(index = 1) double open,
							@JsonProperty(index = 2) double high,
							@JsonProperty(index = 3) double low,
							@JsonProperty(index = 4) double close,
							@JsonProperty(index = 5) double vwap,
							@JsonProperty(index = 6) double volume,
							@JsonProperty(index = 7) int count) {
		this.time = time;
		this.open = open;
		this.high = high;
		this.low = low;
		this.close = close;
		this.vwap = vwap;
		this.volume = volume;
		this.count = count;
	}

	public long getTime() {
		return time;
	}

	public double getOpen() {
		return open;
	}

	public double getHigh() {
		return high;
	}

	public double getLow() {
		return low;
	}

	public double getClose() {
		return close;
	}

	public double getVwap() {
		return vwap;
	}

	public double getVolume() {
		return volume;
	}

	public int getCount() {
		return count;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this)
			    .append("time", time)
				.append("open", open)
				.append("high", high)
				.append("low", low)
				.append("close", close)
				.append("vwap", vwap)
				.append("volume", volume)
				.append("count", count)
				.toString();
	}
}
