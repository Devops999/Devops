package com.company.accordion.entity;

import javax.persistence.Entity;
import com.haulmont.cuba.core.entity.annotation.Extends;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import com.haulmont.cuba.security.entity.User;

@Extends(User.class)
@Entity(name = "accordion$ExtUser")
public class ExtUser extends User {
    private static final long serialVersionUID = 4318338822706848724L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PALVISHA_ID")
    protected Palvisha palvisha;

    public void setPalvisha(Palvisha palvisha) {
        this.palvisha = palvisha;
    }

    public Palvisha getPalvisha() {
        return palvisha;
    }


}