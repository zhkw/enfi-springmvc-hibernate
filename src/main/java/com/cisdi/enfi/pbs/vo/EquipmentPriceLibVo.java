package com.cisdi.enfi.pbs.vo;


/**
 * 
* <p>Title:设备指标库工具类 </p>
* <p>Description: </p>
* <p>Company: </p> 
* @author Proem_ds
* @date 2017年3月13日 下午3:58:26
 */
public class EquipmentPriceLibVo {
	
	/**
	 * 组合查询条件
	 * start
	 */
	private String materialTypeId;//物料类型ID
	private String materialKey;//物料名称/编码/规格型号	
	private String ProjKey;//项目名称/编码	
	private String priceSrc;//价格来源	
	private String productType;//产品类型	
	private String contractKey;//合同名称/编号
	private String supplierKey;//供应商名称/编号
	private String subItemName;//子项名称
	private String majorNameKey;//专业名称
	private String startTime;//价格日期起
	private String endTime;//价格日期止
	private String isHand;
	/**
	 * 组合查询条件
	 * end
	 */	
	private String id;
	private String projectId;//项目id
	private String pbsNodeId;//pbs节点ID
	private String mmId;//标准物料ID
	private String prjMmName;//项目物料名称
	private String prjMmId;//项目物料Id
	private String majorId;//专业
	private String description;//扩展描述
	private String unitId;//单位
	private String quantity;//数量 
	private String unitWeight;//单重 
	private String sumWeight;//总重 	
	private String elecMach;//电机(kw/台)  		
	private String elecMachNum;//电机总数 
	private String currencyId;//币种ID 	
	private String exchangeRate;//汇率 
	private String unitPrice;// 含税 单价（万） 
	private String taxRate;//税率 
	private String sumPrice;//含税总价（万）
	private String sumNotPrice;//不含税总价（万） 
	private String isImport;//国产/进口设备  
	private String isFabCost;//是否含安装费  
	private String priceTime;//价格日期 
	private String channel;//渠道 
	private String supplierId;//供应商 Id
	private String supplierName;//供应商 名称
	public String getSupplierName() {
		return supplierName;
	}
	public String getIsHand() {
		return isHand;
	}
	public void setIsHand(String isHand) {
		this.isHand = isHand;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	private String demo;//备注 	
	private String stageId;//阶段
	private int page;//分页用：第几页
	private int pageSize;//分页用：每页条数
	
	public String getStageId() {
		return stageId;
	}
	public void setStageId(String stageId) {
		this.stageId = stageId;
	}
	public String getMaterialTypeId() {
		return materialTypeId;
	}
	public void setMaterialTypeId(String materialTypeId) {
		this.materialTypeId = materialTypeId;
	}
	public String getMaterialKey() {
		return materialKey;
	}
	public void setMaterialKey(String materialKey) {
		this.materialKey = materialKey;
	}
	public String getMajorNameKey() {
		return majorNameKey;
	}
	public void setMajorNameKey(String majorNameKey) {
		this.majorNameKey = majorNameKey;
	}
	public String getProjKey() {
		return ProjKey;
	}
	public void setProjKey(String projKey) {
		ProjKey = projKey;
	}
	public String getPriceSrc() {
		return priceSrc;
	}
	public void setPriceSrc(String priceSrc) {
		this.priceSrc = priceSrc;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getContractKey() {
		return contractKey;
	}
	public void setContractKey(String contractKey) {
		this.contractKey = contractKey;
	}
	public String getSupplierKey() {
		return supplierKey;
	}
	public void setSupplierKey(String supplierKey) {
		this.supplierKey = supplierKey;
	}
	public String getSubItemName() {
		return subItemName;
	}
	public void setSubItemName(String subItemName) {
		this.subItemName = subItemName;
	}
	public String getMajorId() {
		return majorId;
	}
	public void setMajorId(String majorId) {
		this.majorId = majorId;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getProjectId() {
		return projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}
	public String getPbsNodeId() {
		return pbsNodeId;
	}
	public void setPbsNodeId(String pbsNodeId) {
		this.pbsNodeId = pbsNodeId;
	}
	public String getMmId() {
		return mmId;
	}
	public void setMmId(String mmId) {
		this.mmId = mmId;
	}
	public String getPrjMmName() {
		return prjMmName;
	}
	public void setPrjMmName(String prjMmName) {
		this.prjMmName = prjMmName;
	}
	public String getPrjMmId() {
		return prjMmId;
	}
	public void setPrjMmId(String prjMmId) {
		this.prjMmId = prjMmId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getUnitId() {
		return unitId;
	}
	public void setUnitId(String unitId) {
		this.unitId = unitId;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getUnitWeight() {
		return unitWeight;
	}
	public void setUnitWeight(String unitWeight) {
		this.unitWeight = unitWeight;
	}
	public String getSumWeight() {
		return sumWeight;
	}
	public void setSumWeight(String sumWeight) {
		this.sumWeight = sumWeight;
	}
	public String getElecMach() {
		return elecMach;
	}
	public void setElecMach(String elecMach) {
		this.elecMach = elecMach;
	}
	public String getElecMachNum() {
		return elecMachNum;
	}
	public void setElecMachNum(String elecMachNum) {
		this.elecMachNum = elecMachNum;
	}
	public String getCurrencyId() {
		return currencyId;
	}
	public void setCurrencyId(String currencyId) {
		this.currencyId = currencyId;
	}
	public String getExchangeRate() {
		return exchangeRate;
	}
	public void setExchangeRate(String exchangeRate) {
		this.exchangeRate = exchangeRate;
	}
	public String getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(String unitPrice) {
		this.unitPrice = unitPrice;
	}
	public String getTaxRate() {
		return taxRate;
	}
	public void setTaxRate(String taxRate) {
		this.taxRate = taxRate;
	}
	public String getSumPrice() {
		return sumPrice;
	}
	public void setSumPrice(String sumPrice) {
		this.sumPrice = sumPrice;
	}
	public String getSumNotPrice() {
		return sumNotPrice;
	}
	public void setSumNotPrice(String sumNotPrice) {
		this.sumNotPrice = sumNotPrice;
	}
	public String getIsImport() {
		return isImport;
	}
	public void setIsImport(String isImport) {
		this.isImport = isImport;
	}
	public String getIsFabCost() {
		return isFabCost;
	}
	public void setIsFabCost(String isFabCost) {
		this.isFabCost = isFabCost;
	}
	public String getPriceTime() {
		return priceTime;
	}
	public void setPriceTime(String priceTime) {
		this.priceTime = priceTime;
	}
	public String getChannel() {
		return channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}
	public String getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}
	public String getDemo() {
		return demo;
	}
	public void setDemo(String demo) {
		this.demo = demo;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
}
