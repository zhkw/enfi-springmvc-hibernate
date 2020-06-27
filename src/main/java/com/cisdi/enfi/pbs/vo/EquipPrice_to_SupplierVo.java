package com.cisdi.enfi.pbs.vo;
/**
 * 
* <p>Title:EquipPrice_to_Supplier </p>
* <p>Description: </p>
* <p>Company: </p> 
* @author Proem_ds
* @date 2017年3月23日 下午10:28:35
 */

public class EquipPrice_to_SupplierVo {
	private String id;
	private String equipId;//设备Id
	private String isHandInput;//是否手动输入
	private String supplierName;//供应商名称
	private String supplierId;//供应商Id
	private String setSupplierCode;//供应商编号
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEquipId() {
		return equipId;
	}
	public void setEquipId(String equipId) {
		this.equipId = equipId;
	}
	
	public String getIsHandInput() {
		return isHandInput;
	}
	public void setIsHandInput(String isHandInput) {
		this.isHandInput = isHandInput;
	}
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	public String getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}
	public String getSetSupplierCode() {
		return setSupplierCode;
	}
	public void setSetSupplierCode(String setSupplierCode) {
		this.setSupplierCode = setSupplierCode;
	}
	
}
