package com.cisdi.enfi.pbs.vo;
/**
 * @author Jancheng 016114
 * @version 
 * class description
 */
public class PbsNodeVO {
	private String id;
	private String prjMmId;
	private String versionId;
	private String nodeCode;
	private Double qty;
	private String qtyUnitId;
	private String usage;
	private String prjMaterialName;
	private String remark;
	private String productScheme;
	private String processScheme;
	private Integer editStatus;
	private String parentId;
	private String flag;
	
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	public String getParentId() {
		return parentId;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	public Integer getEditStatus() {
		return editStatus;
	}
	public void setEditStatus(Integer editStatus) {
		this.editStatus = editStatus;
	}
	public String getProductScheme() {
		return productScheme;
	}
	public void setProductScheme(String productScheme) {
		this.productScheme = productScheme;
	}
	public String getProcessScheme() {
		return processScheme;
	}
	public void setProcessScheme(String processScheme) {
		this.processScheme = processScheme;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
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
	public String getVersionId() {
		return versionId;
	}
	public void setVersionId(String versionId) {
		this.versionId = versionId;
	}
	public String getNodeCode() {
		return nodeCode;
	}
	public void setNodeCode(String nodeCode) {
		this.nodeCode = nodeCode;
	}
	public Double getQty() {
		return qty;
	}
	public void setQty(Double qty) {
		this.qty = qty;
	}
	public String getQtyUnitId() {
		return qtyUnitId;
	}
	public void setQtyUnitId(String qtyUnitId) {
		this.qtyUnitId = qtyUnitId;
	}
	public String getUsage() {
		return usage;
	}
	public void setUsage(String usage) {
		this.usage = usage;
	}
	public String getPrjMaterialName() {
		return prjMaterialName;
	}
	public void setPrjMaterialName(String prjMaterialName) {
		this.prjMaterialName = prjMaterialName;
	}

}



