package com.cisdi.enfi.pbs.vo;
/**
 * @author Jancheng 016114
 * @version 
 * class description
 */
public class Pbs_DesignOrOtherPlanVO {
	private String id;
	private String code;
	private String name;
	private String content;
	private String majorId;
	private int status;
	private String planVersionId;
	private String remark;
	private String reason;
	private Double price;
	private String type;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getMajorId() {
		return majorId;
	}
	public void setMajorId(String majorId) {
		this.majorId = majorId;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getPlanVersionId() {
		return planVersionId;
	}
	public void setPlanVersionId(String planVersionId) {
		this.planVersionId = planVersionId;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
}



