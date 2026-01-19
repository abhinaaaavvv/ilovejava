package org.maths;

import java.util.Scanner;

public class GCD {

  static int gcd(int a, int b) {
    if (b == 0) {
      return a;
    }
    return gcd(b, a % b);
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("enter the first value");
    int a = in.nextInt();

    System.out.println("enter the second value");
    int b = in.nextInt();

    System.out.println(
      "greatest common divisor of " + a + " and " + b + " is: " + gcd(a, b)
    );

    in.close();
  }
}
