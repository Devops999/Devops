package com.company.bicycleapps2.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum Status implements EnumClass<Integer> {

    NEW(10),
    IN_PROGRESS(20),
    READY(30);

    private Integer id;

    Status(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static Status fromId(Integer id) {
        for (Status at : Status.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}