package org;

public class valueandref {

    static int a = 10;
    static int b = 20;

    public static void main(final String[] args) {
        System.out.println("value before pass by value " + a + " " + b);
        byval(a, b);
        System.out.println("value after pass by value " + a + " " + b);

        System.out.println("value before pass by reference " + a + " " + b);
        final valueandref obj = new valueandref();
        byref(obj);
        System.out.println("value after pass by reference " + a + " " + b);
    }

    static void byval(int a, int b) {
        final int t = a;
        a = b;
        b = t;
        System.out.println("value in pass by value " + a + " " + b);
    }

    static void byref(final valueandref obj) {
        final int t = valueandref.a;
        valueandref.a = valueandref.b;
        valueandref.b = t;
        System.out.println(
                "value in pass by reference " + valueandref.a + " " + valueandref.b);
    }
}
