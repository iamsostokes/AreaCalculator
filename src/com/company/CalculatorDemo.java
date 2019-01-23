package com.company;

import java.util.Scanner;

public class CalculatorDemo {

    public static void main(String[] args) {
	// write your code here
        Calculator calculator = new Calculator();
        Scanner scan = new Scanner(System.in);
        boolean isNumber;
        boolean isNumber2;
//        boolean result;

//        System.out.println("Enter 1 if you would like to make a rectangle or enter 2 if you would like to make a triangle ");
//        do {
//            if (scan.hasNext()) {
//                int rectangleOrTriangle = scan.nextInt(1);
//                calculator.setShape("rectangle");
//                result = true;
//            } else {
//                result = false;
//                scan.next();
//            }
//
//        } while (!result);



        System.out.println("Enter two number values the will define the width and height of a rectangle ");
//      this do while loop is created to validate the user input for the rectangle
     do {
         if (scan.hasNextInt()) {
             // storing the user input into a variable
             int measurement1 = scan.nextInt();
             System.out.println("Enter your second number. ");
             int measurement2 = scan.nextInt();
             // setting the user input to my method
             calculator.setArea(measurement1, measurement2);
             isNumber = true;
         } else {
             System.out.println("I don't understand, please enter a number");
             isNumber = false;
             scan.next();
         }

     } while (!isNumber);

        System.out.println("Now enter two numbers to find the area of a triangle ");
//      this do while loop was created to validate the user input for the triangle
        do {
            if (scan.hasNextInt()) {
                int measurement3 = scan.nextInt();
                System.out.println("Enter your second number. ");
                int measurement4 = scan.nextInt();
                calculator.setArea2(measurement3, measurement4);
                isNumber2 = true;
            } else {
                System.out.println("I don't understand, please enter a number");
                isNumber2 = false;
                scan.next();
            }

        } while (!isNumber2);

//        calculator.setShape();

        System.out.println("The area of my rectangle is "+ calculator.getArea());
        System.out.println("The area of my triangle is " + calculator.getArea2());

    }
}
