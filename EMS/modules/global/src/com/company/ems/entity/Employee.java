package com.company.ems.entity;

import javax.persistence.*;

import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;
import com.haulmont.cuba.security.entity.User;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.validation.constraints.NotNull;

@PrimaryKeyJoinColumn(name ="ID", referencedColumnName = "ID")
@DiscriminatorValue("E")
@Table(name = "EMS_EMPLOYEE")
@Entity(name = "ems$Employee")
public class Employee extends Person {
    private static final long serialVersionUID = 5927346589123604760L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MANAGER_ID")
    protected Employee manager;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID")
    protected User user;

    @Temporal(TemporalType.DATE)
    @NotNull
    @Column(name = "START_DATE", nullable = false)
    protected Date startDate;

    @Temporal(TemporalType.DATE)
    @NotNull
    @Column(name = "TERMINATION_DATE", nullable = false)
    protected Date terminationDate;

    @Temporal(TemporalType.DATE)
    @NotNull
    @Column(name = "RESIGNATION_DATE", nullable = false)
    protected Date resignationDate;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "employee")
    protected List<Bank> bankAccounts;

    @NotNull
    @Column(name = "ANNUAL_SALARY", nullable = false)
    protected BigDecimal annualSalary;

    public Date getResignationDate() {
        return resignationDate;
    }

    public void setResignationDate(Date resignationDate) {
        this.resignationDate = resignationDate;
    }


    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }


    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setTerminationDate(Date terminationDate) {
        this.terminationDate = terminationDate;
    }

    public Date getTerminationDate() {
        return terminationDate;
    }

    public void setBankAccounts(List<Bank> bankAccounts) {
        this.bankAccounts = bankAccounts;
    }

    public List<Bank> getBankAccounts() {
        return bankAccounts;
    }

    public void setAnnualSalary(BigDecimal annualSalary) {
        this.annualSalary = annualSalary;
    }

    public BigDecimal getAnnualSalary() {
        return annualSalary;
    }


    public void setManager(Employee manager) {
        this.manager = manager;
    }

    public Employee getManager() {
        return manager;
    }


}