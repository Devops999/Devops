package com.company.ems.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.haulmont.cuba.core.entity.StandardEntity;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;

@Table(name = "EMS_COUNTRY")
@Entity(name = "ems$Country")
public class Country extends StandardEntity {
    private static final long serialVersionUID = 5497069183839872616L;

    @NotNull
    @Column(name = "COUNTRY_CODE", nullable = false)
    protected String countryCode;

    @NotNull
    @Column(name = "COUNTRY_NAME", nullable = false)
    protected String countryName;

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryName() {
        return countryName;
    }


}