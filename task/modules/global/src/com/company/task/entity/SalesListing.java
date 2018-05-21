package com.company.task.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@NamePattern("%s|appartments")
@Table(name = "TASK_SALES_LISTING")
@Entity(name = "task$SalesListing")
public class SalesListing extends StandardEntity {
    private static final long serialVersionUID = -8942920696634611261L;

    @Column(name = "APPARTMENTS")
    protected String appartments;

    @Column(name = "LAND_SITES")
    protected String landSites;

    @Column(name = "OTHERS_")
    protected String others;

    @Column(name = "LOCATION")
    protected String location;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TRANSACTION_ID")
    protected Transaction transaction;

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }

    public Transaction getTransaction() {
        return transaction;
    }


    public void setAppartments(String appartments) {
        this.appartments = appartments;
    }

    public String getAppartments() {
        return appartments;
    }

    public void setLandSites(String landSites) {
        this.landSites = landSites;
    }

    public String getLandSites() {
        return landSites;
    }

    public void setOthers(String others) {
        this.others = others;
    }

    public String getOthers() {
        return others;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }


}