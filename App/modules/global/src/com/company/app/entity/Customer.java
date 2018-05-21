package com.company.app.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|name")
@Table(name = "APP_CUSTOMER")
@Entity(name = "app$Customer")
public class Customer extends StandardEntity {
    private static final long serialVersionUID = -3612440448762344938L;

    @NotNull
    @Column(name = "NAME", nullable = false)
    protected String name;

    @Column(name = "CONTACT", unique = true)
    protected Integer contact;

    @NotNull
    @Column(name = "EMAIL", nullable = false, unique = true)
    protected String email;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setContact(Integer contact) {
        this.contact = contact;
    }

    public Integer getContact() {
        return contact;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }


}