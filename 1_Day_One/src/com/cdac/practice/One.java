// 1. Accept any numbers as command line arguments from user. If user supplies less than 2 arguments supply error message & terminate. If  correct, compute average & display the same.
// (args.length = to find array size 
// Double.parseDouble(s) for parsing double values)

package com.cdac.practice;

class One{
    public static void main(String[] args) {
        if (args.length < 2){
            System.out.println("Please enter two or more arguments");
            return;
        }
        double sum = 0;
        for(int i = 0; i < args.length; i++){
            sum = sum + Double.parseDouble(args[i]);
        }
        System.out.println("The average is ");
        System.out.println(sum/args.length);
    }
}