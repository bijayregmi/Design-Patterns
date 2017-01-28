package com.auction.domain;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Bidding {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long biddingId;
	private long assetId;
	private long userId; //buyer
	private long bidPurposedAmount;
	private Date bidTimeStamp;
	public long getBiddingId() {
		return biddingId;
	}
	public void setBiddingId(long biddingId) {
		this.biddingId = biddingId;
	}
	public long getAssetId() {
		return assetId;
	}
	public void setAssetId(long assetId) {
		this.assetId = assetId;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public long getBidPurposedAmount() {
		return bidPurposedAmount;
	}
	public void setBidPurposedAmount(long bidPurposedAmount) {
		this.bidPurposedAmount = bidPurposedAmount;
	}
	public Date getBidTimeStamp() {
		return bidTimeStamp;
	}
	public void setBidTimeStamp(Date bidTimeStamp) {
		this.bidTimeStamp = bidTimeStamp;
	}
	
}
