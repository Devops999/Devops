package com.company.task.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.OneToMany;

@Table(name = "TASK_TRANSACTION")
@Entity(name = "task$Transaction")
public class Transaction extends StandardEntity {
    private static final long serialVersionUID = 4351073072900210704L;

    @Column(name = "TRANSACTION_TYPE")
    protected String transactionType;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "transaction")
    protected List<SalesListing> propertyType;

    @Column(name = "LOCATION")
    protected String location;

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setPropertyType(List<SalesListing> propertyType) {
        this.propertyType = propertyType;
    }

    public List<SalesListing> getPropertyType() {
        return propertyType;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }


}