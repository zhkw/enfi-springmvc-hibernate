package com.cisdi.enfi.pbs.vo;
/**
 * 总报价表导出Excel扩展类
 * @author dongshun
 *
 */
public class TotalPriceExcelVO {

	//序号
	private String sequence;
	//工程和费用名称
	private String projCostName;
	//建筑工程费
	private String constCost;
	//设备购置费
	private String purchaseCost;
	//设备安装费
	private String installCost;
	//材料及材料安装费
	private String materialCost;
	//总价值
	private String totleCost;
	
	//*******1、********
	//美元
	private String USACost;
	//折合人民币
	private String CANCost;
	
	//*******2、********
	//单位
	private String unit;
	//数量
	private String number;
	//单位价值
	private String unitCost;
	
	//占投资
	private String invest;

	public String getSequence() {
		return sequence;
	}

	public void setSequence(String sequence) {
		this.sequence = sequence;
	}

	public String getProjCostName() {
		return projCostName;
	}

	public void setProjCostName(String projCostName) {
		this.projCostName = projCostName;
	}

	public String getConstCost() {
		return constCost;
	}

	public void setConstCost(String constCost) {
		this.constCost = constCost;
	}

	public String getPurchaseCost() {
		return purchaseCost;
	}

	public void setPurchaseCost(String purchaseCost) {
		this.purchaseCost = purchaseCost;
	}

	public String getInstallCost() {
		return installCost;
	}

	public void setInstallCost(String installCost) {
		this.installCost = installCost;
	}

	public String getMaterialCost() {
		return materialCost;
	}

	public void setMaterialCost(String materialCost) {
		this.materialCost = materialCost;
	}

	public String getTotleCost() {
		return totleCost;
	}

	public void setTotleCost(String totleCost) {
		this.totleCost = totleCost;
	}

	public String getUSACost() {
		return USACost;
	}

	public void setUSACost(String uSACost) {
		USACost = uSACost;
	}

	public String getCANCost() {
		return CANCost;
	}

	public void setCANCost(String cANCost) {
		CANCost = cANCost;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getUnitCost() {
		return unitCost;
	}

	public void setUnitCost(String unitCost) {
		this.unitCost = unitCost;
	}

	public String getInvest() {
		return invest;
	}

	public void setInvest(String invest) {
		this.invest = invest;
	}
	
	
}
