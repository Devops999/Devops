package com.company.hrmanagement.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum MaritalStatus implements EnumClass<Integer> {

    Single(10),
    Married(20);

    private Integer id;

    MaritalStatus(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static MaritalStatus fromId(Integer id) {
        for (MaritalStatus at : MaritalStatus.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}