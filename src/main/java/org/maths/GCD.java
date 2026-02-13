package org.maths;

import java.util.Scanner;

public class GCD {

    static int gcd(final int a, final int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(final String[] args) {
        final Scanner in = new Scanner(System.in);

        System.out.println("enter the first value");
        final int a = in.nextInt();

        System.out.println("enter the second value");
        final int b = in.nextInt();

        System.out.println(
                "greatest common divisor of " + a + " and " + b + " is: " + gcd(a, b));

        in.close();
    }
}
