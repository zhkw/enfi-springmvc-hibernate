package com.cisdi.enfi.pbs.model;

import org.hibernate.annotations.PolymorphismType;

import javax.persistence.*;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

@javax.persistence.Entity
@Table(
        name = "ctp_root"
)
@Inheritance(
        strategy = InheritanceType.TABLE_PER_CLASS
)
@org.hibernate.annotations.Entity(
        polymorphism = PolymorphismType.EXPLICIT
)
public class Root extends com.cisdi.enfi.pbs.model.Entity {
    private static final long serialVersionUID = 1L;
    protected HashMap<String, Object> hashAttributes = new HashMap();

    public Root() {
    }

    @Transient
    public HashMap<String, Object> getHashAttributes() {
        return this.hashAttributes;
    }

    public void setHashAttributes(HashMap<String, Object> hashAttributes) {
        this.hashAttributes = hashAttributes;
    }

    @Id
    public String getId() {
        return (String)this.hashAttributes.get("id");
    }

    public void setId(String id) {
        this.hashAttributes.put("id", id);
    }

    @Transient
    public Object getAttribute(String attributeName) {
        return this.hashAttributes.get(attributeName);
    }

    public void setAttribute(String attributeName, Object value) {
        this.hashAttributes.put(attributeName, value);
    }

    public Date getCreateTime() {
        return (Date)this.hashAttributes.get("createTime");
    }

    public void setCreateTime(Date createTime) {
        this.hashAttributes.put("createTime", createTime);
    }

    public Date getUpdateTime() {
        return (Date)this.hashAttributes.get("updateTime");
    }

    public void setUpdateTime(Date updateTime) {
        this.hashAttributes.put("updateTime", updateTime);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null) {
            return false;
        } else if (this.getClass() != obj.getClass()) {
            return false;
        } else {
            Root other = (Root)obj;
            Iterator i$ = this.hashAttributes.keySet().iterator();

            while(i$.hasNext()) {
                String key = (String)i$.next();
                Iterator i$2 = other.hashAttributes.keySet().iterator();

                while(i$2.hasNext()) {
                    String key_other = (String)i$2.next();
                    if (this.hashAttributes.get(key) != other.hashAttributes.get(key_other)) {
                        return false;
                    }
                }
            }

            return true;
        }
    }

    public String toString() {
        String result = "";
        result = "[" + this.getClass().getSimpleName() + "] ";
        String key = "";
        Set<String> keySet = this.hashAttributes.keySet();
        Iterator iter = keySet.iterator();

        while(iter.hasNext()) {
            key = (String)iter.next();
            if (this.hashAttributes.get(key) == null) {
                result = result + key + "=null";
            } else if (this.hashAttributes.get(key) instanceof Root) {
                result = result + key + "=" + ((Root)this.hashAttributes.get(key)).getId();
            } else {
                result = result + key + "=" + this.hashAttributes.get(key);
            }

            if (iter.hasNext()) {
                result = result + ", ";
            }
        }

        return result;
    }
}

