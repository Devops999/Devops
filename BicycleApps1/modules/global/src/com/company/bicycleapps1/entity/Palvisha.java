package com.company.bicycleapps1.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum Palvisha implements EnumClass<Integer> {

    ready(10),
    not(20);

    private Integer id;

    Palvisha(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static Palvisha fromId(Integer id) {
        for (Palvisha at : Palvisha.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}