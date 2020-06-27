package com.cisdi.enfi.pbs.vo;

public class MaterialListVO {

	private String id;
	private String name;
	private String pbsNodeId;
	private String majorId;
	private String departmentId;
	private String notificationRemark;
	private Integer status;
	private Integer editStatus;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPbsNodeId() {
		return pbsNodeId;
	}
	public void setPbsNodeId(String pbsNodeId) {
		this.pbsNodeId = pbsNodeId;
	}
	public String getMajorId() {
		return majorId;
	}
	public void setMajorId(String majorId) {
		this.majorId = majorId;
	}
	public String getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}
	public String getNotificationRemark() {
		return notificationRemark;
	}
	public void setNotificationRemark(String notificationRemark) {
		this.notificationRemark = notificationRemark;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getEditStatus() {
		return editStatus;
	}
	public void setEditStatus(Integer editStatus) {
		this.editStatus = editStatus;
	}
}
