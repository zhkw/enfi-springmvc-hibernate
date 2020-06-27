package com.cisdi.enfi.pbs.vo;

public class WordExportVO {
	//导出文件类型，1：对内报价，2：费用控制-项目管理部评审人员，3：费用控制-项目管理部生产管理运营室主任，4：费用控制-项目管理计划评审相关人员
	private int Type;
	//pbs版本Id
	private String pbsVersionId;
	//价格明显id
	private String priceListId;
	//版本code
	private String pbsCode;
	//工程项目Id
	private String projectId;
	//上报时间
	private String submitTime;
	//项目路径
	private String basePath;
	
	public String getBasePath() {
		return basePath;
	}
	public void setBasePath(String basePath) {
		this.basePath = basePath;
	}
	public String getSubmitTime() {
		return submitTime;
	}
	public void setSubmitTime(String submitTime) {
		this.submitTime = submitTime;
	}
	public int getType() {
		return Type;
	}
	public void setType(int type) {
		Type = type;
	}
	public String getPbsVersionId() {
		return pbsVersionId;
	}
	public void setPbsVersionId(String pbsVersionId) {
		this.pbsVersionId = pbsVersionId;
	}
	public String getPriceListId() {
		return priceListId;
	}
	public void setPriceListId(String priceListId) {
		this.priceListId = priceListId;
	}
	public String getPbsCode() {
		return pbsCode;
	}
	public void setPbsCode(String pbsCode) {
		this.pbsCode = pbsCode;
	}
	public String getProjectId() {
		return projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}
	

}
