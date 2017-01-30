package com.auction.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.hibernate.annotations.ManyToAny;
@Entity
public class Bidding {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long biddingId;
	@ManyToOne(fetch=FetchType.LAZY)	
	@JoinColumn(name="assetsid")
	private Assets assetId;
	@OneToOne
	@JoinColumn(name="userId")
	private User userId; //buyer
	private long bidPurposedAmount;
	private Date bidTimeStamp;
	public long getBiddingId() {
		return biddingId;
	}
	public void setBiddingId(long biddingId) {
		this.biddingId = biddingId;
	}
	
	public Assets getAssetId() {
		return assetId;
	}
	public void setAssetId(Assets assetId) {
		this.assetId = assetId;
	}
	public User getUserId() {
		return userId;
	}
	public void setUserId(User userId) {
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
