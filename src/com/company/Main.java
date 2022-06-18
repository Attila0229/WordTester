package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem az első szót");
        String wordOne = scanner.next();
        System.out.println("Kérem a második szót");
        String wordTwo = scanner.next();
        if (Objects.equals(wordOne, wordTwo)) {
            System.out.println("A két szó megegyezik");
        } else {
            if (sameWords(wordOne, wordTwo)) {
                System.out.println("A két szó betűi megegyeznek");
            }
            if (!sameWords(wordOne, wordTwo)) {
                System.out.println("A két szó nem azonos betűkből áll");
            }
        }
    }

    public static boolean sameWords(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        } else {
            char[] arrayA = wordsToArray(a);
            char[] array = new char[a.length()];
            for (int i = 0; i < a.length(); i++) {
                for (int j = 0; j < a.length(); j++) {
                    if (a.charAt(i) == b.charAt(j)) {
                        array[i] += a.charAt(i);
                        break;
                    }
                }
            }
            if (Arrays.equals(array, arrayA))
                return true;
        }
        return false;
    }

    private static char[] wordsToArray(String a) {
        char[] wordOneCheck = new char[a.length()];
        for (int i = 0; i < a.length(); i++) {
            wordOneCheck[i] += a.charAt(i);
        }
        return wordOneCheck;
    }


}
