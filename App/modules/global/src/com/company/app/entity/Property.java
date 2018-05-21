package com.company.app.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;

import com.haulmont.cuba.core.entity.FileDescriptor;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.File;

//import java.io.FileDescriptor;

@Table(name = "APP_PROPERTY")
@Entity(name = "app$Property")
public class Property extends StandardEntity {
    private static final long serialVersionUID = -3000195043484283985L;

    
     @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IMAGE_FILE_ID")

    protected FileDescriptor imageFile;

    @NotNull
    @Column(name = "TYPE_", nullable = false)
    protected Integer type;

    @NotNull
    @Column(name = "CITY", nullable = false)
    protected String city;

    @NotNull
    @Column(name = "LOCALITY", nullable = false)
    protected String locality;

    @NotNull
    @Column(name = "BHK", nullable = false)
    protected Integer bhk;

    @NotNull
    @Column(name = "AREA_SQ_FT", nullable = false)
    protected Integer area_sq_ft;

    public void setImageFile(FileDescriptor imageFile) {
        this.imageFile = imageFile;
    }

    public FileDescriptor getImageFile() {
        return imageFile;
    }




    @NotNull
    @Column(name = "AGE_OF_CONSTRUCTION", nullable = false)
    protected String age_of_construction;

    @NotNull
    @Column(name = "PRICE", nullable = false)
    protected Integer price;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "SELLER_ID")
    protected Seller seller;

    public void setType(Type type) {
        this.type = type == null ? null : type.getId();
    }

    public Type getType() {
        return type == null ? null : Type.fromId(type);
    }


    public void setArea_sq_ft(Integer area_sq_ft) {
        this.area_sq_ft = area_sq_ft;
    }

    public Integer getArea_sq_ft() {
        return area_sq_ft;
    }




    public void setBhk(Bhk bhk) {
        this.bhk = bhk == null ? null : bhk.getId();
    }

    public Bhk getBhk() {
        return bhk == null ? null : Bhk.fromId(bhk);
    }

    public void setAge_of_construction(String age_of_construction) {
        this.age_of_construction = age_of_construction;
    }

    public String getAge_of_construction() {
        return age_of_construction;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getPrice() {
        return price;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public Seller getSeller() {
        return seller;
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


}