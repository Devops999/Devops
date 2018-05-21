package com.company.hrmanagement.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum NomineeScheme implements EnumClass<Integer> {

    EPF(10),
    EPS(20),
    Gratuity(30);

    private Integer id;

    NomineeScheme(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static NomineeScheme fromId(Integer id) {
        for (NomineeScheme at : NomineeScheme.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}