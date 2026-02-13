package org;

public class PureImpure {

    static int c = 0;

    public static void main(final String[] args) {
        System.out.println(square(5));
        System.out.println(square(5));
        System.out.println(impure(6));
        System.out.println(impure(6));
        System.out.println(impure(6));
        System.out.println(impure(6));
        System.out.println(impure(6));
        System.out.println(impure(6));
    }

    static int square(final int a) {
        return a * a;
    }

    static int impure(final int a) {
        c = c + a;
        return c;
    }
}
