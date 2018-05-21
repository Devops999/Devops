package com.company.ems.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum AddressType implements EnumClass<Integer> {

    Home(10),
    Mailing(20),
    Billing(30);

    private Integer id;

    AddressType(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static AddressType fromId(Integer id) {
        for (AddressType at : AddressType.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}