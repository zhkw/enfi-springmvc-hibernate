package com.cisdi.enfi.pbs.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * 
* <p>Title:设备指标库实体</p>
* <p>Description: </p>
* <p>Company: </p> 
* @author Proem_ds
* @date 2017年3月9日 上午11:52:33
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name = "pbs_equipmentPrice")
public class EquipmentPrice extends ExtItem {
	
	
	//项目ID projId （项目名称、编码、产品类型）
	@Column(unique=false, nullable=true)
	public String getProjId() {
		return (String)hashAttributes.get("projId");
	}	
	public void setProjId(String projId) {
		hashAttributes.put("projId", projId);
	}
	
	//价格来源 priceSrc （ 1：订货价,2:恩菲报价,3:供应商报价,4:概算价,5:外部渠道）
	@Column(unique=false, nullable=true)
	public String getPriceSrc() {
		return (String)hashAttributes.get("priceSrc");
	}	
	public void setPriceSrc(String priceSrc) {
		hashAttributes.put("priceSrc", priceSrc);
	}
	
	//版本id
	@Column(unique=false, nullable=true)
	public String getVersionId() {
	    return (String)hashAttributes.get("versionId");
	}	
	public void setVersionId(String versionId) {
		hashAttributes.put("versionId", versionId);
	}
	
	//子项ID pbsNodeId（子项名称-物料名称）
	@Column(unique=false, nullable=true)
	public String getPbsNodeId() {
		return (String)hashAttributes.get("pbsNodeId");
	}	
	public void setPbsNodeId(String pbsNodeId) {
		hashAttributes.put("pbsNodeId", pbsNodeId);
	}
	
	//专业 majorId
	@Column(unique=false, nullable=true)
	public String getMajorId() {
		return (String)hashAttributes.get("majorId");
	}	
	public void setMajorId(String majorId) {
		hashAttributes.put("majorId", majorId);
	}
	
	//标准物料ID mmId （标准物料名称、编码、关联到物料分类：物料类别名称、物料类别编码、材质）
	@Column(unique=false, nullable=true)
	public String getMmId() {
		return (String)hashAttributes.get("mmId");
	}	
	public void setMmId(String mmId) {
		hashAttributes.put("mmId", mmId);
	}
	
	//项目物料名称 prjMmName （物料名称 默认为标准物料名称,项目物料）
	@Column(unique=false, nullable=true)
	public String getPrjMmName() {
		return (String)hashAttributes.get("prjMmName");
	}	
	public void setPrjMmName(String prjMmName) {
		hashAttributes.put("prjMmName", prjMmName);
	}
	//项目物料id
	@Column(unique=false, nullable=true)
	public String getPrjMmId() {
		return (String)hashAttributes.get("prjMmId");
	}	
	public void setPrjMmId(String prjMmId) {
		hashAttributes.put("prjMmId", prjMmId);
	}
	
	//单位 unitId
	@Column(unique=false, nullable=true)
	public String getUnitId() {
		return (String)hashAttributes.get("unitId");
	}	
	public void setUnitId(String unitId) {
		hashAttributes.put("unitId", unitId);
	}
	//数量 quantity
	@Column(unique=false, nullable=true)
	public Integer getQuantity() {
		if (hashAttributes.get("quantity") == null) {
			return null;
		} else {
			return Integer.valueOf(hashAttributes.get("quantity").toString());
		}
	}	
	public void setQuantity(Integer quantity) {
		hashAttributes.put("quantity", quantity);
	}
	//单重 unitWeight
	@Column(unique=false, nullable=true)
	public Double getUnitWeight() {
		if (hashAttributes.get("unitWeight") == null) {
			return null;
		} else {
			return Double.valueOf(hashAttributes.get("unitWeight").toString());
		}
	}	
	public void setUnitWeight(Double unitWeight) {
		hashAttributes.put("unitWeight", unitWeight);
	}
	//总重 sumWeight
	@Column(unique=false, nullable=true)
	public Double getSumWeight() {
		if (hashAttributes.get("sumWeight") == null) {
			return null;
		} else {
			return Double.valueOf(hashAttributes.get("sumWeight").toString());
		}
	}	
	public void setSumWeight(Double sumWeight) {
		hashAttributes.put("sumWeight", sumWeight);
	}
	//电机(kw/台)  elecMach
	@Column(unique=false, nullable=true)
	public String getElecMach() {
		return (String)hashAttributes.get("elecMach");
	}	
	public void setElecMach(String elecMach) {
		hashAttributes.put("elecMach", elecMach);
	}	
	//电机总数 elecMachNum
	@Column(unique=false, nullable=true)
	public Integer getElecMachNum() {
		if (hashAttributes.get("elecMachNum") == null) {
			return null;
		} else {
			return Integer.valueOf(hashAttributes.get("elecMachNum").toString());
		}
	}	
	public void setElecMachNum(Integer elecMachNum) {
		hashAttributes.put("elecMachNum", elecMachNum);
	}
	//币种ID currencyId
	@Column(unique=false, nullable=true)
	public String getCurrencyId() {
		return (String)hashAttributes.get("currencyId");
	}	
	public void setCurrencyId(String currencyId) {
		hashAttributes.put("currencyId", currencyId);
	}
	
