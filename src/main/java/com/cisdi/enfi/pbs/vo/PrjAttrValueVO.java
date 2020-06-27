package com.cisdi.enfi.pbs.vo;

public class PrjAttrValueVO {
	
	private String id;
	private String attrId;
	private String attrValue;
	private String attrUnitName;
	private String attrUnitId;
	private String prjMmId;
	private String flag;
	
	public String getAttrUnitName() {
		return attrUnitName;
	}
	public void setAttrUnitName(String attrUnitName) {
		this.attrUnitName = attrUnitName;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAttrId() {
		return attrId;
	}
	public void setAttrId(String attrId) {
		this.attrId = attrId;
	}
	public String getAttrValue() {
		return attrValue;
	}
	public void setAttrValue(String attrValue) {
		this.attrValue = attrValue;
	}
	public String getAttrUnitId() {
		return attrUnitId;
	}
	public void setAttrUnitId(String attrUnitId) {
		this.attrUnitId = attrUnitId;
	}
	public String getPrjMmId() {
		return prjMmId;
	}
	public void setPrjMmId(String prjMmId) {
		this.prjMmId = prjMmId;
	}
	
}
