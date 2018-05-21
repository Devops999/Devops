package com.company.bicycleapps1.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Lob;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|title")
@Table(name = "BICYCLEAPPS1_SPARE_PART")
@Entity(name = "bicycleapps1$SparePart")
public class SparePart extends StandardEntity {
    private static final long serialVersionUID = -6740682670295185930L;

    @NotNull
    @Column(name = "TITLE", nullable = false, unique = true)
    protected String title;

    @NotNull
    @Lob
    @Column(name = "DESCRIPTION", nullable = false)
    protected String description;

    @NotNull
    @Column(name = "PRICE", nullable = false)
    protected BigDecimal price;

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPrice() {
        return price;
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }


}