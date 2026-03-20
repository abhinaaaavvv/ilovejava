package org.grade11;

import java.util.Scanner;

public class Q8_HCFAndLCM {

    static int hcf(int a, int b) {
        return (b == 0) ? a : hcf(b, a % b);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = in.nextInt();

        System.out.print("Enter second number: ");
        int b = in.nextInt();

        System.out.println("the hcf is = " + hcf(a, b));

        int lcm = (a * b) / hcf(a, b);
        System.out.println("the lcm is = " + lcm);

        in.close();
    }
}
