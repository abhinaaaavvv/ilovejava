package org.maths;

import java.util.Scanner;

public class MatrixAddition {

    public static void main(final String[] args) {
        final Scanner in = new Scanner(System.in);

        final int[][] arr1 = new int[2][2];
        final int[][] arr2 = new int[2][2];
        final int[][] sum = new int[2][2];

        System.out.println("enter the ele of first matrix");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                arr1[i][j] = in.nextInt();
            }
        }

        System.out.println("enter the ele of 2nd matrix");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                arr2[i][j] = in.nextInt();
            }
        }

        System.out.println("sum of 2 matrices");
        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum[i].length; j++) {
                sum[i][j] = arr1[i][j] + arr2[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
