package com.company.task.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;

import com.haulmont.cuba.core.entity.FileDescriptor;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;

@Table(name = "TASK_PROPERTY")
@Entity(name = "task$Property")
public class Property extends StandardEntity {
    private static final long serialVersionUID = 4394391206838535921L;    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IMAGE_FILE_ID")
    protected FileDescriptor imageFile;

    public void setImageFile(FileDescriptor imageFile) {
        this.imageFile = imageFile;
    }

    public FileDescriptor getImageFile() {
        return imageFile;
    }
    @Column(name = "TYPE_", nullable = false)
    protected Integer type;

    @Column(name = "CITY")
    protected String city;

    @Column(name = "LOCALITY")
    protected String locality;

    @NotNull
    @Column(name = "UNITS", nullable = false)
    protected Integer units;

    @Column(name = "AREA_SQ_FT")
    protected String areaSqFt;

    @Column(name = "AGE_OF_CONSTRUCTION")
    protected String ageOfConstruction;

    @Column(name = "PRICE")
    protected String price;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SELLER_ID")
    protected Seller seller;

    @Lob
    @Column(name = "ENQUIRY")
    protected String enquiry;

    public void setAreaSqFt(String areaSqFt) {
        this.areaSqFt = areaSqFt;
    }

    public String getAreaSqFt() {
        return areaSqFt;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPrice() {
        return price;
    }


    public void setAgeOfConstruction(String ageOfConstruction) {
        this.ageOfConstruction = ageOfConstruction;
    }

    public String getAgeOfConstruction() {
        return ageOfConstruction;
    }


    public void setType(Type type) {
        this.type = type == null ? null : type.getId();
    }

    public Type getType() {
        return type == null ? null : Type.fromId(type);
    }


    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getLocality() {
        return locality;
    }

    public void setUnits(Units units) {
        this.units = units == null ? null : units.getId();
    }

    public Units getUnits() {
        return units == null ? null : Units.fromId(units);
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setEnquiry(String enquiry) {
        this.enquiry = enquiry;
    }

    public String getEnquiry() {
        return enquiry;
    }





}