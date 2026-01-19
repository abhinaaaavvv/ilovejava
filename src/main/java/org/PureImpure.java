package org;

public class PureImpure {

  static int c = 0;

  public static void main(String[] args) {
    System.out.println(square(5));
    System.out.println(square(5));
    System.out.println(impure(6));
    System.out.println(impure(6));
    System.out.println(impure(6));
    System.out.println(impure(6));
    System.out.println(impure(6));
    System.out.println(impure(6));
  }

  static int square(int a) {
    return a * a;
  }

  static int impure(int a) {
    c = c + a;
    return c;
  }
}
