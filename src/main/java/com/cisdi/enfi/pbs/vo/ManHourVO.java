package com.cisdi.enfi.pbs.vo;

public class ManHourVO {
	
	private String projectId;//项目id
	private String wbsNodeId;//wbs节点ID
	private String pbsNodeId;//pbs节点ID
	private String pbsVersionId;//pbs版本ID
	private int versionType;//   设计：1，采购：2，施工：3，项目管理：4
	private int manHourType;// 工时type 出差：1，管理：2  工作：3
	private String manHourSumId; //工时汇总id
	private Double workHour; //工作工时
	private Double manageHour; //管理工时
	private Double tripHour; //出差工时
	private int isWorkEnabled;//是否启用工作人工时
	private int isManageEnabled;//是否启用管理人工时
	private int isTripEnabled;//是否启用出差人工时
	private int isFreeAccrued;//是否免计提
	private int unpredictableHour;//人工费不可预算
	private int rewardHour;//奖励工时预算
	private int marketingCost;//市场费用预算
	private String manHourPriceType;//工时单价类型
	private String manHourPriceName;//工时单价名称
	private int majorType;//专业类型
	private int page;
	private int rows;
	private String tag;//add ，update
	private int mgnType;//管理工时类型  1:设计管理工时，2：采购管理，3：施工管理
	private String key;
	private String remark;//备注
	
	public int getMgnType() {
		return mgnType;
	}
	public void setMgnType(int mgnType) {
		this.mgnType = mgnType;
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
	public int getVersionType() {
		return versionType;
	}
	public void setVersionType(int versionType) {
		this.versionType = versionType;
	}
	public int getManHourType() {
		return manHourType;
	}
	public void setManHourType(int manHourType) {
		this.manHourType = manHourType;
	}
	
	public String getManHourSumId() {
		return manHourSumId;
	}
	public void setManHourSumId(String manHourSumId) {
		this.manHourSumId = manHourSumId;
	}
	public Double getWorkHour() {
		return workHour;
	}
	public void setWorkHour(Double workHour) {
		this.workHour = workHour;
	}
	public Double getManageHour() {
		return manageHour;
	}
	public void setManageHour(Double manageHour) {
		this.manageHour = manageHour;
	}
	public Double getTripHour() {
		return tripHour;
	}
	public void setTripHour(Double tripHour) {
		this.tripHour = tripHour;
	}
	public int getIsWorkEnabled() {
		return isWorkEnabled;
	}
	public void setIsWorkEnabled(int isWorkEnabled) {
		this.isWorkEnabled = isWorkEnabled;
	}
	public int getIsManageEnabled() {
		return isManageEnabled;
	}
	public void setIsManageEnabled(int isManageEnabled) {
		this.isManageEnabled = isManageEnabled;
	}
	public int getIsTripEnabled() {
		return isTripEnabled;
	}
	public void setIsTripEnabled(int isTripEnabled) {
		this.isTripEnabled = isTripEnabled;
	}
	public int getUnpredictableHour() {
		return unpredictableHour;
	}
	public void setUnpredictableHour(int unpredictableHour) {
		this.unpredictableHour = unpredictableHour;
	}
	public int getRewardHour() {
		return rewardHour;
	}
	public void setRewardHour(int rewardHour) {
		this.rewardHour = rewardHour;
	}
	public int getMarketingCost() {
		return marketingCost;
	}
	public void setMarketingCost(int marketingCost) {
		this.marketingCost = marketingCost;
	}
	public String getManHourPriceType() {
		return manHourPriceType;
	}
	public void setManHourPriceType(String manHourPriceType) {
		this.manHourPriceType = manHourPriceType;
	}
	public String getManHourPriceName() {
		return manHourPriceName;
	}
	public void setManHourPriceName(String manHourPriceName) {
		this.manHourPriceName = manHourPriceName;
	}
	public int getMajorType() {
		return majorType;
	}
	public void setMajorType(int majorType) {
		this.majorType = majorType;
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
	public String getWbsNodeId() {
		return wbsNodeId;
	}
	public void setWbsNodeId(String wbsNodeId) {
		this.wbsNodeId = wbsNodeId;
	}
	public String getPbsNodeId() {
		return pbsNodeId;
	}
	public void setPbsNodeId(String pbsNodeId) {
		this.pbsNodeId = pbsNodeId;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public int getIsFreeAccrued() {
		return isFreeAccrued;
	}

	public void setIsFreeAccrued(int isFreeAccrued) {
		this.isFreeAccrued = isFreeAccrued;
	}
}
