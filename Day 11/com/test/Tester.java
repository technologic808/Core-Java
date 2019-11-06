package com.test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import com.app.Customer;
import static com.utils.TestUtils.*;
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
        String email, password;
        LocalDate regDate;
        Double regAmount;

        try (Scanner sc = new Scanner(System.in)) {
            while (loop) {
                menu(); // Displays menu in console
                switch (option) {
                case 1:
                    // Register new Customer
                    System.out.println("Enter email: ");
                    email = sc.next();
                    System.out.println("Enter password: ");
                    password = sc.next();
                    System.out.println("Enter registration date: ");
                    regDate = parse(sc.next());
                    System.out.println("Enter amount: ");
                    regAmount = sc.nextDouble();
                    customerList.add(new Customer(email, password, regDate, regAmount));
                    break;

                case 2:
                    // Link Address to Customer
                    break;
                case 3:
                    // Customer Login

                    // Accepts email and password from user
                    System.out.println("Enter email: ");
                    email = sc.next();
                    System.out.println("Enter password: ");
                    password = sc.next();

                    // Checks if email and password match database
                    if (customerList.contains(new Customer(email, password)))
                        System.out.println("Congratulations! You are logged in!");
                    else
                        System.out.println("Error: Invalid email/password");

                    break;
                case 4:
                    // Unsubscribe Customer
                    System.out.println("Enter email: ");
                    email = sc.next();
                    System.out.println("Enter password: ");
                    password = sc.next();

                    if (customerList.remove(new Customer(email, password)))
                        System.out.println("Customer unsubscribed successfully!");
                    else
                        System.out.println("Error: Customer does not exist!");

                    break;
                case 10:
                    System.out.println("Thanks for using this application!");
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