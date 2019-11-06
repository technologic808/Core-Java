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

import java.time.LocalDate;

/**
 * Customer
 */
public class Customer {

    String email, password;
    Double regAmount;
    LocalDate regDate;
    Address homeAddress, officeAddress;
    CustType type;

    public Customer(String email, String password, LocalDate regDate, Double regAmount, CustType type) {
        this.email = email;
        this.password = password;
        this.regDate = regDate;
        this.regAmount = regAmount;
        this.type = type;
    }

    public Customer(String email2, String password2) {
        email = email2;
        password = password2;
    }

    public void linkAddress(String city, String state, String country, String phoneNo, String type) throws Exception {

        if (type == "Home")
            homeAddress = new Address(city, state, country, phoneNo, type);
        else if (type == "Office")
            officeAddress = new Address(city, state, country, phoneNo, type);
        else
            throw new Exception("Error: Not a valid type of address");
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((password == null) ? 0 : password.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Customer other = (Customer) obj;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        if (password == null) {
            if (other.password != null)
                return false;
        } else if (!password.equals(other.password))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Customer [email=" + email + ", homeAddress=" + homeAddress + ", officeAddress=" + officeAddress
                + ", password=" + password + ", regAmount=" + regAmount + ", regDate=" + regDate + ", type=" + type
                + "]";
    }

    public CustType getType() {
        return type;
    }

    public void setType(CustType type) {
        this.type = type;
    }

}