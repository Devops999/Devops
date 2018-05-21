package com.company.bicycleapps2.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum Anmol implements EnumClass<Integer> {

    not(10),
    yes(20);

    private Integer id;

    Anmol(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static Anmol fromId(Integer id) {
        for (Anmol at : Anmol.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}