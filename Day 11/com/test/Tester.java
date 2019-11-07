package com.test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import com.app.CustType;
import com.app.Customer;
import static com.utils.TestUtils.*;
import static com.utils.validationUtils.*;
import static java.time.LocalDate.*;

/**
 * Tester
 */
public class Tester {

    public static void main(String[] args) {
        ArrayList<Customer> customerList = new ArrayList<>();
        populateList(customerList);

        Boolean loop = true;
        Integer option = 0;
        String email, password, city, state, country, phoneNo, addType;
        LocalDate regDate;
        Double regAmount;
        String custType;

        try (Scanner sc = new Scanner(System.in)) {
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

                    customerList.add(new Customer(email, password, regDate, regAmount, CustType.valueOf(custType)));
                    break;

                case 2:
                    // Link Address to Customer

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

                    loginValidation(customerList).linkAddress(city, state, country, phoneNo, addType);

                    break;
                case 3:
                    // Customer Login
                    // Checks if email and password match database
                    loginValidation(customerList);

                    // Success message
                    System.out.println("You are successfully logged in!");

                    break;
                case 4:
                    // Unsubscribe Customer
                    System.out.println("Enter email: ");
                    email = sc.next();
                    System.out.println("Enter password: ");
                    password = sc.next();

                    unsubscribe(email, password, customerList);

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
                case 6:
                    // Update Address
                    // Same as Linking new address?
                    // Just use option to link new address

                    break;

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