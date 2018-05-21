package com.company.hrmanagement.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum Training implements EnumClass<Integer> {

    Managerial(10),
    Technical(20);

    private Integer id;

    Training(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static Training fromId(Integer id) {
        for (Training at : Training.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}