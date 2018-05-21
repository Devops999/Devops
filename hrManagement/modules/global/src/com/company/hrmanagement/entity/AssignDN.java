package com.company.hrmanagement.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;

@NamePattern("%s|selectEmployee")
@Table(name = "HRMANAGEMENT_ASSIGN_DN")
@Entity(name = "hrmanagement$AssignDN")
public class AssignDN extends StandardEntity {
    private static final long serialVersionUID = 3027163923360094535L;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CODE_ID")
    protected AddEmployee code;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @NotNull
    @OnDelete(DeletePolicy.CASCADE)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "SELECT_EMPLOYEE_ID")
    protected AddEmployee selectEmployee;

    @NotNull
    @Column(name = "DOMAIN_NAME", nullable = false)
    protected String domainName;

    @NotNull
    @Column(name = "EMAIL_ID", nullable = false, unique = true)
    protected String emailId;

    public void setCode(AddEmployee code) {
        this.code = code;
    }

    public AddEmployee getCode() {
        return code;
    }


    public void setSelectEmployee(AddEmployee selectEmployee) {
        this.selectEmployee = selectEmployee;
    }

    public AddEmployee getSelectEmployee() {
        return selectEmployee;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public String getDomainName() {
        return domainName;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getEmailId() {
        return emailId;
    }


}