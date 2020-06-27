package com.cisdi.enfi.pbs.vo;

public class OptRecordVO{

    private String projectId;
    private String pbsVersionId;
    private String versionTypeCode;
    private String isEditable;
    private String key;
    private Integer targetType;
    private Integer optType;
    private Integer status;
    public String getProjectId()
    {
        return projectId;
    }
    public void setProjectId(String projectId)
    {
        this.projectId = projectId;
    }
    public String getPbsVersionId()
    {
        return pbsVersionId;
    }
    public void setPbsVersionId(String pbsVersionId)
    {
        this.pbsVersionId = pbsVersionId;
    }
    public String getKey()
    {
        return key;
    }
    public void setKey(String key)
    {
        this.key = key;
    }
    public Integer getTargetType()
    {
        return targetType;
    }
    public void setTargetType(Integer targetType)
    {
        this.targetType = targetType;
    }
    public Integer getStatus()
    {
        return status;
    }
    public void setStatus(Integer status)
    {
        this.status = status;
    }
    public Integer getOptType()
    {
        return optType;
    }
    public void setOptType(Integer optType)
    {
        this.optType = optType;
    }
    public String getVersionTypeCode()
    {
        return versionTypeCode;
    }
    public void setVersionTypeCode(String versionTypeCode)
    {
        this.versionTypeCode = versionTypeCode;
    }
    public String getIsEditable()
    {
        return isEditable;
    }
    public void setIsEditable(String isEditable)
    {
        this.isEditable = isEditable;
    }
    
}
