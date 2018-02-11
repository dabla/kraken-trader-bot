package com.kraken.api;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

//@JsonFormat(shape = JsonFormat.Shape.ARRAY)
//@JsonFormat(with=JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
@JsonFormat(shape = JsonFormat.Shape.ARRAY)
public class OpenHighLowClose {
	private final long time;//	1518244380
	private final double open; //	"7310.1"
	private final double high; //	"7322.7"
	private final double low; //	"7303.7"
	private final double close;	//"7307.3"
	private final double vwap;	//"7318.7"
	private final double volume;	//"4.07407787"
	private final int count;//	30
	
	@SuppressWarnings("unused")
	private OpenHighLowClose() {
		this(0, 0, 0, 0, 0, 0, 0, 0);
	}
	
	//@JsonCreator
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
