package com.utils;

import java.util.List;

import com.app.Customer;
import static java.time.LocalDate.*;

/**
 * TestUtils
 */
public class TestUtils {

    public static List<Customer> populateList(List<Customer> list) {
        list.add(new Customer("jim@gmail.com", "Hunter1", parse("2019-01-01"), 100d));
        list.add(new Customer("pam@gmail.com", "Hunter2", parse("2019-02-01"), 200d));
        list.add(new Customer("micheal@gmail.com", "Hunter3", parse("2019-03-01"), 300d));
        list.add(new Customer("angela@gmail.com", "Hunter4", parse("2019-04-01"), 400d));
        return list;

    }

    public static void menu() {
        System.out.println("Menu\n");
        System.out.println("1. Register New Customer");
        System.out.println("2. Link Address to Customer");
        System.out.println("3. Customer Login");
        System.out.println("4. Unsubscribe Customer");
        System.out.println("10. Exit");
    }
}