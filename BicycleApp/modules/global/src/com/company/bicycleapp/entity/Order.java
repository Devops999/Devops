package com.company.bicycleapp.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|description")
@Table(name = "BICYCLEAPP_ORDER")
@Entity(name = "bicycleapp$Order")
public class Order extends StandardEntity {
    private static final long serialVersionUID = 3099451490075264176L;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CLIENT_ID")
    protected Client client;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "MECHANICS_ID")
    protected Mechanic mechanics;

    @Lob
    @Column(name = "DESCRIPTION")
    protected String description;

    @NotNull
    @Column(name = "HOURS_SPENT", nullable = false)
    protected Integer hoursSpent;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PARTS_ID")
    protected SparePart parts;

    @NotNull
    @Column(name = "STATUS", nullable = false)
    protected Integer status;

    public void setClient(Client client) {
        this.client = client;
    }

    public Client getClient() {
        return client;
    }

    public void setMechanics(Mechanic mechanics) {
        this.mechanics = mechanics;
    }

    public Mechanic getMechanics() {
        return mechanics;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setHoursSpent(Integer hoursSpent) {
        this.hoursSpent = hoursSpent;
    }

    public Integer getHoursSpent() {
        return hoursSpent;
    }

    public void setParts(SparePart parts) {
        this.parts = parts;
    }

    public SparePart getParts() {
        return parts;
    }

    public void setStatus(OderStatus status) {
        this.status = status == null ? null : status.getId();
    }

    public OderStatus getStatus() {
        return status == null ? null : OderStatus.fromId(status);
    }


}