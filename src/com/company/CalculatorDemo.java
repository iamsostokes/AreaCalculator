package com.company;

import java.util.Scanner;

public class CalculatorDemo {

    public static void main(String[] args) {
	// write your code here
        Calculator calculator = new Calculator();
        Scanner scan = new Scanner(System.in);
        int measurement1 = scan.nextInt();
        int measurement2 = scan.nextInt();

        calculator.setArea(measurement1, measurement2);
//        calculator.setShape();

        System.out.println("The area of my rectangle is "+ calculator.getArea());


    }
}
