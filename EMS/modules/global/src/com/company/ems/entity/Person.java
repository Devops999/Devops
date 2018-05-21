package com.company.ems.entity;

import javax.persistence.*;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import java.math.BigDecimal;
import java.util.Date;
import javax.validation.constraints.NotNull;
import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;
import java.util.List;

@DiscriminatorColumn(name = "DTYPE", discriminatorType = DiscriminatorType.STRING)
@Inheritance(strategy = InheritanceType.JOINED)
@NamePattern("%s|name")
@DiscriminatorValue("p")
@Table(name = "EMS_PERSON")
@Entity(name = "ems$Person")
public class Person extends StandardEntity {
    private static final long serialVersionUID = 4005452201643838553L;

    @NotNull
    @Column(name = "FIRST_NAME", nullable = false)
    protected String firstName;

    @NotNull
    @Column(name = "MIDDLE_NAME", nullable = false)
    protected String middleName;

    @NotNull
    @Column(name = "LAST_NAME", nullable = false)
    protected String lastName;

    @NotNull
    @Column(name = "SURNAME", nullable = false)
    protected String surname;

    @Temporal(TemporalType.DATE)
    @NotNull
    @Column(name = "DATE_OF_BIRTH", nullable = false)
    protected Date dateOfBirth;

    @NotNull
    @Column(name = "GENDER", nullable = false)
    protected Integer gender;

    @NotNull
    @Column(name = "HEIGHT", nullable = false)
    protected BigDecimal height;

    @NotNull
    @Column(name = "WEIGHT", nullable = false)
    protected BigDecimal weight;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "person")
    protected List<Address> addresses;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "person")
    protected List<Contact> contacts;

    @NotNull
    @Column(name = "EMAIL", nullable = false)
    protected String email;

    @NotNull
    @Column(name = "HOME_PHONE_NUMBER", nullable = false)
    protected String homePhoneNumber;

    @NotNull
    @Column(name = "CELL_PHONE_NUMBER", nullable = false)
    protected String cellPhoneNumber;

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public List<Contact> getContacts() {
        return contacts;
    }


    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public List<Address> getAddresses() {
        return addresses;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setGender(Gender gender) {
        this.gender = gender == null ? null : gender.getId();
    }

    public Gender getGender() {
        return gender == null ? null : Gender.fromId(gender);
    }

    public void setHeight(BigDecimal height) {
        this.height = height;
    }

    public BigDecimal getHeight() {
        return height;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
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


}