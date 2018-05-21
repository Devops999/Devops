package com.company.hrmanagement.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum Relation implements EnumClass<Integer> {

    Father(10),
    Mother(20),
    Brother(30),
    Sister(40),
    Spouse(50),
    Son(60),
    Daughter(70),
    Other(80);

    private Integer id;

    Relation(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static Relation fromId(Integer id) {
        for (Relation at : Relation.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}