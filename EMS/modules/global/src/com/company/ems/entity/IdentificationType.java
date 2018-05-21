package com.company.ems.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum IdentificationType implements EnumClass<Integer> {

    Aadhar(10),
    PP(20),
    DriversLicense(30);

    private Integer id;

    IdentificationType(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static IdentificationType fromId(Integer id) {
        for (IdentificationType at : IdentificationType.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}