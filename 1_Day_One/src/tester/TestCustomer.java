// Day 2
// 1. Create a Customer class , in a package com.cdac.core with data members
// name(string),email(string),age(int), creditLimit(double)
// 1.1 Supply a parameterized constructor to accept all details from user
// 1.2 Supply an argument less constructor to init name to "Rama" ,
// email to "rama@gmail.com",age=25,creditLimit=10000
// 1.3 Supply another constructor , to init creditLimit to 15000, taking rest of
// the i/ps from user.
// 1.4 Write a method , getDetails to return string form of customer name &
// credit limit details.
// 1.5 Supply getter & setter for creditLimit.

// Must make use of this(...) for constructor chaining.

// 1.6 Write a TestCustomer class in "tester" package , to test all of above.
// Using Scanner , accept customer details suitably & test all 3 constructors.
// Display customer details.
// Increase credit limit of the 1st customer by 1000 & display details again.

package tester;

import java.util.Scanner;

import com.cdac.core.*;

class TestCustomer {
    public static void main(String[] args) {
        // Declare variables
        String name, email;
        int age;
        double creditLimit;

        Scanner sc = new Scanner(System.in);
        System.out.println("\n\n\n\n\n\n\n\n\n\nWelcome to Tester program for Customer Class\n\n");

        // Take input from user
        System.out.println("Please enter Name: ");
        name = sc.nextLine();
        System.out.println("Please enter Email: ");
        email = sc.nextLine();
        System.out.println("Please enter Age: ");
        age = sc.nextInt();
        System.out.println("Please enter Credit Limit: ");
        creditLimit = sc.nextDouble();

        // Test constructors

        // Default constructor
        Customer c1 = new Customer();
        System.out.println("\nDefault Constructor");
        System.out.println(c1.getDetails());

        // Parametrized constructor
        Customer c2 = new Customer(name, email, age, creditLimit);
        System.out.println("\nParametrized Constructor");
        System.out.println(c2.getDetails());

        // Chained Constructor
        Customer c3 = new Customer(name, email, age);
        System.out.println("\nParametrized Constructor");
        System.out.println(c3.getDetails());

        // Increase credit limit of the 1st customer by 1000
        // & display details again.
        c1.setCreditLimit(c1.getCreditLimit() + 1000);
        System.out.println("\nNew Credit Limit");
        System.out.println(c1.getDetails());

        sc.close();
    }
}