// 2. Create a class Calculator(in package com.app) 
// with 2 private double data members firstNumber & secondNumber.
// Supply getters & setters.
// Add 4 instance methods add,subtract,multiply & divide , 
// without parameters , to return result of calculation.
// Divide method should return 0 in case of 0 denominator.
// Create a TestCalculator class (in package tester) with scanner.
// Accept 2 numbers from user & set them in Calculator.
// Menu 1: Add
// 2 : Subtract 
// 3 : Multiply
// 4 : Divide
// 5 :Exit.

package tester;

import com.app.*;
import java.util.*;

class TestCalculator{
    public static void main(String[] args) {
        Boolean loop = true ;
        Integer option = 0;
        Scanner sc = new Scanner(System.in);
        Calculator cal = new Calculator();

        System.out.println("\n\n\n\n\n\n\n\n\n\nWelcome to ACTS calculator\n\n");

        while (loop) {
            // Accept 2 numbers from user & set them in Calculator.
            System.out.println("\nPlease enter two numbers : ");
            cal.setFirstNumber(sc.nextDouble());
            cal.setSecondNumber(sc.nextDouble());

            System.out.println("___________________MENU____________________\n");

            // Menu 
            // 1 :  Add
            // 2 :  Subtract 
            // 3 :  Multiply
            // 4 :  Divide
            // 5 :  Exit

            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");

            // Ask user to select an option

            System.out.println("\nPlease select an option");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("\nAddition of two numbers is ");
                    System.out.println(cal.getFirstNumber() + cal.getSecondNumber());
                    break;

                case 2:
                    System.out.println("\nSubtraction of two numbers is ");
                    System.out.println(cal.getFirstNumber() - cal.getSecondNumber());
                    break;

                case 3:
                    System.out.println("\nMultiplication of two numbers is ");
                    System.out.println(cal.getFirstNumber() * cal.getSecondNumber());
                    break;

                case 4:
                    if (cal.getSecondNumber() == 0) {
                        System.out.println("\nCannot Divide by Zero");
                        break;
                    }
                    System.out.println("\nDivision of two numbers is ");
                    System.out.println(cal.getFirstNumber() / cal.getSecondNumber());  
                    break;
                
                case 5:
                    loop = false;
                    sc.close();
                    break;

                default:
                    System.out.println("\nPlease enter a valid option");
                    break;
            }
        }
    }
   
}