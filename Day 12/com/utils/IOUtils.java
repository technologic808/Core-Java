package com.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.app.Customer;

/**
 * IOUtils
 */
public class IOUtils {

    public static void save(ArrayList<Customer> customerList) throws IOException {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("CustomersList.ser"))) {
            out.writeObject(customerList);
        }

    }

    public static ArrayList<Customer> restore() throws FileNotFoundException, IOException, ClassNotFoundException {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("CustomersList.ser"))) {
            return (ArrayList<Customer>) in.readObject();
        }
    }

}
