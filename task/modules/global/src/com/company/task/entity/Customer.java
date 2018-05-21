package com.company.task.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|firstName")
@Table(name = "TASK_CUSTOMER")
@Entity(name = "task$Customer")
public class Customer extends StandardEntity {
    private static final long serialVersionUID = 4610849325883192781L;

    @NotNull
    @Column(name = "FIRST_NAME", nullable = false)
    protected String firstName;

    @NotNull
    @Column(name = "LASTNAME", nullable = false)
    protected String lastname;

    @NotNull
    @Column(name = "EMAIL", nullable = false)
    protected String email;

    @Temporal(TemporalType.DATE)
    @Column(name = "DOB")
    protected Date dob;

    @Column(name = "CITY")
    protected String city;

    @Column(name = "STATE")
    protected String state;

    @Column(name = "COUNTRY")
    protected String country;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Date getDob() {
        return dob;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }


}