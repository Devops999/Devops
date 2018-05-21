package com.company.bicycleapps2.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("na|name,phoneNumber")
@Table(name = "BICYCLEAPPS2_CLIENT")
@Entity(name = "bicycleapps2$Client")
public class Client extends StandardEntity {
    private static final long serialVersionUID = -8641656040900715233L;

    @NotNull
    @Column(name = "NAME", nullable = false)
    protected String name;

    @NotNull
    @Column(name = "PHONE_NUMBER", nullable = false, unique = true)
    protected String phoneNumber;

    @NotNull
    @Column(name = "EMAIL", nullable = false, unique = true)
    protected String email;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }


}