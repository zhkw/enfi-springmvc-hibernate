package com.cisdi.enfi.pbs.vo;
/**
 * 采购包策划工具类
* <p>Title:PbsPurPlanVO </p>
* <p>Description: </p>
* <p>Company: </p> 
* @author Proem_ds
* @date 2017年1月23日 下午2:03:02
 */
public class PbsPurPlanVO {

	private String id;
 	//采购包号
	private String code;
	//采购包名
	private String name;
	//价格估算
	private Double estPrice;
	//服务范围
	private String serviceScopeId;
	//采购方式
	private String purTypeId;
	//采购方式选择理由
	private String reason;
	//检验等级
	private String testLevelId;
	//配置标准
	private String configure;
	//拟推荐供应商
	private String recommendSupplier;
	//是否承包合同约定
	private Boolean isInContract;
	//接受请购文件时间
	private String receiveReqFileTime;
	//设备提取时间
	private String equipReqConfirmTime;
	//签订合同时间
	private String contractTime;
	//发货日期
	private String deliveryTime;
	//到货日期
	private String arrivalTime;
	//安装时间
	private String installTime;
	//正规制造周期
	private String manuCycle;
	//状态
	private int status;
	//计划版本ID
	private String planVersionId;
	//进度重点关注
	private Integer focus;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getEstPrice() {
		return estPrice;
	}
	public void setEstPrice(Double estPrice) {
		this.estPrice = estPrice;
	}
	public String getServiceScopeId() {
		return serviceScopeId;
	}
	public void setServiceScopeId(String serviceScopeId) {
		this.serviceScopeId = serviceScopeId;
	}
	public String getPurTypeId() {
		return purTypeId;
	}
	public void setPurTypeId(String purTypeId) {
		this.purTypeId = purTypeId;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getTestLevelId() {
		return testLevelId;
	}
	public void setTestLevelId(String testLevelId) {
		this.testLevelId = testLevelId;
	}
	public String getConfigure() {
		return configure;
	}
	public void setConfigure(String configure) {
		this.configure = configure;
	}
	public String getRecommendSupplier() {
		return recommendSupplier;
	}
	public void setRecommendSupplier(String recommendSupplier) {
		this.recommendSupplier = recommendSupplier;
	}
	
	public Boolean getIsInContract() {
		return isInContract;
	}
	public void setIsInContract(Boolean isInContract) {
		this.isInContract = isInContract;
	}
	public void setFocus(Integer focus) {
		this.focus = focus;
	}
	public String getReceiveReqFileTime() {
		return receiveReqFileTime;
	}
	public void setReceiveReqFileTime(String receiveReqFileTime) {
		this.receiveReqFileTime = receiveReqFileTime;
	}
	public String getEquipReqConfirmTime() {
		return equipReqConfirmTime;
	}
	public void setEquipReqConfirmTime(String equipReqConfirmTime) {
		this.equipReqConfirmTime = equipReqConfirmTime;
	}
	public String getContractTime() {
		return contractTime;
	}
	public void setContractTime(String contractTime) {
		this.contractTime = contractTime;
	}
	public String getDeliveryTime() {
		return deliveryTime;
	}
	public void setDeliveryTime(String deliveryTime) {
		this.deliveryTime = deliveryTime;
	}
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public String getInstallTime() {
		return installTime;
	}
	public void setInstallTime(String installTime) {
		this.installTime = installTime;
	}
	public String getManuCycle() {
		return manuCycle;
	}
	public void setManuCycle(String manuCycle) {
		this.manuCycle = manuCycle;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getPlanVersionId() {
		return planVersionId;
	}
	public void setPlanVersionId(String planVersionId) {
		this.planVersionId = planVersionId;
	}
	public int getFocus() {
		return focus;
	}
	public void setFocus(int focus) {
		this.focus = focus;
	}
	
	
}
