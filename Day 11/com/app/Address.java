package com.app;

// (Customer HAS-A Address)
// How will you add multiple addresses?
// Address -- city,state,country,phoneNo,type

/**
 * Address
 */
public class Address {
    String city, state, country, phoneNo, type;

    public String getType() {
        return type;
    }

    public Address(String city, String state, String country, String phoneNo, String type) {
        this.city = city;
        this.state = state;
        this.country = country;
        this.phoneNo = phoneNo;
        this.type = type;
    }
}