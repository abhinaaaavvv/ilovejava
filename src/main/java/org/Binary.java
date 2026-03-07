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

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number in decimal");
        int n = in.nextInt();

        int binary = toBinary(n);
        System.out.println(binary);

        in.close();
    }
}
