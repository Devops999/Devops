package com.company.ems.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.haulmont.cuba.core.entity.StandardEntity;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Table(name = "EMS_STATE")
@Entity(name = "ems$State")
public class State extends StandardEntity {
    private static final long serialVersionUID = -1414209658101204826L;

    @NotNull
    @Column(name = "STATE_CODE", nullable = false)
    protected String stateCode;

    @NotNull
    @Column(name = "STATE_NAME", nullable = false)
    protected String stateName;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "COUNTRY_ID")
    protected Country country;

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    public String getStateCode() {
        return stateCode;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getStateName() {
        return stateName;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Country getCountry() {
        return country;
    }


}