package com.cisdi.enfi.pbs.vo;
/**
 * @author Jancheng 016114
 * @version 
 * class description：造价指标库属性查询VO
 */
public class SearchPbsCostAttrVO {

	private String attrId;//属性ID
	private boolean isStrFlag;//是否为字符串值
	private String value;//如果为字符串存在值
	private double minValue;//最小值
	private double maxValue;//最大值
	public String getAttrId() {
		return attrId;
	}
	public void setAttrId(String attrId) {
		this.attrId = attrId;
	}
	public boolean getIsStrFlag() {
		return isStrFlag;
	}
	public void setIsStrFlag(boolean isStrFlag) {
		this.isStrFlag = isStrFlag;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public double getMinValue() {
		return minValue;
	}
	public void setMinValue(double minValue) {
		this.minValue = minValue;
	}
	public double getMaxValue() {
		return maxValue;
	}
	public void setMaxValue(double maxValue) {
		this.maxValue = maxValue;
	}
	
}



