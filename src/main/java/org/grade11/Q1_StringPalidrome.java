package org.grade11;

import java.util.Scanner;

public class Q1_StringPalidrome {
    static boolean isPalindrome(String w) {
        String rev = "";
        for (int i = w.length() - 1; i >= 0; i--) {
            rev += w.charAt(i);
        }
        if (w.equals(rev)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = in.nextLine().trim().toLowerCase();
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }

        System.out.println(rev);

        String word = "";
        rev = rev + " ";

        for (int i = 0; i < rev.length(); i++) {
            if (rev.charAt(i) != ' ') {
                word += rev.charAt(i);
            } else {
                if (word.length() > 0 && isPalindrome(word)) {
                    System.out.println(word + " is a palindrome");
                }
                word = "";
            }
        }

        in.close();
    }
}
