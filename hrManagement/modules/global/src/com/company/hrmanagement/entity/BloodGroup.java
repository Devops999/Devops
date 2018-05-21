package com.company.hrmanagement.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum BloodGroup implements EnumClass<Integer> {

    A_Positive(10),
    B_Positive(20),
    AB_Positive(30),
    O_Positive(40);

    private Integer id;

    BloodGroup(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static BloodGroup fromId(Integer id) {
        for (BloodGroup at : BloodGroup.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}