	//汇率 exchangeRate
	@Column(unique=false, nullable=true)
	public Double getExchangeRate() {
		if (hashAttributes.get("exchangeRate") == null) {
			return null;
		} else {
			return Double.valueOf(hashAttributes.get("exchangeRate").toString());
		}
	}	
	public void setExchangeRate(Double exchangeRate) {
		hashAttributes.put("exchangeRate", exchangeRate);
	}
	// 含税 单价（万） unitPrice
	@Column(unique=false, nullable=true)
	public Double getUnitPrice() {
		if (hashAttributes.get("unitPrice") == null) {
			return null;
		} else {
			return Double.valueOf(hashAttributes.get("unitPrice").toString());
		}
	}	
	public void setUnitPrice(Double unitPrice) {
		hashAttributes.put("unitPrice", unitPrice);
	}
	//税率 taxRate
	@Column(unique=false, nullable=true)
	public Double getTaxRate() {
		if (hashAttributes.get("taxRate") == null) {
			return null;
		} else {
			return Double.valueOf(hashAttributes.get("taxRate").toString());
		}
	}	
	public void setTaxRate(Double taxRate) {
		hashAttributes.put("taxRate", taxRate);
	}
	//含税总价（万）sumPrice
	@Column(unique=false, nullable=true)
	public Double getSumPrice() {
		if (hashAttributes.get("sumPrice") == null) {
			return null;
		} else {
			return Double.valueOf(hashAttributes.get("sumPrice").toString());
		}
	}	
	public void setSumPrice(Double sumPrice) {
		hashAttributes.put("sumPrice", sumPrice);
	}
	//不含税总价（万） sumNotPrice
	@Column(unique=false, nullable=true)
	public Double getSumNotPrice() {
		if (hashAttributes.get("sumNotPrice") == null) {
			return null;
		} else {
			return Double.valueOf(hashAttributes.get("sumNotPrice").toString());
		}
	}	
	public void setSumNotPrice(Double sumNotPrice) {
		hashAttributes.put("sumNotPrice",sumNotPrice);
	}
	//国产/进口设备  isImport
	@Column(unique=false, nullable=true)
	public String getIsImport() {
	    return (String)hashAttributes.get("isImport");
	}	
	public void setIsImport(String isImport) {
		hashAttributes.put("isImport", isImport);
	}
	//是否含安装费  isFabCost
	@Column(unique=false, nullable=true)
	public String getIsFabCost() {
	    return (String)hashAttributes.get("isFabCost");
	}	
	public void setIsFabCost(String isFabCost) {
		hashAttributes.put("isFabCost", isFabCost);
	}
	//价格日期 priceTime
	@Column(unique=false, nullable=true)
	public Date getPriceTime() {
		return (Date)hashAttributes.get("priceTime");
	}
	public void setPriceTime(Date priceTime) {
		hashAttributes.put("priceTime",priceTime);
	}
	
	//渠道 channel
	@Column(unique=false, nullable=true)
	public String getChannel() {
	    return (String)hashAttributes.get("channel");
	}	
	public void setChannel(String channel) {
		hashAttributes.put("channel", channel);
	}
	
	//供应商 supplierId
	@Column(unique=false, nullable=true)
	public String getSupplierId() {
	    return (String)hashAttributes.get("supplierId");
	}	
	public void setSupplierId(String supplierId) {
		hashAttributes.put("supplierId", supplierId);
	}
	
	//备注 demo	
	@Column(unique=false, nullable=true, length=2048)
	public String getDemo() {
	    return (String)hashAttributes.get("demo");
	}	
	public void setDemo(String demo) {
		hashAttributes.put("demo", demo);
	}
	
	//合同编号
	@Column(unique=false, nullable=true)
	public String getContractNo() {
	    return (String)hashAttributes.get("contractNo");
	}	
	public void setContractNo(String contractNo) {
		hashAttributes.put("contractNo", contractNo);
	}
	
	//合同名称
	@Column(unique=false, nullable=true)
	public String getContractName() {
	    return (String)hashAttributes.get("contractName");
	}	
	public void setContractName(String contractName) {
		hashAttributes.put("contractName", contractName);
	}
	
	//阶段
	@Column(unique=false, nullable=true)
	public String getStageId() {
	    return (String)hashAttributes.get("stageId");
	}	
	public void setStageId(String stageId) {
		hashAttributes.put("stageId", stageId);
	}
	//pbs编码
	@Column(unique=false, nullable=true)
	public String getPbsCode() {
	    return (String)hashAttributes.get("pbsCode");
	}	
	public void setPbsCode(String pbsCode) {
		hashAttributes.put("pbsCode", pbsCode);
	}
	
	
}
