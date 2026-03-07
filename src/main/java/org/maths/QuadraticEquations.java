package org.maths;

import java.util.Scanner;

public class QuadraticEquations {

    public static void main(final String[] args) {
        final Scanner in = new Scanner(System.in);
        double d, a, b, c, x1, x2;

        System.out.print("Enter the value of a: ");
        a = in.nextInt();
        System.out.print("Enter the value of b: ");
        b = in.nextInt();
        System.out.print("Enter the value of c: ");
        c = in.nextInt();

        d = Math.sqrt((b * b) - 4 * a * c);
        x1 = (-b + d) / (2 * a);
        x2 = (-b - d) / (2 * a);

        if (d > 0) {
            System.out.println("The roots of the equation are " + x1 + " and " + x2);
        } else if (d == 0) {
            System.out.println("The root of the equation is " + x1);
        } else {
            System.out.println("The equation has no real roots.");
        }

        in.close();
    }
}
