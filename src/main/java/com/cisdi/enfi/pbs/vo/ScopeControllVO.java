package com.cisdi.enfi.pbs.vo;

/**
 * Description :
 *
 * @author : zhang
 * @date : 2019/4/23 14:02
 */
public class ScopeControllVO {
    // 价格行ID
    private String targetId;

    //支出类型Id
    private String expenseTypeId;
    //计划Id
    private String planId;
    //计划行Id
    private String planLineId;

    private int planType;
    //包含数量
    private Double includeQty;

    private Double price;

    private Double pbsCode;

    public String getTargetId() {
        return targetId;
    }

    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    public String getExpenseTypeId() {
        return expenseTypeId;
    }

    public void setExpenseTypeId(String expenseTypeId) {
        this.expenseTypeId = expenseTypeId;
    }

    public String getPlanId() {
        return planId;
    }

    public void setPlanId(String planId) {
        this.planId = planId;
    }

    public String getPlanLineId() {
        return planLineId;
    }
    public void setPlanLineId(String planLineId) {
        this.planLineId = planLineId;
    }
    public int getPlanType() {
        return planType;
    }
    public void setPlanType(int planType) {
        this.planType = planType;
    }

    public Double getIncludeQty() {
        return includeQty;
    }
    public void setIncludeQty(Double includeQty) {
        this.includeQty = includeQty;
    }

    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getPbsCode() {
        return pbsCode;
    }

    public void setPbsCode(Double pbsCode) {
        this.pbsCode = pbsCode;
    }
}
