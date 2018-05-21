package com.company.app.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.haulmont.cuba.core.entity.StandardEntity;

@Table(name = "APP_BOOKING")
@Entity(name = "app$Booking")
public class Booking extends StandardEntity {
    private static final long serialVersionUID = 808246597909483224L;

}