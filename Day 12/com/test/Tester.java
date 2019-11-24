package com.test;

import static com.utils.IOUtils.restore;
import static com.utils.IOUtils.save;
import static com.utils.TestUtils.menu;
import static com.utils.TestUtils.unsubscribe;
import static com.utils.validationUtils.loginValidation;
import static java.time.LocalDate.parse;

import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import com.app.CustType;
import com.app.Customer;

/**
 * Tester
 */
public class Tester {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            ArrayList<Customer> customerList;
            try {
                customerList = (ArrayList<Customer>) restore();
            } catch (FileNotFoundException e) {
                customerList = new ArrayList<Customer>();
            }

            // populateList(customerList);

            Boolean loop = true;
            Integer option = 0;
            String email, password, city, state, country, phoneNo, addType;
            LocalDate regDate;
            Double regAmount;
            String custType;

            while (loop) {
                menu(); // Displays menu in console
                option = sc.nextInt();
                switch (option) {
                case 1:
                    // Register new Customer
                    System.out.println("Enter email: ");
                    email = sc.next();
                    System.out.println("Enter password: ");
                    password = sc.next();
                    System.out.println("Enter registration date (YYYY-MM-DD): ");
                    regDate = parse(sc.next());
                    System.out.println("Enter amount: ");
                    regAmount = sc.nextDouble();
                    System.out.println("Enter customer type(SILVER/GOLD/PLATINUM): ");
                    custType = sc.next();
                    try {
                        customerList.add(new Customer(email, password, regDate, regAmount, CustType.valueOf(custType)));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    break;

                case 6:
                    // Update Address
                    // Same as Linking new address?
                    // Just use option to link new address

                case 2:
                    // Link Address to Customer

                    Customer temp = null;

                    try {
                        temp = loginValidation(customerList, sc);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    System.out.println("Returned customer after validation is " + temp);

                    System.out.println("Enter City: ");
                    city = sc.next();
                    System.out.println("Enter State: ");
                    state = sc.next();
                    System.out.println("Enter Country: ");
                    country = sc.next();
                    System.out.println("Enter Phone: ");
                    phoneNo = sc.next();
                    System.out.println("Enter Address type (Home/Office): ");
                    addType = sc.next();

                    try {
                        temp.linkAddress(city, state, country, phoneNo, addType);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    break;
                case 3:
                    // Customer Login
                    // Checks if email and password match database
                    try {
                        loginValidation(customerList, sc);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    // Success message
                    System.out.println("You are successfully logged in!");

                    break;
                case 4:
                    // Unsubscribe Customer
                    System.out.println("Enter email: ");
                    email = sc.next();
                    System.out.println("Enter password: ");
                    password = sc.next();

                    try {
                        unsubscribe(email, password, customerList);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    // Success
                    System.out.println("Customer has been unsubscribed!");

                    break;
                case 5:
                    // Display all customers by type
                    System.out.println("Enter customer type(SILVER/GOLD/PLATINUM): ");
                    custType = sc.next();
                    for (Customer c : customerList) {
                        if (c.getType().toString().equals(custType))
                            System.out.println(c);
                    }

                case 7:
                    // Sort Customers by Email using Natural Ordering
                    Collections.sort(customerList);
                    break;

                case 8:
                    // Sort Customers by Reg Date using Custom Ordering
                    customerList.sort(new Comparator<Customer>() {

                        @Override
                        public int compare(Customer c1, Customer c2) {
                            return c1.getRegDate().compareTo(c2.getRegDate());
                        }

                    });
                    break;

                case 10:
                    System.out.println("Thanks for using this application!");
                    loop = false;
                    try {
                        save(customerList);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;

                default:
                    System.out.println("Please enter a valid option!");
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}