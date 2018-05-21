package com.company.hrmanagement.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum Class implements EnumClass<Integer> {

    First(10),
    Second(20),
    Pass(30);

    private Integer id;

    Class(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static Class fromId(Integer id) {
        for (Class at : Class.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}