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

package com.app;

public class Calculator{
    private Double firstNumber, secondNumber;
    
    public void setFirstNumber(Double num){
        firstNumber = num;
    }
    public void setSecondNumber(Double num){
        secondNumber = num;
    }

    public Double getFirstNumber(){
        return firstNumber;
    }

    public Double getSecondNumber(){
        return secondNumber;
    }
}