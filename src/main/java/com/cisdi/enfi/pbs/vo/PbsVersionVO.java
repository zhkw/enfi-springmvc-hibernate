package com.cisdi.enfi.pbs.vo;

import java.util.List;
import java.util.Map;

public class PbsVersionVO {

	//项目id
	private String projectId;
	//复制之前版本类型code
    private String oldVersionTypeCode;
	//版本类型code
	private String versionTypeCode;
	//原pbs版本id
	private String pbsVersionId;
	//原版本是否可编辑
	private boolean oldIsEditable;
	//价格表id
	private String priceId;
	//修订内部版datagrid类型（报价 0   项目管理 1）  
	private int inEditType;
	//新复制的pbs版本id
	private String newPbsVersionId;
	//目标版本是否可编辑
	private boolean isEditable;
	//pbs节点原id和新id（键值对应）
	private Map<String, String> pbsNodeIds ; 
	//项目物料原id和新id（键值对应）
	private Map<String, String> prjMIds ; 
	//物料清单原id和新id（键值对应）
	private Map<String, String> matListIds; 
	//清单明细原id和新id（键值对应）
	private Map<String, String> matListDetailIds; 
	//价格表原id和新id（键值对应）
	Map<String, String> priceListIds;
	//工时汇总表原id和新id（键值对应）
	private Map<String, String> manhourIds;
	//如果粘贴版本为费用控制目标版时  该阶段已存在价格表审核的固化版物料清单明细code及项目物料id
	private List<Map<String, Object>> exisMap;
	//记录复制物料清单时 主清单id所在节点还未复制的物料清单id和其主清单id
	private List<String> recordmatListIds;
	//是否从费用控制目标版复制到费用控制目标版
	private boolean isCost = false;
	//记录从其他版本复制到费用控制目标版本是的价格明细ID 用于分配默认的费用控制目标
	private List<String> newPriceListDetailIdsl;
	//版本复制 是否可编辑类型 :  0  从可编辑版(固化版)复制到固化版 ;1 可编辑本复制到可编辑版; 2 固化版复制到可编辑版  
	private int isEditType;
	//草稿pbs节点
	private Map<String, String> pbsNodeDraftIds ; 
	//草稿物料清单
    private Map<String, String> matListDraftIds ; 
	//草稿物料清单明细
    private Map<String, String> matListDetailDraftIds; 
    //草稿项目物料
    private Map<String, String> prjMIDraftds ;
    //pbs节点对应CODE及ID
    private Map<String, String> nodeCodeAndId;
    //是否是同一个项目复制
    private boolean isSamePrj = true;
    
	public String getProjectId() {
		return projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}
	public String getOldVersionTypeCode() {
        return oldVersionTypeCode;
    }
    public void setOldVersionTypeCode(String oldVersionTypeCode) {
        this.oldVersionTypeCode = oldVersionTypeCode;
    }
	public String getVersionTypeCode() {
		return versionTypeCode;
	}
	public void setVersionTypeCode(String versionTypeCode) {
		this.versionTypeCode = versionTypeCode;
	}
	public String getPbsVersionId() {
		return pbsVersionId;
	}
	public void setPbsVersionId(String pbsVersionId) {
		this.pbsVersionId = pbsVersionId;
	}
	public boolean isOldIsEditable(){
        return oldIsEditable;
    }
    public void setOldIsEditable(boolean oldIsEditable){
        this.oldIsEditable = oldIsEditable;
    }
    public String getPriceId() {
		return priceId;
	}
	public void setPriceId(String priceId) {
		this.priceId = priceId;
	}
	public int getInEditType() {
		return inEditType;
	}
	public void setInEditType(int inEditType) {
		this.inEditType = inEditType;
	}
	public String getNewPbsVersionId() {
		return newPbsVersionId;
	}
	public void setNewPbsVersionId(String newPbsVersionId) {
		this.newPbsVersionId = newPbsVersionId;
	}
	public boolean isEditable() {
		return isEditable;
	}
	public void setEditable(boolean isEditable) {
		this.isEditable = isEditable;
	}
	public Map<String, String> getPbsNodeIds() {
		return pbsNodeIds;
	}
	public void setPbsNodeIds(Map<String, String> pbsNodeIds) {
		this.pbsNodeIds = pbsNodeIds;
	}
	public Map<String, String> getPrjMIds() {
		return prjMIds;
	}
	public void setPrjMIds(Map<String, String> prjMIds) {
		this.prjMIds = prjMIds;
	}
	public Map<String, String> getMatListIds() {
		return matListIds;
	}
	public void setMatListIds(Map<String, String> matListIds) {
		this.matListIds = matListIds;
	}
	public Map<String, String> getMatListDetailIds() {
		return matListDetailIds;
	}
	public void setMatListDetailIds(Map<String, String> matListDetailIds) {
		this.matListDetailIds = matListDetailIds;
	}
	public Map<String, String> getPriceListIds() {
		return priceListIds;
	}
	public void setPriceListIds(Map<String, String> priceListIds) {
		this.priceListIds = priceListIds;
	}
	public Map<String, String> getManhourIds() {
		return manhourIds;
	}
	public void setManhourIds(Map<String, String> manhourIds) {
		this.manhourIds = manhourIds;
	}
	public List<Map<String, Object>> getExisMap() {
		return exisMap;
	}
	public void setExisMap(List<Map<String, Object>> exisMap) {
		this.exisMap = exisMap;
	}
	public List<String> getRecordmatListIds() {
		return recordmatListIds;
	}
	public void setRecordmatListIds(List<String> recordmatListIds) {
		this.recordmatListIds = recordmatListIds;
	}
	public boolean isCost() {
		return isCost;
	}
	public void setCost(boolean isCost) {
		this.isCost = isCost;
	}
    public List<String> getNewPriceListDetailIdsl(){
        return newPriceListDetailIdsl;
    }
    public void setNewPriceListDetailIdsl(List<String> newPriceListDetailIdsl){
        this.newPriceListDetailIdsl = newPriceListDetailIdsl;
    }
    public int getIsEditType(){
        return isEditType;
    }
    public void setIsEditType(int isEditType){
        this.isEditType = isEditType;
    }
    public Map<String, String> getPbsNodeDraftIds(){
        return pbsNodeDraftIds;
    }
    public void setPbsNodeDraftIds(Map<String, String> pbsNodeDraftIds){
        this.pbsNodeDraftIds = pbsNodeDraftIds;
    }
    public Map<String, String> getMatListDraftIds(){
        return matListDraftIds;
    }
    public void setMatListDraftIds(Map<String, String> matListDraftIds){
        this.matListDraftIds = matListDraftIds;
    }
    public Map<String, String> getMatListDetailDraftIds(){
        return matListDetailDraftIds;
    }
    public void setMatListDetailDraftIds(Map<String, String> matListDetailDraftIds){
        this.matListDetailDraftIds = matListDetailDraftIds;
    }
    public Map<String, String> getPrjMIDraftds(){
        return prjMIDraftds;
    }
    public void setPrjMIDraftds(Map<String, String> prjMIDraftds){
        this.prjMIDraftds = prjMIDraftds;
    }
    public Map<String, String> getNodeCodeAndId(){
        return nodeCodeAndId;
    }
    public void setNodeCodeAndId(Map<String, String> nodeCodeAndId){
        this.nodeCodeAndId = nodeCodeAndId;
    }
	public boolean isSamePrj() {
		return isSamePrj;
	}
	public void setSamePrj(boolean isSamePrj) {
		this.isSamePrj = isSamePrj;
	}
	
}
