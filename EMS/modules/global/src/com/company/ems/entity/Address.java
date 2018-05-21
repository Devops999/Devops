package com.company.ems.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.haulmont.cuba.core.entity.StandardEntity;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Lob;
import javax.persistence.DiscriminatorValue;
import javax.persistence.InheritanceType;
import javax.persistence.DiscriminatorType;
import javax.persistence.Inheritance;
import javax.persistence.DiscriminatorColumn;

@DiscriminatorColumn(name = "DTYPE", discriminatorType = DiscriminatorType.STRING)
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorValue("A")
@Table(name = "EMS_ADDRESS")
@Entity(name = "ems$Address")
public class Address extends StandardEntity {
    private static final long serialVersionUID = 4361329813062539166L;

    @Temporal(TemporalType.DATE)
    @NotNull
    @Column(name = "FROM_DATE", nullable = false)
    protected Date fromDate;

    @Temporal(TemporalType.DATE)
    @NotNull
    @Column(name = "TO_DATE", nullable = false)
    protected Date toDate;

    @NotNull
    @Column(name = "ADDRESS_TYPE", nullable = false)
    protected Integer addressType;

    @Lob
    @NotNull
    @Column(name = "ADDRESS_LINE1", nullable = false)
    protected String addressLine1;

    @Lob
    @NotNull
    @Column(name = "ADDRESSLINE2", nullable = false)
    protected String addressline2;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PERSON_ID")
    protected Person person;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORGANIZATION_ID")
    protected Organization organization;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BANK_ID")
    protected Bank bank;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CITY_ID")
    protected City city;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "STATE_ID")
    protected State state;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ZIP_CODE_ID")
    protected ZipCode zipCode;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CONTACT_ID")
    protected Contact contact;

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Contact getContact() {
        return contact;
    }


    public void setCity(City city) {
        this.city = city;
    }

    public City getCity() {
        return city;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setZipCode(ZipCode zipCode) {
        this.zipCode = zipCode;
    }

    public ZipCode getZipCode() {
        return zipCode;
    }


    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public Bank getBank() {
        return bank;
    }


    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public Organization getOrganization() {
        return organization;
    }


    public void setPerson(Person person) {
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }


    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setAddressType(AddressType addressType) {
        this.addressType = addressType == null ? null : addressType.getId();
    }

    public AddressType getAddressType() {
        return addressType == null ? null : AddressType.fromId(addressType);
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressline2(String addressline2) {
        this.addressline2 = addressline2;
    }

    public String getAddressline2() {
        return addressline2;
    }


}