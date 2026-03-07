package org;

import java.util.Scanner;

public class Binary {

    public static int toBinary(int n) {
        String binary = "";
        int temp;
        while (n != 0) {
            temp = n % 2;
            binary = temp + binary;
            n /= 2;
        }
        return Integer.parseInt(binary);
    }

    public static void main(final String[] args) {
        final Scanner in = new Scanner(System.in);
        System.out.println("Enter a number in decimal");
        final int n = in.nextInt();

        final int binary = toBinary(n);
        System.out.println(binary);

        in.close();
    }
}
