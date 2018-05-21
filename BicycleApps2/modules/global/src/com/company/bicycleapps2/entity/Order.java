package com.company.bicycleapps2.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|description")
@Table(name = "BICYCLEAPPS2_ORDER")
@Entity(name = "bicycleapps2$Order")
public class Order extends StandardEntity {
    private static final long serialVersionUID = 2538421799215518199L;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CLIENT_ID")
    protected Client client;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "MECHANIC_ID")
    protected Mechanic mechanic;

    @Lob
    @Column(name = "DESCRIPTION")
    protected String description;

    @Column(name = "HOUR_SPENT")
    protected Integer hourSpent;

    @NotNull
    @Column(name = "AMOUNT", nullable = false)
    protected BigDecimal amount;

    @NotNull
    @Column(name = "STATUS", nullable = false)
    protected Integer status;

    @JoinTable(name = "BICYCLEAPPS2_ORDER_SPARE_PART_LINK",
        joinColumns = @JoinColumn(name = "ORDER_ID"),
        inverseJoinColumns = @JoinColumn(name = "SPARE_PART_ID"))
    @ManyToMany
    protected List<SparePart> parts;

    @Column(name = "PALVISHA")
    protected Integer palvisha;

    @Column(name = "ANMOL")
    protected Integer anmol;




    public void setStatus(Status status) {
        this.status = status == null ? null : status.getId();
    }

    public Status getStatus() {
        return status == null ? null : Status.fromId(status);
    }


    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getAmount() {
        return amount;
    }


    public void setAnmol(Anmol anmol) {
        this.anmol = anmol == null ? null : anmol.getId();
    }

    public Anmol getAnmol() {
        return anmol == null ? null : Anmol.fromId(anmol);
    }


    public void setPalvisha(Palvisha palvisha) {
        this.palvisha = palvisha == null ? null : palvisha.getId();
    }

    public Palvisha getPalvisha() {
        return palvisha == null ? null : Palvisha.fromId(palvisha);
    }


    public void setParts(List<SparePart> parts) {
        this.parts = parts;
    }

    public List<SparePart> getParts() {
        return parts;
    }


    public void setClient(Client client) {
        this.client = client;
    }

    public Client getClient() {
        return client;
    }

    public void setMechanic(Mechanic mechanic) {
        this.mechanic = mechanic;
    }

    public Mechanic getMechanic() {
        return mechanic;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setHourSpent(Integer hourSpent) {
        this.hourSpent = hourSpent;
    }

    public Integer getHourSpent() {
        return hourSpent;
    }


}