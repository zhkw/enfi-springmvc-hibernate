package com.cisdi.enfi.pbs.vo;


public class pbsCostTargetVO{

	
	private double num;//单个数值
	private double numStart;//起始范围
	private double numEnd;//结束范围
	private String dValue;//非数值
	private String attrId;//属性id
	
	
	public double getNum()
	{
		return num;
	}
	public void setNum(double num)
	{
		this.num = num;
	}
	public double getNumStart()
	{
		return numStart;
	}
	public void setNumStart(double numStart)
	{
		this.numStart = numStart;
	}
	public double getNumEnd()
	{
		return numEnd;
	}
	public void setNumEnd(double numEnd)
	{
		this.numEnd = numEnd;
	}
	public String getdValue()
	{
		return dValue;
	}
	public void setdValue(String dValue)
	{
		this.dValue = dValue;
	}
	public String getAttrId()
	{
		return attrId;
	}
	public void setAttrId(String attrId)
	{
		this.attrId = attrId;
	}
}
