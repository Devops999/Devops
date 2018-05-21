package com.company.hrmanagement.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum Gender implements EnumClass<Integer> {

    Male(10),
    Female(20);

    private Integer id;

    Gender(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static Gender fromId(Integer id) {
        for (Gender at : Gender.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}