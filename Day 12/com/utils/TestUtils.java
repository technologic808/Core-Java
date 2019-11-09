package com.utils;

import java.util.ArrayList;
import java.util.List;

import com.app.CustType;
import com.app.Customer;
import static java.time.LocalDate.*;

/**
 * TestUtils
 */
public class TestUtils {

    public static List<Customer> populateList(List<Customer> list) {
        list.add(new Customer("jim@gmail.com", "Hunter1", parse("2019-01-01"), 100d, CustType.SILVER));
        list.add(new Customer("pam@gmail.com", "Hunter2", parse("2019-02-01"), 200d, CustType.GOLD));
        list.add(new Customer("micheal@gmail.com", "Hunter3", parse("2019-03-01"), 300d, CustType.PLATINUM));
        list.add(new Customer("angela@gmail.com", "Hunter4", parse("2019-04-01"), 400d, CustType.SILVER));
        return list;

    }

    public static void menu() {
        System.out.println("Menu\n");
        System.out.println("1. Register New Customer");
        System.out.println("2. Link Address to Customer");
        System.out.println("3. Customer Login");
        System.out.println("4. Unsubscribe Customer");
        System.out.println("5. Display all customers by type");
        System.out.println("6. Update Address");
        System.out.println("7. Sort Customers by Email: "); // Natural Ordering
        System.out.println("8. Sort Customers by Reg Date: "); // Custom Ordering
        System.out.println("10. Exit");
    }

    public static void unsubscribe(String email, String password, ArrayList<Customer> customerList) throws Exception {
        for (Customer c : customerList) {
            if (c.getEmail().equals(email) && c.getPassword().equals(password)) {
                if (!customerList.remove(c))
                    throw new Exception("Error: Unsubscription has failed!");
            }
        }
    }

    public static void sortByEmail(ArrayList<Customer> customerList) {

    }
}