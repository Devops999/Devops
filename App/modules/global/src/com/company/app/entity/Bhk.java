package com.company.app.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum Bhk implements EnumClass<Integer> {

    one(10),
    two(20),
    three(30);

    private Integer id;

    Bhk(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static Bhk fromId(Integer id) {
        for (Bhk at : Bhk.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}