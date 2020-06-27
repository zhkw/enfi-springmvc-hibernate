package com.cisdi.enfi.pbs.vo;
/**
 * @author Jancheng 016114
 * @version 
 * class description 造价指标库查询信息VO
 */
public class SearchPbsCostInfoVO {

	private String projectId;//项目ID
	private String stageId;//阶段ID
	private String scopeId;//范围ID
	private String projNameOrCode;//项目名字或者编码
	private String productTypeId;//产品类型ID
	private String productScheme;//产品方案
	private double minQty;//最小规模
	private double maxQty;//最大规模
	private String parentId;//父节点ID
	private String areaName;//区域名
	private String pbsName;//子项名
	private String costTypeId;//费用类型
	private String manageTypeId;//管理类型
	private String majorId;//专业Id
	private int pageNum;//页数
	private int pageSize;//每页大小

	public String getManageTypeId() {
		return manageTypeId;
	}

	public void setManageTypeId(String manageTypeId) {
		this.manageTypeId = manageTypeId;
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public String getCostTypeId() {
		return costTypeId;
	}
	public void setCostTypeId(String costTypeId) {
		this.costTypeId = costTypeId;
	}
	public String getMajorId() {
		return majorId;
	}
	public void setMajorId(String majorId) {
		this.majorId = majorId;
	}
	public String getPbsName() {
		return pbsName;
	}
	public void setPbsName(String pbsName) {
		this.pbsName = pbsName;
	}
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	public String getParentId() {
		return parentId;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	public String getProjectId() {
		return projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}
	public String getStageId() {
		return stageId;
	}
	public void setStageId(String stageId) {
		this.stageId = stageId;
	}
	public String getScopeId() {
		return scopeId;
	}
	public void setScopeId(String scopeId) {
		this.scopeId = scopeId;
	}
	public String getProjNameOrCode() {
		return projNameOrCode;
	}
	public void setProjNameOrCode(String projNameOrCode) {
		this.projNameOrCode = projNameOrCode;
	}
	public String getProductTypeId() {
		return productTypeId;
	}
	public void setProductTypeId(String productTypeId) {
		this.productTypeId = productTypeId;
	}
	public String getProductScheme() {
		return productScheme;
	}
	public void setProductScheme(String productScheme) {
		this.productScheme = productScheme;
	}
	public double getMinQty() {
		return minQty;
	}
	public void setMinQty(double minQty) {
		this.minQty = minQty;
	}
	public double getMaxQty() {
		return maxQty;
	}
	public void setMaxQty(double maxQty) {
		this.maxQty = maxQty;
	}
	
}



