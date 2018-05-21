package com.company.task.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.haulmont.cuba.core.entity.StandardEntity;
import javax.persistence.Column;
import javax.persistence.Lob;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|to")
@Table(name = "TASK_ENQUIRY")
@Entity(name = "task$Enquiry")
public class Enquiry extends StandardEntity {
    private static final long serialVersionUID = 5506893565728924062L;

    @Column(name = "FROM_")
    protected String from;

    @Column(name = "TO_")
    protected String to;

    @Lob
    @Column(name = "QUERY")
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