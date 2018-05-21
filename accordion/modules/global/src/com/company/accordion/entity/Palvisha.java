package com.company.accordion.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;

@Table(name = "ACCORDION_PALVISHA")
@Entity(name = "accordion$Palvisha")
public class Palvisha extends StandardEntity {
    private static final long serialVersionUID = 3727683714899413881L;

    @Column(name = "NAME")
    protected String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}