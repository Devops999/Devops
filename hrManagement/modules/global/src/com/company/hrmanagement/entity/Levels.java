package com.company.hrmanagement.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum Levels implements EnumClass<Integer> {

    Diploma(10),
    Bachelor(20),
    Masters(30),
    Professional(40),
    Other(50);

    private Integer id;

    Levels(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static Levels fromId(Integer id) {
        for (Levels at : Levels.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}