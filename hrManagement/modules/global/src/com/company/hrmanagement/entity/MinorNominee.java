package com.company.hrmanagement.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum MinorNominee implements EnumClass<Integer> {

    Yes(10),
    No(20);

    private Integer id;

    MinorNominee(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static MinorNominee fromId(Integer id) {
        for (MinorNominee at : MinorNominee.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}