package com.company.hrmanagement.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum ReportCode implements EnumClass<Integer> {

    UAT7890(10),
    Devops7899(20),
    Operations70(30),
    ServiceDesk89(40);

    private Integer id;

    ReportCode(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static ReportCode fromId(Integer id) {
        for (ReportCode at : ReportCode.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}