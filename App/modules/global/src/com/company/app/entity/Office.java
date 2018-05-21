package com.company.app.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.haulmont.cuba.core.entity.StandardEntity;

@Table(name = "APP_OFFICE")
@Entity(name = "app$Office")
public class Office extends StandardEntity {
    private static final long serialVersionUID = -8716772831862541454L;

}