package com.company.bicycleapps1.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.haulmont.cuba.core.entity.StandardEntity;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import com.haulmont.chile.core.annotations.NamePattern;
import java.util.List;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@NamePattern("o|description")
@Table(name = "BICYCLEAPPS1_ODER")
@Entity(name = "bicycleapps1$Oder")
public class Oder extends StandardEntity {
    private static final long serialVersionUID = -5025500859086177053L;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CLIENT_ID")
    protected Client client;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "MECHANICS_ID")
    protected Mechanics mechanics;

    @NotNull
    @Lob
    @Column(name = "DESCRIPTION", nullable = false)
    protected String description;

    @Column(name = "HOURS_SPENT")
    protected Integer hoursSpent;

    @Column(name = "AMOUNT")
    protected BigDecimal amount;

    @JoinTable(name = "BICYCLEAPPS1_ODER_SPARE_PART_LINK",
        joinColumns = @JoinColumn(name = "ODER_ID"),
        inverseJoinColumns = @JoinColumn(name = "SPARE_PART_ID"))
    @ManyToMany
    protected List<SparePart> parts;

    @Column(name = "STATUS")
    protected Integer status;

    @Column(name = "PALVISHA")
    protected Integer palvisha;

    public void setPalvisha(Palvisha palvisha) {
        this.palvisha = palvisha == null ? null : palvisha.getId();
    }

    public Palvisha getPalvisha() {
        return palvisha == null ? null : Palvisha.fromId(palvisha);
    }


    public List<SparePart> getParts() {
        return parts;
    }

    public void setParts(List<SparePart> parts) {
        this.parts = parts;
    }


    public void setClient(Client client) {
        this.client = client;
    }

    public Client getClient() {
        return client;
    }

    public void setMechanics(Mechanics mechanics) {
        this.mechanics = mechanics;
    }

    public Mechanics getMechanics() {
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

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setStatus(OderStatus status) {
        this.status = status == null ? null : status.getId();
    }

    public OderStatus getStatus() {
        return status == null ? null : OderStatus.fromId(status);
    }


}