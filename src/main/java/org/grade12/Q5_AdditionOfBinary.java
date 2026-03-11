package org.grade12;

import java.util.Scanner;

public class Q5_AdditionOfBinary {

    public static String addBinary(String a, String b) {
        String result = "";
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;
        while (i >= 0 || j >= 0 || carry == 1) {
            int sum = carry;
            if (i >= 0)
                sum += a.charAt(i--) - '0';
            if (j >= 0)
                sum += b.charAt(j--) - '0';
            result = (sum % 2) + result;
            carry = sum / 2;
        }
        return result;
    }

    public static String toBinary(int n) {
        String binary = "";
        int temp;
        while (n != 0) {
            temp = n % 2;
            binary = temp + binary;
            n /= 2;
        }
        return binary;
    }

    public static void main(final String[] args) {
        final Scanner in = new Scanner(System.in);

        System.out.print("Enter first number in decimal: ");
        final int n = in.nextInt();

        System.out.print("Enter first number in decimal: ");
        final int m = in.nextInt();

        final String binary_n = toBinary(n);
        final String binary_m = toBinary(m);

        System.out.println("Binary of " + n + ": " + binary_n);
        System.out.println("Binary of " + m + ": " + binary_m);
        System.out.println("Sum: " + addBinary(binary_n, binary_m));

        in.close();
    }
}
