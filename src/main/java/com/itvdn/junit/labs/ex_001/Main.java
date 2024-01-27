package com.itvdn.junit.labs.ex_001;

import java.util.Scanner;

/**
 * Come up with a program and test it.
 */
public class Main {
    public static void main(String[] args) {
        System.out.print("Enter integer: ");
        int n = new Scanner(System.in).nextInt();
        System.out.printf("%d! = %d", n, Factorial.getFactorial(n));
    }
}
