// Problem 3: 
// Display food menu to user. 
// User will select items from menu along with the quantity. 
// Hard code food prices. (eg 1. Dosa 2. Samosa .......10 . Generate Bill ) 
// When user enters 'Generate Bill' option, display total bill & exit.
// Create above class in "tester" package

package tester;

import java.util.Scanner;

class Food {
    public static void menu() {
        System.out.println("______________MENU__________________\n\n");
        System.out.println("   Food Item        Price\n");
        System.out.println("1. Dosa             Rs. 50");
        System.out.println("2. Samosa           Rs. 15");
        System.out.println("3. Pattice          Rs. 20");
        System.out.println("4. Poha             Rs. 30");
        System.out.println("5. Idly             Rs. 30");
        System.out.println("6. Sandwich         Rs. 80");
        System.out.println("7. Pizza            Rs. 100");
        System.out.println("8. Burger           Rs. 120");
        System.out.println("9. Burrito          Rs. 150");
        System.out.println("\n10. Generate Bill\n");

        System.out.println("Please enter your choice ...");
    }

    public static void main(String[] args) {
        Boolean loop = true;
        Integer option = 0, quant = 0, bill = 0;
        Scanner sc = new Scanner(System.in);

        while (loop) {
            menu();
            option = sc.nextInt();
            if (option < 10) {
                System.out.println("Please enter the quantity in units ");
                quant = sc.nextInt();
            }

            switch (option) {
            case 1:
                bill += quant * 50;
                break;
            case 2:
                bill += quant * 15;
                break;
            case 3:
                bill += quant * 20;
                break;
            case 4:
                bill += quant * 30;
                break;
            case 5:
                bill += quant * 30;
                break;
            case 6:
                bill += quant * 80;
                break;
            case 7:
                bill += quant * 100;
                break;
            case 8:
                bill += quant * 120;
                break;
            case 9:
                bill += quant * 150;
                break;
            case 10:
                loop = false;
                sc.close();
                System.out.println("The total bill for your order is ");
                System.out.println("Rs. " + bill);
                break;

            default:
                break;
            }
        }
    }
}