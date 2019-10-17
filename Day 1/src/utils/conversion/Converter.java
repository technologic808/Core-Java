// 4. Write a class Converter.java , in package "utils.conversion"
// Add static methods for conversion & returning result to caller.

// 4.1 Convert pounds to kilogram(1 pound=0.4536 Kg)
// eg : I/P 100
// O/p 45.36Kg

// 4.2 Convert the temperature in Celsius to Fahrenheit (F = C * 9/5 + 32)

// 4.3 Convert seconds into a formatted string , to display hour,min,seconds
// eg : I/P 67890
// O/P 18h51m30s

package utils.conversion;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        boolean loop = true;
        int option = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\n\n\n\n\n\n\n\n\nWelcome to ACTS java converter class\n\n");
        while (loop) {
            System.out.println("\nChoose an option...\n");
            System.out.println("1. Convert Pounds to Kilograms");
            System.out.println("2. Convert Celsius to Fahrenheit");
            System.out.println("3. Convert seconds to time format HHhMMmSSs\n");
            System.out.println("\n4. EXIT");

            option = sc.nextInt();

            switch (option) {
            case 1:
                System.out.println("Please enter weight in pounds: ");
                System.out.println(poundsToKilos(sc.nextDouble()) + " kg\n");
                break;
            case 2:
                System.out.println("Please enter the temprature in Celsius: ");
                System.out.println(celsiusToFahrenheit(sc.nextDouble()) + " F\n");
                break;
            case 3:
                System.out.println("Please enter the time in seconds: ");
                System.out.println(timeToString(sc.nextInt()) + "\n");
                break;
            case 4:
                loop = false;
                System.out.println("\nThanks for using ACTS converter java class\n");
                sc.close();
                break;
            default:
                System.out.println("Please enter a valid option!\n");
                break;
            }
        }
    }

    public static double poundsToKilos(double pounds) {
        return pounds * 0.4536;
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * (9 / 5)) + 32;
    }

    public static String timeToString(int seconds) {
        int hours, minutes;
        hours = seconds / 3600;
        seconds = seconds % 3600;
        minutes = seconds / 60;
        seconds = seconds % 60;
        return String.valueOf(hours) + "h" + String.valueOf(minutes) + "m" + String.valueOf(seconds) + "s";
    }
}