package com.company.task.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|schemes")
@Table(name = "TASK_BROKER")
@Entity(name = "task$Broker")
public class Broker extends StandardEntity {
    private static final long serialVersionUID = -5157861145240785918L;

    @Column(name = "SCHEMES")
    protected String schemes;

    @Column(name = "LOCATION_WIDE")
    protected String locationWide;

    public void setSchemes(String schemes) {
        this.schemes = schemes;
    }

    public String getSchemes() {
        return schemes;
    }

    public void setLocationWide(String locationWide) {
        this.locationWide = locationWide;
    }

    public String getLocationWide() {
        return locationWide;
    }


}