package com.company.hrmanagement.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum Nationality implements EnumClass<Integer> {

    Indian(10),
    Foreign(20);

    private Integer id;

    Nationality(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static Nationality fromId(Integer id) {
        for (Nationality at : Nationality.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}