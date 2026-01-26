package org.maths;

import java.util.Scanner;

public class PermutationsAndCombinations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, r;

        System.out.print("Enter n: ");
        n = in.nextInt();

        System.out.print("Enter r: ");
        r = in.nextInt();

        int permutation = factorial(n) / factorial(n - r);
        int combination = factorial(n) / (factorial(r) * factorial(n - r));

        System.out.println();
        System.out.println("The permutations are: " + permutation);
        System.out.println("The combinations are: " + combination);
        in.close();
    }

    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
