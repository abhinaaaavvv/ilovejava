package org.grade11;

import java.util.Scanner;

public class Q13_Capitalizing {

    static void firstLetter(String sentence) {
        String[] words = sentence.split(" ");
        for (String word : words) {
            char ch = word.charAt(0);
            if (Character.isLowerCase(ch)) {
                System.out.println(Character.toUpperCase(ch));
            }
            if (Character.isUpperCase(ch)) {
                System.out.println(Character.toLowerCase(ch));
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter a string: ");
        String words = in.nextLine();

        firstLetter(words);

        in.close();
    }
}
