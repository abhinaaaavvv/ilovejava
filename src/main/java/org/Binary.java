package org;

import java.util.Scanner;

public class Binary {

    public static void main(final String[] args) {
        // take input as n
        final Scanner in = new Scanner(System.in);
        System.out.print("Enter a number in decimal: ");
        final long n = in.nextLong();

        final String m = convert(n);
        final String bi = rev(m);
        final long binary = Integer.parseInt(bi);
        System.out.println(binary);

        in.close();

    }

    static String rev(final String str) {

        if (str == null || str.isEmpty() || str.length() == 1) {
            return str;
        }
        return rev(str.substring(1)) + str.charAt(0);
    }

    static String convert(long n) {
        String bi = "";

        while (n > 0) {
            bi += n % 2;
            n /= 2;
        }

        return bi;
    }
}
