package com.company.hrmanagement.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.haulmont.cuba.core.entity.StandardEntity;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|id")
@Table(name = "HRMANAGEMENT_REPORT_TO_DETAILS")
@Entity(name = "hrmanagement$ReportToDetails")
public class ReportToDetails extends StandardEntity {
    private static final long serialVersionUID = -2590416436866425189L;

    @NotNull
    @Column(name = "SELECT_CODE", nullable = false)
    protected Integer selectCode;

    public void setSelectCode(ReportCode selectCode) {
        this.selectCode = selectCode == null ? null : selectCode.getId();
    }

    public ReportCode getSelectCode() {
        return selectCode == null ? null : ReportCode.fromId(selectCode);
    }

    //public void someAction() {
    //    showNotification(caption: "Report has been submit" + ReportToDetails.getSingleSelected.getInstanceName());
   // }
}


