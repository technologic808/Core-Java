package com.utils;

import java.util.ArrayList;
import java.util.Scanner;

import com.app.Customer;

/**
 * validationUtils
 */
public class validationUtils {

    public static Customer loginValidation(ArrayList<Customer> list, Scanner sc) throws Exception {
        // Accepts email and password from user
        try {
            System.out.println("Enter email: ");
            String email = sc.next();
            System.out.println("Enter password: ");
            String password = sc.next();
            for (Customer c : list) {
                if (c.getEmail().equals(email) && c.getPassword().equals(password))
                    return c;
            }
            throw new Exception("Error: Invalid username/password");
        } finally {
        }
    }
}