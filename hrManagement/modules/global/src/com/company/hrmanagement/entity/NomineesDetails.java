package com.company.hrmanagement.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@NamePattern("%s|id")
@Table(name = "HRMANAGEMENT_NOMINEES_DETAILS")
@Entity(name = "hrmanagement$NomineesDetails")
public class NomineesDetails extends StandardEntity {
    private static final long serialVersionUID = 7219486588146577538L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CODE_ID")
    protected AddEmployee code;

    @NotNull
    @Column(name = "TYPES_OF_SCHEME", nullable = false)
    protected Integer typesOfScheme;

    @NotNull
    @Column(name = "NAME", nullable = false)
    protected String name;

    @NotNull
    @Column(name = "RELATIONSHIP", nullable = false)
    protected Integer relationship;

    @NotNull
    @Column(name = "MINOR_NOMINEE", nullable = false)
    protected Integer minorNominee;

    @NotNull
    @Lob
    @Column(name = "ADDRESS", nullable = false)
    protected String address;

    @NotNull
    @Column(name = "SHARE_", nullable = false)
    protected Integer share;

    @Temporal(TemporalType.DATE)
    @NotNull
    @Column(name = "DATE_OF_BIRTH", nullable = false)
    protected Date dateOfBirth;

    @NotNull
    @Column(name = "GURDIAN_NAME", nullable = false)
    protected String gurdianName;

    @Lob
    @Column(name = "GURDIAN_ADDRESS")
    protected String gurdianAddress;

    public AddEmployee getCode() {
        return code;
    }

    public void setCode(AddEmployee code) {
        this.code = code;
    }







    public void setMinorNominee(MinorNominee minorNominee) {
        this.minorNominee = minorNominee == null ? null : minorNominee.getId();
    }

    public MinorNominee getMinorNominee() {
        return minorNominee == null ? null : MinorNominee.fromId(minorNominee);
    }


    public void setTypesOfScheme(NomineeScheme typesOfScheme) {
        this.typesOfScheme = typesOfScheme == null ? null : typesOfScheme.getId();
    }

    public NomineeScheme getTypesOfScheme() {
        return typesOfScheme == null ? null : NomineeScheme.fromId(typesOfScheme);
    }

    public void setRelationship(Relation relationship) {
        this.relationship = relationship == null ? null : relationship.getId();
    }

    public Relation getRelationship() {
        return relationship == null ? null : Relation.fromId(relationship);
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setShare(Integer share) {
        this.share = share;
    }

    public Integer getShare() {
        return share;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setGurdianName(String gurdianName) {
        this.gurdianName = gurdianName;
    }

    public String getGurdianName() {
        return gurdianName;
    }

    public void setGurdianAddress(String gurdianAddress) {
        this.gurdianAddress = gurdianAddress;
    }

    public String getGurdianAddress() {
        return gurdianAddress;
    }


}