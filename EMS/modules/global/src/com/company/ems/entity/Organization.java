package com.company.ems.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.haulmont.cuba.core.entity.StandardEntity;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;
import java.util.List;
import javax.persistence.OneToMany;

@Table(name = "EMS_ORGANIZATION")
@Entity(name = "ems$Organization")
public class Organization extends StandardEntity {
    private static final long serialVersionUID = 7353849540771892189L;

    @NotNull
    @Column(name = "LEGAL_NAME", nullable = false)
    protected String legalName;

    @Temporal(TemporalType.DATE)
    @NotNull
    @Column(name = "INCORPORATIONDATE", nullable = false)
    protected Date incorporationdate;

    @NotNull
    @Column(name = "BUSINESS_START_DATE", nullable = false)
    protected String businessStartDate;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "organization")
    protected List<Address> addresses;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "organization")
    protected List<Bank> bankAccount;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "organization")
    protected List<Contact> contacts;

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setBankAccount(List<Bank> bankAccount) {
        this.bankAccount = bankAccount;
    }

    public List<Bank> getBankAccount() {
        return bankAccount;
    }


    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public List<Contact> getContacts() {
        return contacts;
    }


    public void setLegalName(String legalName) {
        this.legalName = legalName;
    }

    public String getLegalName() {
        return legalName;
    }

    public void setIncorporationdate(Date incorporationdate) {
        this.incorporationdate = incorporationdate;
    }

    public Date getIncorporationdate() {
        return incorporationdate;
    }

    public void setBusinessStartDate(String businessStartDate) {
        this.businessStartDate = businessStartDate;
    }

    public String getBusinessStartDate() {
        return businessStartDate;
    }


}