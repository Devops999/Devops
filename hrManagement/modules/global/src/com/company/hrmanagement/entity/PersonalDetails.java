package com.company.hrmanagement.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.haulmont.cuba.core.entity.StandardEntity;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Table(name = "HRMANAGEMENT_PERSONAL_DETAILS")
@Entity(name = "hrmanagement$PersonalDetails")
public class PersonalDetails extends StandardEntity {
    private static final long serialVersionUID = -9047446736727709542L;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CODE_ID")
    protected AddEmployee code;

    @Temporal(TemporalType.DATE)
    @NotNull
    @Column(name = "DATE_OF_BIRTH", nullable = false)
    protected Date dateOfBirth;

    @NotNull
    @Column(name = "GENDER", nullable = false)
    protected Integer gender;

    @NotNull
    @Column(name = "NATIONALITY", nullable = false)
    protected Integer nationality;

    @NotNull
    @Column(name = "BLOOD_GROUP", nullable = false)
    protected Integer bloodGroup;

    @NotNull
    @Column(name = "MARITAL_STATUS", nullable = false)
    protected Integer maritalStatus;

    @Column(name = "DRIVING_LICENSE_NUMBER")
    protected String drivingLicenseNumber;

    public void setCode(AddEmployee code) {
        this.code = code;
    }

    public AddEmployee getCode() {
        return code;
    }


    public void setBloodGroup(BloodGroup bloodGroup) {
        this.bloodGroup = bloodGroup == null ? null : bloodGroup.getId();
    }

    public BloodGroup getBloodGroup() {
        return bloodGroup == null ? null : BloodGroup.fromId(bloodGroup);
    }


    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setGender(Gender gender) {
        this.gender = gender == null ? null : gender.getId();
    }

    public Gender getGender() {
        return gender == null ? null : Gender.fromId(gender);
    }

    public void setNationality(Nationality nationality) {
        this.nationality = nationality == null ? null : nationality.getId();
    }

    public Nationality getNationality() {
        return nationality == null ? null : Nationality.fromId(nationality);
    }

    public void setMaritalStatus(MaritalStatus maritalStatus) {
        this.maritalStatus = maritalStatus == null ? null : maritalStatus.getId();
    }

    public MaritalStatus getMaritalStatus() {
        return maritalStatus == null ? null : MaritalStatus.fromId(maritalStatus);
    }

    public void setDrivingLicenseNumber(String drivingLicenseNumber) {
        this.drivingLicenseNumber = drivingLicenseNumber;
    }

    public String getDrivingLicenseNumber() {
        return drivingLicenseNumber;
    }


}