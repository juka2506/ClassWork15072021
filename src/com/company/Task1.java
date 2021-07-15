package com.company;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the the value of n: ");
        float n = scanner.nextFloat();
        System.out.print("Enter the value of r: ");
        float r = scanner.nextFloat();
        float nCr = factorial(n) / (factorial(n-r) * factorial(r));
        System.out.println("The results is " + nCr);
    }

    public static float factorial(float number) {
        if (number <= 1) {
            return 1;
        } else {
            return number * factorial(number - 1);
        }
    }

}
