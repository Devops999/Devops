package com.company.hrmanagement.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.haulmont.cuba.core.entity.FileDescriptor;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|code")
@Table(name = "HRMANAGEMENT_ADD_EMPLOYEE")
@Entity(name = "hrmanagement$AddEmployee")
public class AddEmployee extends StandardEntity {
    private static final long serialVersionUID = 761422302570549404L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IMAGE_FILE_ID")
    protected FileDescriptor imageFile;

    @NotNull
    @Column(name = "CODE", nullable = false)
    protected Integer code;

    public void setImageFile(FileDescriptor imageFile) {
        this.imageFile = imageFile;
    }

    public FileDescriptor getImageFile() {
        return imageFile;
    }


    @NotNull
    @Column(name = "FIRST_NAME", nullable = false)
    protected String firstName;

    @NotNull
    @Column(name = "MIDDLE_NAME", nullable = false)
    protected String middleName;

    @NotNull
    @Column(name = "LAST_NAME", nullable = false)
    protected String lastName;

    public void setCode(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }



    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }


}