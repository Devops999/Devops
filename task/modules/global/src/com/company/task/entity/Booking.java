package com.company.task.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.haulmont.cuba.core.entity.StandardEntity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Table(name = "TASK_BOOKING")
@Entity(name = "task$Booking")
public class Booking extends StandardEntity {
    private static final long serialVersionUID = -2798483431259057985L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SELLER_INFO_ID")
    protected Seller sellerInfo;

    public void setSellerInfo(Seller sellerInfo) {
        this.sellerInfo = sellerInfo;
    }

    public Seller getSellerInfo() {
        return sellerInfo;
    }


}