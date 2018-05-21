package com.company.ems.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum AccountType implements EnumClass<Integer> {

    Checking(10),
    Saving(20);

    private Integer id;

    AccountType(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static AccountType fromId(Integer id) {
        for (AccountType at : AccountType.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}