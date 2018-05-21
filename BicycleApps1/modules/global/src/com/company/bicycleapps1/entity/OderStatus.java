package com.company.bicycleapps1.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum OderStatus implements EnumClass<Integer> {

    NEW(10),
    IN_PROGRESS(20),
    READY(30);

    private Integer id;

    OderStatus(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static OderStatus fromId(Integer id) {
        for (OderStatus at : OderStatus.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}