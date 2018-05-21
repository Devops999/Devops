package com.company.hrmanagement.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|id")
@Table(name = "HRMANAGEMENT_TRAINING_DETAILS_PRIOR_TO_JOINING")
@Entity(name = "hrmanagement$TrainingDetailsPriorToJoining")
public class TrainingDetailsPriorToJoining extends StandardEntity {
    private static final long serialVersionUID = 1465890839504321029L;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CODE_ID")
    protected AddEmployee code;

    @NotNull
    @Column(name = "TYPE_OF_TRAINING", nullable = false)
    protected Integer typeOfTraining;

    @Column(name = "FACULTY")
    protected String faculty;

    @NotNull
    @Column(name = "DURATION", nullable = false)
    protected String duration;

    @Temporal(TemporalType.DATE)
    @NotNull
    @Column(name = "YEAR_OF_TRAINING", nullable = false)
    protected Date yearOfTraining;

    public void setCode(AddEmployee code) {
        this.code = code;
    }

    public AddEmployee getCode() {
        return code;
    }


    public void setTypeOfTraining(Training typeOfTraining) {
        this.typeOfTraining = typeOfTraining == null ? null : typeOfTraining.getId();
    }

    public Training getTypeOfTraining() {
        return typeOfTraining == null ? null : Training.fromId(typeOfTraining);
    }


    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getDuration() {
        return duration;
    }

    public void setYearOfTraining(Date yearOfTraining) {
        this.yearOfTraining = yearOfTraining;
    }

    public Date getYearOfTraining() {
        return yearOfTraining;
    }


}