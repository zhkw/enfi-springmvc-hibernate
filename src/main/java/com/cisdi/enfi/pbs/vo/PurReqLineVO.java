package com.cisdi.enfi.pbs.vo;

import java.util.Date;

public class PurReqLineVO {

	private String projectId;
	// 1 增加 2修改
	private int optType;
	//采购类型
	private String type;
	// 请购单ID
	private String purReqId;
	//请购行ID
	private String purReqLineId;
	//清单ID
	private String listId;
	//清单明细id或物料id  多个逗号隔开
	private String ids;
	//项目物料id
	private String mmId;
	//关联预算ID
	private String budgetId;
	//关联预算子项ID
	private String nodeId;
	//设备位号
	private String equipNum;
	//请购数量
	private double qty;
	//单位ID
	private String unitId;
	//到货日期
	private Date arriveDate;
	//备注
	private String remark;
	//是否选自固化版本
	private Boolean isComeFromPbs;
	//管理类型ID
	private String mngTypeId;
	//施工分包计划明细ID
	private String constructPlanDetailId;
	//项目物料名称 设计劳务名称
	private String name;
	//设计劳务分包内容
	private String content;
	//专业ID
	private String majorId;
	//采购经理指定的所属唯一采购包
	private String uniquePurPlan;

	public String getUniquePurPlan() {
		return uniquePurPlan;
	}

	public void setUniquePurPlan(String uniquePurPlan) {
		this.uniquePurPlan = uniquePurPlan;
	}

	public String getProjectId() {
		return projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}
	public int getOptType() {
		return optType;
	}
	public void setOptType(int optType) {
		this.optType = optType;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPurReqId() {
		return purReqId;
	}
	public void setPurReqId(String purReqId) {
		this.purReqId = purReqId;
	}
	public String getPurReqLineId() {
		return purReqLineId;
	}
	public void setPurReqLineId(String purReqLineId) {
		this.purReqLineId = purReqLineId;
	}
	public String getListId() {
		return listId;
	}
	public void setListId(String listId) {
		this.listId = listId;
	}
	public String getIds() {
		return ids;
	}
	public void setIds(String ids) {
		this.ids = ids;
	}
	public String getMmId() {
		return mmId;
	}
	public void setMmId(String mmId) {
		this.mmId = mmId;
	}
	public String getBudgetId() {
		return budgetId;
	}
	public void setBudgetId(String budgetId) {
		this.budgetId = budgetId;
	}
	public String getNodeId() {
		return nodeId;
	}
	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
	}
	public String getEquipNum() {
		return equipNum;
	}
	public void setEquipNum(String equipNum) {
		this.equipNum = equipNum;
	}
	public double getQty() {
		return qty;
	}
	public void setQty(double qty) {
		this.qty = qty;
	}
	public String getUnitId() {
		return unitId;
	}
	public void setUnitId(String unitId) {
		this.unitId = unitId;
	}
	public Date getArriveDate() {
		return arriveDate;
	}
	public void setArriveDate(Date arriveDate) {
		this.arriveDate = arriveDate;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Boolean getIsComeFromPbs() {
		return isComeFromPbs;
	}
	public void setIsComeFromPbs(Boolean isComeFromPbs) {
		this.isComeFromPbs = isComeFromPbs;
	}
	public String getMngTypeId() {
		return mngTypeId;
	}
	public void setMngTypeId(String mngTypeId) {
		this.mngTypeId = mngTypeId;
	}
	public String getConstructPlanDetailId() {
		return constructPlanDetailId;
	}
	public void setConstructPlanDetailId(String constructPlanDetailId) {
		this.constructPlanDetailId = constructPlanDetailId;
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

	public Boolean getComeFromPbs() {
		return isComeFromPbs;
	}

	public void setComeFromPbs(Boolean comeFromPbs) {
		isComeFromPbs = comeFromPbs;
	}
}
