package com.company.app.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.haulmont.cuba.core.entity.StandardEntity;

@Table(name = "APP_TRANSACTION")
@Entity(name = "app$Transaction")
public class Transaction extends StandardEntity {
    private static final long serialVersionUID = 6189404370058064753L;

}