package com.company.bicycleapps1.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.haulmont.cuba.security.entity.User;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|user")
@Table(name = "BICYCLEAPPS1_MECHANICS")
@Entity(name = "bicycleapps1$Mechanics")
public class Mechanics extends StandardEntity {
    private static final long serialVersionUID = 8201460555311139251L;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "USER_ID")
    protected User user;

    @NotNull
    @Column(name = "HOURLY_RATE", nullable = false)
    protected BigDecimal hourlyRate;

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setHourlyRate(BigDecimal hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public BigDecimal getHourlyRate() {
        return hourlyRate;
    }


}