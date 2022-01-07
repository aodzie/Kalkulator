package com.kodilla.kalkulator;

public class Calculator {
    int a;
    int b;

    public void someMethod (){
        System.out.println("It works!");
    }

    public int addNumbers(int a, int b){
        return a+b;
    }

    public int subtraction(int a, int b){
        return a-b;
    }

    public static void main(String[] args){
        Calculator calculator = new Calculator();
        calculator.someMethod();
        System.out.println(calculator.addNumbers(1, 2));
        System.out.println(calculator.subtraction(10,5));
    }
}
