package com.company.ems.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.haulmont.cuba.core.entity.StandardEntity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

@Table(name = "EMS_CONTACT")
@Entity(name = "ems$Contact")
public class Contact extends StandardEntity {
    private static final long serialVersionUID = 491649297594145961L;

    @NotNull
    @Column(name = "CONTACT_FIRST_NAME", nullable = false)
    protected String contactFirstName;

    @NotNull
    @Column(name = "CONTACT_LAST_NAME", nullable = false)
    protected String contactLastName;

    @NotNull
    @Column(name = "HOME_PHONE_NUMBER", nullable = false)
    protected String homePhoneNumber;

    @NotNull
    @Column(name = "CELL_PHONE_NUMBER", nullable = false)
    protected String cellPhoneNumber;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "contact")
    protected List<Address> addresses;

    @NotNull
    @Column(name = "EMAIL", nullable = false)
    protected String email;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PERSON_ID")
    protected Person person;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORGANIZATION_ID")
    protected Organization organization;

    public void setContactFirstName(String contactFirstName) {
        this.contactFirstName = contactFirstName;
    }

    public String getContactFirstName() {
        return contactFirstName;
    }

    public void setContactLastName(String contactLastName) {
        this.contactLastName = contactLastName;
    }

    public String getContactLastName() {
        return contactLastName;
    }

    public void setHomePhoneNumber(String homePhoneNumber) {
        this.homePhoneNumber = homePhoneNumber;
    }

    public String getHomePhoneNumber() {
        return homePhoneNumber;
    }

    public void setCellPhoneNumber(String cellPhoneNumber) {
        this.cellPhoneNumber = cellPhoneNumber;
    }

    public String getCellPhoneNumber() {
        return cellPhoneNumber;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
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


}