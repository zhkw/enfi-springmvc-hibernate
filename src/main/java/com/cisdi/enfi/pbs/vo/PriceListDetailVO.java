package com.cisdi.enfi.pbs.vo;

public class PriceListDetailVO {

	private String id;
	private String prjMmId;
	private String priceListId;
	private String expenseTypeId;
	private Double price;
	private Double ratio;
	private Double discountRate;
	private Boolean isSpecialRatio;
	private Boolean isSpecialDiscount;
	private String remark;
	private String approvePrice;
	private String approvedPrice;
	private Boolean isModified;
	private Boolean isDefault;
	private Boolean isComputed;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPrjMmId() {
		return prjMmId;
	}
	public void setPrjMmId(String prjMmId) {
		this.prjMmId = prjMmId;
	}
	public String getPriceListId() {
		return priceListId;
	}
	public void setPriceListId(String priceListId) {
		this.priceListId = priceListId;
	}
	public String getExpenseTypeId() {
		return expenseTypeId;
	}
	public void setExpenseTypeId(String expenseTypeId) {
		this.expenseTypeId = expenseTypeId;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Double getRatio() {
		return ratio;
	}
	public void setRatio(Double ratio) {
		this.ratio = ratio;
	}
	public Double getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(Double discountRate) {
		this.discountRate = discountRate;
	}
	public Boolean getIsSpecialRatio() {
		return isSpecialRatio;
	}
	public void setIsSpecialRatio(Boolean isSpecialRatio) {
		this.isSpecialRatio = isSpecialRatio;
	}
	public Boolean getIsSpecialDiscount() {
		return isSpecialDiscount;
	}
	public void setIsSpecialDiscount(Boolean isSpecialDiscount) {
		this.isSpecialDiscount = isSpecialDiscount;
	}
	public String getApprovePrice() {
		return approvePrice;
	}
	public void setApprovePrice(String approvePrice) {
		this.approvePrice = approvePrice;
	}
	public String getApprovedPrice() {
		return approvedPrice;
	}
	public void setApprovedPrice(String approvedPrice) {
		this.approvedPrice = approvedPrice;
	}
	public Boolean getIsModified() {
		return isModified;
	}
	public void setIsModified(Boolean isModified) {
		this.isModified = isModified;
	}
	public Boolean getIsDefault() {
		return isDefault;
	}
	public void setIsDefault(Boolean isDefault) {
		this.isDefault = isDefault;
	}
	public Boolean getIsComputed() {
		return isComputed;
	}
	public void setIsComputed(Boolean isComputed) {
		this.isComputed = isComputed;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
}
