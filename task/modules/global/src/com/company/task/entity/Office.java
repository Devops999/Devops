package com.company.task.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.haulmont.cuba.core.entity.StandardEntity;
import javax.persistence.Column;
import javax.persistence.Lob;

@Table(name = "TASK_OFFICE")
@Entity(name = "task$Office")
public class Office extends StandardEntity {
    private static final long serialVersionUID = -4302085097025234737L;

    @Column(name = "HEAD_OFFICE")
    protected String headOffice;

    @Column(name = "OWN_PROFILE")
    protected String ownProfile;

    @Lob
    @Column(name = "REPORTS")
    protected String reports;

    @Column(name = "MORTAGE")
    protected String mortage;

    public void setHeadOffice(String headOffice) {
        this.headOffice = headOffice;
    }

    public String getHeadOffice() {
        return headOffice;
    }

    public void setOwnProfile(String ownProfile) {
        this.ownProfile = ownProfile;
    }

    public String getOwnProfile() {
        return ownProfile;
    }

    public void setReports(String reports) {
        this.reports = reports;
    }

    public String getReports() {
        return reports;
    }

    public void setMortage(String mortage) {
        this.mortage = mortage;
    }

    public String getMortage() {
        return mortage;
    }


}