package com.company.hrmanagement.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@NamePattern(" %s|dateOfImplementation")
@Table(name = "HRMANAGEMENT_SALARY_DETAILS")
@Entity(name = "hrmanagement$SalaryDetails")
public class SalaryDetails extends StandardEntity {
    private static final long serialVersionUID = -7677414548011541438L;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CODE_ID")
    protected AddEmployee code;

    @NotNull
    @Column(name = "FIXED_CTC", nullable = false)
    protected Integer fixedCTC;

    @NotNull
    @Column(name = "EXTRA", nullable = false)
    protected Integer extra;

    @Temporal(TemporalType.DATE)
    @NotNull
    @Column(name = "DATE_OF_IMPLEMENTATION", nullable = false)
    protected Date dateOfImplementation;


    public void setCode(AddEmployee code) {
        this.code = code;
    }

    public AddEmployee getCode() {
        return code;
    }


    public void setFixedCTC(Integer fixedCTC) {
        this.fixedCTC = fixedCTC;
    }

    public Integer getFixedCTC() {
        return fixedCTC;
    }

    public void setExtra(Integer extra) {
        this.extra = extra;
    }

    public Integer getExtra() {
        return extra;
    }

    public void setDateOfImplementation(Date dateOfImplementation) {
        this.dateOfImplementation = dateOfImplementation;
    }

    public Date getDateOfImplementation() {
        return dateOfImplementation;
    }


}