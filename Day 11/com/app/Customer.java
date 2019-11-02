// Customer class 
// data members -- email(unique),password , reg amount,regDate(Date), 
// type (enum : SILVER/GOLD/PLATINUM)
// address(home address , office address,....)
// Provide suitable constr to accept all details excluding address.
// (Customer HAS-A Address)
// How will you add multiple addresses?
// Address -- city,state,country,phoneNo,type
// Add a method linkAddress, to assign address to customer
// eg : In Customer class ,
// public void linkAddress(String city,String state,String country,String phoneNo,String type)

package com.app;

import java.util.Date;

/**
 * Customer
 */
public class Customer {

    String email, password, regDateString;
    Double regAmount;
    Date regDate; // Date regDate = new SimpleDateFormat("dd.MM.yyyy").parse(regDateString);
    Address homeAddress, officeAddress;

    public Customer(String email, String password, String regDateString, Double regAmount) {
        this.email = email;
        this.password = password;
        this.regDateString = regDateString;
        this.regAmount = regAmount;
    }

    public boolean linkAddress(String city, String state, String country, String phoneNo, String type) {

        if (type == "Home") {
            homeAddress = new Address(city, state, country, phoneNo, type);
            return true;
        }
        if (type == "Office") {
            officeAddress = new Address(city, state, country, phoneNo, type);
            return true;
        }
        return false;
    }

}