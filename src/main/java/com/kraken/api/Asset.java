package com.kraken.api;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Asset {
	private String altName;
	private String classBase;
	private String base;
	private String classQuote;
	private String quote;
	private String lot;
	private int pairDecimals;
	private int lotDecimals;
	private int lotMultiplier;
	private int leverageBuy[];
	private int leverageSell[];
	private int fees[][];
	private int feesMaker[][];
	private String feeVolumeCurrency;
	private int marginCall;
	private int marginStop;
	
	@SuppressWarnings("unused")
	private Asset() {
		this(null, null, null, null, null, null, 0, 0, 0, null, null, null, null, null, 0, 0);
	}

	public Asset(String altName, String classBase, String base, String classQuote, String quote, String lot,
				 int pairDecimals, int lotDecimals, int lotMultiplier, int[] leverageBuy, int[] leverageSell,
				 int[][] fees, int[][] feesMaker, String feeVolumeCurrency, int marginCall, int marginStop) {
		this.altName = altName;
		this.classBase = classBase;
		this.base = base;
		this.classQuote = classQuote;
		this.quote = quote;
		this.lot = lot;
		this.pairDecimals = pairDecimals;
		this.lotDecimals = lotDecimals;
		this.lotMultiplier = lotMultiplier;
		this.leverageBuy = leverageBuy;
		this.leverageSell = leverageSell;
		this.fees = fees;
		this.feesMaker = feesMaker;
		this.feeVolumeCurrency = feeVolumeCurrency;
		this.marginCall = marginCall;
		this.marginStop = marginStop;
	}

	@JsonProperty("altname")
	public String getAltName() {
		return altName;
	}

	@JsonProperty("aclass_base")
	public String getClassBase() {
		return classBase;
	}

	@JsonProperty("base")
	public String getBase() {
		return base;
	}

	@JsonProperty("aclass_quote")
	public String getClassQuote() {
		return classQuote;
	}

	@JsonProperty("quote")
	public String getQuote() {
		return quote;
	}

	@JsonProperty("lot")
	public String getLot() {
		return lot;
	}

	@JsonProperty("pair_decimals")
	public int getPairDecimals() {
		return pairDecimals;
	}

	@JsonProperty("lot_decimals")
	public int getLotDecimals() {
		return lotDecimals;
	}

	@JsonProperty("lot_multiplier")
	public int getLotMultiplier() {
		return lotMultiplier;
	}

	@JsonProperty("leverage_buy")
	public int[] getLeverageBuy() {
		return leverageBuy;
	}

	@JsonProperty("leverage_sell")
	public int[] getLeverageSell() {
		return leverageSell;
	}

	@JsonProperty("fees")
	public int[][] getFees() {
		return fees;
	}

	@JsonProperty("fees_maker")
	public int[][] getFeesMaker() {
		return feesMaker;
	}

	@JsonProperty("fee_volume_currency")
	public String getFeeVolumeCurrency() {
		return feeVolumeCurrency;
	}

	@JsonProperty("margin_call")
	public int getMarginCall() {
		return marginCall;
	}

	@JsonProperty("margin_stop")
	public int getMarginStop() {
		return marginStop;
	}
	
	@Override
	public String toString() {
		return new ToStringBuilder(this)
				.append("altName", altName)
				.append("classBase", classBase)
				.append("base", base)
				.append("classQuote", classQuote)
				.append("quote", quote)
				.append("lot", lot)
				.append("pairDecimals", pairDecimals)
				.append("lotDecimals", lotDecimals)
				.append("lotMultiplier", lotMultiplier)
				.append("leverageBuy", leverageBuy)
				.append("leverageSell", leverageSell)
				.append("fees", fees)
				.append("feesMaker", feesMaker)
				.append("feeVolumeCurrency", feeVolumeCurrency)
				.append("marginCall", marginCall)
				.append("marginStop", marginStop)
				.toString();
	}
}
