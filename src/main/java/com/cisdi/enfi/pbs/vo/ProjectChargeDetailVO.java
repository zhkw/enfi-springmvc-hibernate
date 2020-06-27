package com.cisdi.enfi.pbs.vo;

public class ProjectChargeDetailVO {

	private String id;
	private String priceListId;
	private String expenseTypeId;
	private String remark;
	private Double price;
	private Double ratio;
	private Integer scope;
	private String approvePrice;
	private String approvedPrice;
	private Boolean isModified;
	private Boolean isDefault;
	private Boolean isComputed;
	private Double historicPrice;
	public Double getRatio() {
		return ratio;
	}
	public void setRatio(Double ratio) {
		this.ratio = ratio;
	}
	public Integer getScope() {
		return scope;
	}
	public void setScope(Integer scope) {
		this.scope = scope;
	}
	public Boolean getIsComputed() {
		return isComputed;
	}
	public void setIsComputed(Boolean isComputed) {
		this.isComputed = isComputed;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
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
	public Double getHistoricPrice() {
		return historicPrice;
	}
	public void setHistoricPrice(Double historicPrice) {
		this.historicPrice = historicPrice;
	}
}
