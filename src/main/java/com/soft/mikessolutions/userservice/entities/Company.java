package com.soft.mikessolutions.userservice.entities;

import javax.persistence.*;

@Entity
public class Company extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String companyName;
    private String vatIdNumber;
    @ManyToOne
    private Address address;

    public Company() {
    }

    @Override
    public Long getId() {
        return id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getVatIdNumber() {
        return vatIdNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setVatIdNumber(String vatIdNumber) {
        this.vatIdNumber = vatIdNumber;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}