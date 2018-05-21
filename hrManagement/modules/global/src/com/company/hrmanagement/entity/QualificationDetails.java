package com.company.hrmanagement.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@NamePattern("%s|id")
@Table(name = "HRMANAGEMENT_QUALIFICATION_DETAILS")
@Entity(name = "hrmanagement$QualificationDetails")
public class QualificationDetails extends StandardEntity {
    private static final long serialVersionUID = 5146877368591479188L;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CODE_ID")
    protected AddEmployee code;

    @NotNull
    @Column(name = "LEVEL_", nullable = false)
    protected Integer level;

    @NotNull
    @Column(name = "DEGREE", nullable = false)
    protected String degree;

    @Column(name = "SCHOOL_OR_COLLAGE")
    protected String schoolOrCollage;

    @Column(name = "BOARD_OF_UNIVERSITY")
    protected String boardOfUniversity;

    @Column(name = "YEAR_OF_QUALIFICATION")
    protected Integer yearOfQualification;

    @NotNull
    @Column(name = "DIVISSION", nullable = false)
    protected Integer divission;

    @Column(name = "PERCENTAGE")
    protected String percentage;


    public void setCode(AddEmployee code) {
        this.code = code;
    }

    public AddEmployee getCode() {
        return code;
    }


    public void setLevel(Levels level) {
        this.level = level == null ? null : level.getId();
    }

    public Levels getLevel() {
        return level == null ? null : Levels.fromId(level);
    }

    public void setDivission(Class divission) {
        this.divission = divission == null ? null : divission.getId();
    }

    public Class getDivission() {
        return divission == null ? null : Class.fromId(divission);
    }


    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getDegree() {
        return degree;
    }

    public void setSchoolOrCollage(String schoolOrCollage) {
        this.schoolOrCollage = schoolOrCollage;
    }

    public String getSchoolOrCollage() {
        return schoolOrCollage;
    }

    public void setBoardOfUniversity(String boardOfUniversity) {
        this.boardOfUniversity = boardOfUniversity;
    }

    public String getBoardOfUniversity() {
        return boardOfUniversity;
    }

    public void setYearOfQualification(Integer yearOfQualification) {
        this.yearOfQualification = yearOfQualification;
    }

    public Integer getYearOfQualification() {
        return yearOfQualification;
    }

    public void setPercentage(String percentage) {
        this.percentage = percentage;
    }

    public String getPercentage() {
        return percentage;
    }


}