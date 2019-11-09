package com.app;

import java.io.Serializable;

// (Customer HAS-A Address)
// How will you add multiple addresses?
// Address -- city,state,country,phoneNo,type

/**
 * Address
 */
public class Address implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    String city, state, country, phoneNo, type;

    public Address(String city, String state, String country, String phoneNo, String type) {
        this.city = city;
        this.state = state;
        this.country = country;
        this.phoneNo = phoneNo;
        this.type = type;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Address() {
    }

    @Override
    public String toString() {
        return "Address [city=" + city + ", country=" + country + ", phoneNo=" + phoneNo + ", state=" + state
                + ", type=" + type + "]";
    }
}