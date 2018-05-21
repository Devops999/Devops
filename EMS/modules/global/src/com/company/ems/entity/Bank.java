package com.company.ems.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Table(name = "EMS_BANK")
@Entity(name = "ems$Bank")
public class Bank extends StandardEntity {
    private static final long serialVersionUID = 3329461076812397883L;

    @Temporal(TemporalType.DATE)
    @NotNull
    @Column(name = "FROM_DATE", nullable = false)
    protected Date fromDate;

    @NotNull
    @Column(name = "TO_DATE", nullable = false)
    protected Integer toDate;

    @NotNull
    @Column(name = "BANK_CODE", nullable = false)
    protected String bankCode;

    @NotNull
    @Column(name = "BANK_SWITCH_CODE", nullable = false)
    protected String bankSwitchCode;

    @NotNull
    @Column(name = "BANK_NAME", nullable = false)
    protected String bankName;

    @NotNull
    @Column(name = "BRANCH_NAME", nullable = false)
    protected String branchName;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "bank")
    protected List<Address> addresses;

    @NotNull
    @Column(name = "ACCOUNT_TYPE", nullable = false)
    protected Integer accountType;

    @NotNull
    @Column(name = "ACCOUNT_NO", nullable = false)
    protected String accountNo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "EMPLOYEE_ID")
    protected Employee employee;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORGANIZATION_ID")
    protected Organization organization;

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public Organization getOrganization() {
        return organization;
    }


    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }


    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setToDate(Integer toDate) {
        this.toDate = toDate;
    }

    public Integer getToDate() {
        return toDate;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankSwitchCode(String bankSwitchCode) {
        this.bankSwitchCode = bankSwitchCode;
    }

    public String getBankSwitchCode() {
        return bankSwitchCode;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType == null ? null : accountType.getId();
    }

    public AccountType getAccountType() {
        return accountType == null ? null : AccountType.fromId(accountType);
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getAccountNo() {
        return accountNo;
    }


}