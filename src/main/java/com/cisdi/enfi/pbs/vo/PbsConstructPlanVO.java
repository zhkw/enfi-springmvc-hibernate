package com.cisdi.enfi.pbs.vo;

/**
 * @author Jancheng 016114
 * @version 
 * class description
 */
public class PbsConstructPlanVO {
		private String id;
	 	//标段号
		private String code;
		//标段名
		private String name;
		//类型ID
		private String constructTypeId;
		//价格估算
		private Double estPrice;
		//计价方式
		private String costTypeId;
		//标段说明
		private String explain;
		//采购方式
		private String purTypeId;
		//备注
		private String remark;
		//资质要求
		private String qualification;
		//许可要求
		private String permission;
		//拟推荐供应商
		private String recommendSupplier;
		//是否承包合同约定
		private boolean isInContract;
		//招标工作启动
		private String receiveReqFileTime;
		//招标文件发售
		private String contractTime;
		//开标时间
		private String equipReqConfirmTime;
		//评标、定标时间
		private String deliveryTime;
		//签订合同时间
		private String contractTime2;
		//进场时间
		private String arrivalTime;
		//安装时间
		private String installTime;
		//进度备注
		private String progressRemark;
		//状态
		private int status;
		//计划版本ID
		private String planVersionId;
		
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
		public String getConstructTypeId() {
			return constructTypeId;
		}
		public void setConstructTypeId(String constructTypeId) {
			this.constructTypeId = constructTypeId;
		}
		public Double getEstPrice() {
			return estPrice;
		}
		public void setEstPrice(Double estPrice) {
			this.estPrice = estPrice;
		}
		public String getCostTypeId() {
			return costTypeId;
		}
		public void setCostTypeId(String costTypeId) {
			this.costTypeId = costTypeId;
		}
		public String getExplain() {
			return explain;
		}
		public void setExplain(String explain) {
			this.explain = explain;
		}
		public String getPurTypeId() {
			return purTypeId;
		}
		public void setPurTypeId(String purTypeId) {
			this.purTypeId = purTypeId;
		}
		public String getRemark() {
			return remark;
		}
		public void setRemark(String remark) {
			this.remark = remark;
		}
		public String getQualification() {
			return qualification;
		}
		public void setQualification(String qualification) {
			this.qualification = qualification;
		}
		public String getPermission() {
			return permission;
		}
		public void setPermission(String permission) {
			this.permission = permission;
		}
		public String getRecommendSupplier() {
			return recommendSupplier;
		}
		public void setRecommendSupplier(String recommendSupplier) {
			this.recommendSupplier = recommendSupplier;
		}
		public boolean isInContract() {
			return isInContract;
		}
		public void setInContract(boolean isInContract) {
			this.isInContract = isInContract;
		}
		public String getReceiveReqFileTime() {
			return receiveReqFileTime;
		}
		public void setReceiveReqFileTime(String receiveReqFileTime) {
			this.receiveReqFileTime = receiveReqFileTime;
		}
		public String getContractTime() {
			return contractTime;
		}
		public void setContractTime(String contractTime) {
			this.contractTime = contractTime;
		}
		public String getEquipReqConfirmTime() {
			return equipReqConfirmTime;
		}
		public void setEquipReqConfirmTime(String equipReqConfirmTime) {
			this.equipReqConfirmTime = equipReqConfirmTime;
		}
		public String getDeliveryTime() {
			return deliveryTime;
		}
		public void setDeliveryTime(String deliveryTime) {
			this.deliveryTime = deliveryTime;
		}
		public String getContractTime2() {
			return contractTime2;
		}
		public void setContractTime2(String contractTime2) {
			this.contractTime2 = contractTime2;
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
		public String getProgressRemark() {
			return progressRemark;
		}
		public void setProgressRemark(String progressRemark) {
			this.progressRemark = progressRemark;
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
		

}



