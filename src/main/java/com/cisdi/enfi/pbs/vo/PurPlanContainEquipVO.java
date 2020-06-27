package com.cisdi.enfi.pbs.vo;
/**
 * 采购包包含设备工具类
 * @author dongshun
 *
 */
public class PurPlanContainEquipVO {
  
	private String projectId;
	// 采购包ID
	private String purPlanId;
	//清单明细id或物料id  多个逗号隔开
	private String ids;
	//pbs节点Id
	private String pbsId;
	//物料Id
	private String materialId;
	//pbs节点名称
	private String pbsNode;
	//专业Id
	private String majorId;
	//包含数量
	private int includeQty;
	//参数
	private String description;

	private Double pbsCode;
	
	public String getProjectId() {
		return projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}
	public String getPurPlanId() {
		return purPlanId;
	}
	public void setPurPlanId(String purPlanId) {
		this.purPlanId = purPlanId;
	}
	public String getIds() {
		return ids;
	}
	public void setIds(String ids) {
		this.ids = ids;
	}
	public String getPbsId() {
		return pbsId;
	}
	public void setPbsId(String pbsId) {
		this.pbsId = pbsId;
	}
	public String getMaterialId() {
		return materialId;
	}
	public void setMaterialId(String materialId) {
		this.materialId = materialId;
	}
	public String getPbsNode() {
		return pbsNode;
	}
	public void setPbsNode(String pbsNode) {
		this.pbsNode = pbsNode;
	}
	public String getMajorId() {
		return majorId;
	}
	public void setMajorId(String majorId) {
		this.majorId = majorId;
	}
	public int getIncludeQty() {
		return includeQty;
	}
	public void setIncludeQty(int includeQty) {
		this.includeQty = includeQty;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPbsCode() {
		return pbsCode;
	}

	public void setPbsCode(Double pbsCode) {
		this.pbsCode = pbsCode;
	}
}
