package com.cisdi.enfi.pbs.vo;
/**
 * @author Jancheng 016114
 * @version 
 * class description
 */
public class Pbs_suppliersVO {
	private String id;
	private String constructPlanId;
	private boolean isHandInput;
	private String name;
	private boolean isInContract;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getConstructPlanId() {
		return constructPlanId;
	}
	public void setConstructPlanId(String constructPlanId) {
		this.constructPlanId = constructPlanId;
	}
	public boolean getIsHandInput() {
		return isHandInput;
	}
	public void setIsHandInput(boolean isHandInput) {
		this.isHandInput = isHandInput;
	}
	public boolean getIsInContract() {
		return isInContract;
	}
	public void setIsInContract(boolean isInContract) {
		this.isInContract = isInContract;
	}
	
}



