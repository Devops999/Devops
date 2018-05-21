package com.company.ems.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.haulmont.cuba.core.entity.StandardEntity;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Table(name = "EMS_CITY")
@Entity(name = "ems$City")
public class City extends StandardEntity {
    private static final long serialVersionUID = -1675349346415592258L;

    @NotNull
    @Column(name = "CITY_CODE", nullable = false)
    protected String cityCode;

    @NotNull
    @Column(name = "CITY_NAME", nullable = false)
    protected String cityName;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "STATE_ID")
    protected City state;

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setState(City state) {
        this.state = state;
    }

    public City getState() {
        return state;
    }


}