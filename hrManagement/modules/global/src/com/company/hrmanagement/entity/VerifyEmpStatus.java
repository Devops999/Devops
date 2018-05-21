package com.company.hrmanagement.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|id")
@Table(name = "HRMANAGEMENT_VERIFY_EMP_STATUS")
@Entity(name = "hrmanagement$VerifyEmpStatus")
public class VerifyEmpStatus extends StandardEntity {
    private static final long serialVersionUID = 5295664211565693686L;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CODE_ID")
    protected AddEmployee code;

    @NotNull
    @Column(name = "FULL_NAME", nullable = false)
    protected String fullName;

    @Column(name = "REPORT")
    protected String report;

    @Column(name = "SUBMIT")
    protected String submit;

    public void setCode(AddEmployee code) {
        this.code = code;
    }

    public AddEmployee getCode() {
        return code;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setReport(String report) {
        this.report = report;
    }

    public String getReport() {
        return report;
    }

    public void setSubmit(String submit) {
        this.submit = submit;
    }

    public String getSubmit() {
        return submit;
    }


}