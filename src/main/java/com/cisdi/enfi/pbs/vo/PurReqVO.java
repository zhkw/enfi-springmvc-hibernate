package com.cisdi.enfi.pbs.vo;

public class PurReqVO {

	private String ouId;
	//项目id
	private String projectId;
	//版本ID;
	private String pbsVersionId;
	//关键字  专业/类型/部门/状态等
	private String key;
	//请购单id
	private String purReqId;
	//子项ID
    private String nodeId;
	//物料清单ID
	private String materialListId;
	//专业ID
	private String majorId;
	//页数
	private int page;
	//条数
	private int rows;
	//参数类型 0:采购计划；1：采购申请；2：关联预算
	private int type;
	//标志字段：用于在业务逻辑层判断统计设备剩余数量，采购包包含设备新增页面显示
	private String mark;
	//是否显示剩余数量为零的设备
	private int isShow;
	//显示费用项不为0
	private int isFilter;
	
	public String getOuId() {
		return ouId;
	}
	public void setOuId(String ouId) {
		this.ouId = ouId;
	}
	public int getIsShow() {
		return isShow;
	}
	public void setIsShow(int isShow) {
		this.isShow = isShow;
	}
	public String getMark() {
		return mark;
	}
	public void setMark(String mark) {
		this.mark = mark;
	}
	public String getProjectId() {
		return projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}
	public String getPbsVersionId() {
		return pbsVersionId;
	}
	public void setPbsVersionId(String pbsVersionId) {
		this.pbsVersionId = pbsVersionId;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getPurReqId() {
		return purReqId;
	}
	public void setPurReqId(String purReqId) {
		this.purReqId = purReqId;
	}
	public String getNodeId(){
        return nodeId;
    }
    public void setNodeId(String nodeId){
        this.nodeId = nodeId;
    }
    public String getMaterialListId() {
		return materialListId;
	}
	public void setMaterialListId(String materialListId) {
		this.materialListId = materialListId;
	}
	public String getMajorId() {
		return majorId;
	}
	public void setMajorId(String majorId) {
		this.majorId = majorId;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}

	public int getIsFilter() {
		return isFilter;
	}

	public void setIsFilter(int isFilter) {
		this.isFilter = isFilter;
	}
}
