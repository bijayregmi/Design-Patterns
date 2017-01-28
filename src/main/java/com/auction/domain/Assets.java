package com.auction.domain;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.web.multipart.MultipartFile;

import com.auction.enums.Role;
import com.auction.enums.Status;

public class Assets {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long assetId;
	private long categoryId;
	private long userId;
	
	private String name;
	private String model;
	private String brand;
	
	
	private String description;
	
	private long minimumBidAmount;
	private long maximumBidAmount;
	private Date bidStartDate;
	private Date bidEndDate;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "Status")
	private Status status;
	
	MultipartFile image1;
	MultipartFile image2;
	MultipartFile image3;
	public long getAssetId() {
		return assetId;
	}
	public void setAssetId(long assetId) {
		this.assetId = assetId;
	}
	public long getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public long getMinimumBidAmount() {
		return minimumBidAmount;
	}
	public void setMinimumBidAmount(long minimumBidAmount) {
		this.minimumBidAmount = minimumBidAmount;
	}
	public long getMaximumBidAmount() {
		return maximumBidAmount;
	}
	public void setMaximumBidAmount(long maximumBidAmount) {
		this.maximumBidAmount = maximumBidAmount;
	}
	public Date getBidStartDate() {
		return bidStartDate;
	}
	public void setBidStartDate(Date bidStartDate) {
		this.bidStartDate = bidStartDate;
	}
	public Date getBidEndDate() {
		return bidEndDate;
	}
	public void setBidEndDate(Date bidEndDate) {
		this.bidEndDate = bidEndDate;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public MultipartFile getImage1() {
		return image1;
	}
	public void setImage1(MultipartFile image1) {
		this.image1 = image1;
	}
	public MultipartFile getImage2() {
		return image2;
	}
	public void setImage2(MultipartFile image2) {
		this.image2 = image2;
	}
	public MultipartFile getImage3() {
		return image3;
	}
	public void setImage3(MultipartFile image3) {
		this.image3 = image3;
	}
	
}
