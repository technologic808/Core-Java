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
import java.util.HashMap;

public class Customer implements Comparable<Customer> {

    String email, password;
    Double regAmount;
    LocalDate regDate;
    HashMap<String, Address> addresses; // homeAddress, officeAddress
    CustType type;

    public Customer(String email, String password, LocalDate regDate, Double regAmount, CustType type) {
        this.addresses = new HashMap<>();
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

        this.addresses.put(type, new Address());

        addresses.get(type).setCity(city);
        addresses.get(type).setCountry(country);
        addresses.get(type).setState(state);
        addresses.get(type).setPhoneNo(phoneNo);
        addresses.get(type).setType(type);

        // if (type.equals("Home")) {
        // this.addresses.put("Home", new Address(city, state, country, phoneNo, type));
        // return true;
        // } else if (type.equals("Office")) {
        // this.addresses.put("Office", new Address(city, state, country, phoneNo,
        // type));
        // return true;
        // } else
        // throw new Exception("Error: Not a valid type of address");

    }

    @Override
    public String toString() {
        return "Customer [email=" + email + ", homeAddress=" + addresses.get("Home") + ", officeAddress="
                + addresses.get("Office") + ", password=" + password + ", regAmount=" + regAmount + ", regDate="
                + regDate + ", type=" + type + "]";
    }

    public CustType getType() {
        return type;
    }

    public void setType(CustType type) {
        this.type = type;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((email == null) ? 0 : email.hashCode());
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
        return true;
    }

    @Override
    public int compareTo(Customer o) {
        return this.email.compareTo(o.getEmail());
    }

    public LocalDate getRegDate() {
        return regDate;
    }

    public void setRegDate(LocalDate regDate) {
        this.regDate = regDate;
    }

}