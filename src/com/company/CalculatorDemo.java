package com.company;

import java.util.Scanner;

public class CalculatorDemo {

    public static void main(String[] args) {
	// write your code here
        Calculator calculator = new Calculator();
        Scanner scan = new Scanner(System.in);
        boolean isNumber;
        System.out.println("Enter two number values the will define the width and height of a rectangle. ");

     do {
         if (scan.hasNextInt()) {
             int measurement1 = scan.nextInt();
             System.out.println("Enter your second number. ");
             int measurement2 = scan.nextInt();
             calculator.setArea(measurement1, measurement2);
             isNumber = true;
         } else {
             System.out.println("I don't understand, please enter a number");
             isNumber = false;
             scan.next();
         }

     } while (!isNumber);

//        calculator.setShape();

        System.out.println("The area of my rectangle is "+ calculator.getArea());


    }
}
