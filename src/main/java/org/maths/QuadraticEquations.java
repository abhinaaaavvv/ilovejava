package org.maths;

import java.util.Scanner;

public class QuadraticEquations {

    public static void main(final String[] args) {
        final Scanner in = new Scanner(System.in);
        double d, a, b, c, x1, x2;

        System.out.println("Enter the value of a: ");
        a = in.nextInt();
        System.out.println("Enter the value of b: ");
        b = in.nextInt();
        System.out.println("Enter the value of c: ");
        c = in.nextInt();

        d = Math.sqrt((b * b) - 4 * a * c);
        x1 = (-b + d) / (2 * a);
        x2 = (-b - d) / (2 * a);

        System.out.println("The roots of the equation are: " + x1 + " and " + x2);

        in.close();
    }
}
