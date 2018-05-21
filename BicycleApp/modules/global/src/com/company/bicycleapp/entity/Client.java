package com.company.bicycleapp.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s %s|name,phoneNumber")
@Table(name = "BICYCLEAPP_CLIENT")
@Entity(name = "bicycleapp$Client")
public class Client extends StandardEntity {
    private static final long serialVersionUID = 5858117549553543889L;

    @NotNull
    @Column(name = "NAME", nullable = false)
    protected String name;

    @NotNull
    @Column(name = "PHONE_NUMBER", nullable = false, unique = true, length = 20)
    protected String phoneNumber;

    @NotNull
    @Column(name = "EMAIL", nullable = false, unique = true, length = 50)
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