package com.company.task.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum Units implements EnumClass<Integer> {

    One_Unit(10),
    Two_Unit(20),
    Three_Unit(30);

    private Integer id;

    Units(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static Units fromId(Integer id) {
        for (Units at : Units.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}