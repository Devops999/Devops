package com.company.hrmanagement.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import java.util.Date;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.haulmont.chile.core.annotations.NamePattern;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@NamePattern("%s|id")
@Table(name = "HRMANAGEMENT_EXPERIENCE_DETAILS")
@Entity(name = "hrmanagement$ExperienceDetails")
public class ExperienceDetails extends StandardEntity {
    private static final long serialVersionUID = -206078326680386660L;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CODE_ID")
    protected AddEmployee code;

    @NotNull
    @Column(name = "EMPLOYER_NAME", nullable = false)
    protected String employerName;

    @Lob
    @NotNull
    @Column(name = "EMPLOYER_ADDRESS", nullable = false)
    protected String employerAddress;

    @NotNull
    @Column(name = "CONTACT_NUMBER", nullable = false)
    protected Integer contactNumber;

    @NotNull
    @Column(name = "EMAIL", nullable = false)
    protected String email;

    @NotNull
    @Column(name = "DESIGNATION", nullable = false)
    protected String designation;

    @Temporal(TemporalType.DATE)
    @NotNull
    @Column(name = "DATE_OF_JOINING", nullable = false)
    protected Date dateOfJoining;

    @Temporal(TemporalType.DATE)
    @NotNull
    @Column(name = "DATE_OF_LEAVING", nullable = false)
    protected Date dateOfLeaving;

    @NotNull
    @Column(name = "LAST_SALARY", nullable = false)
    protected Integer lastSalary;



    public void setCode(AddEmployee code) {
        this.code = code;
    }

    public AddEmployee getCode() {
        return code;
    }


    public void setContactNumber(Integer contactNumber) {
        this.contactNumber = contactNumber;
    }

    public Integer getContactNumber() {
        return contactNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDateOfJoining(Date dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public Date getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfLeaving(Date dateOfLeaving) {
        this.dateOfLeaving = dateOfLeaving;
    }

    public Date getDateOfLeaving() {
        return dateOfLeaving;
    }

    public void setLastSalary(Integer lastSalary) {
        this.lastSalary = lastSalary;
    }

    public Integer getLastSalary() {
        return lastSalary;
    }


    public void setEmployerName(String employerName) {
        this.employerName = employerName;
    }

    public String getEmployerName() {
        return employerName;
    }

    public void setEmployerAddress(String employerAddress) {
        this.employerAddress = employerAddress;
    }

    public String getEmployerAddress() {
        return employerAddress;
    }


}