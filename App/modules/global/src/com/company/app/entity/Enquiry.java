package com.company.app.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.haulmont.cuba.core.entity.StandardEntity;
import javax.persistence.Column;
import javax.persistence.Lob;
import javax.validation.constraints.NotNull;

@Table(name = "APP_ENQUIRY")
@Entity(name = "app$Enquiry")
public class Enquiry extends StandardEntity {
    private static final long serialVersionUID = -2309117953748145171L;

    @NotNull
    @Column(name = "FROM_", nullable = false)
    protected String from;

    @NotNull
    @Column(name = "TO_", nullable = false)
    protected String to;

    @NotNull
    @Lob
    @Column(name = "QUERY", nullable = false)
    protected String query;

    public void setFrom(String from) {
        this.from = from;
    }

    public String getFrom() {
        return from;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getTo() {
        return to;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getQuery() {
        return query;
    }


}