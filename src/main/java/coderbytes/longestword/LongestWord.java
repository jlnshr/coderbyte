package coderbytes.longestword;

import java.util.ArrayList;
import java.util.Arrays;

public class LongestWord {


    public static void main (String... args) {

        String input = null;

//        input = "I love dogs";
//
//        System.out.println("The longest word in input value is: '"+ LongestWord(input) + "'");
//
//        input = "hello world";
//        System.out.println("The longest word in input value is: '"+ LongestWord(input) + "'");

        input = "a beautiful sentence^&!";
        System.out.println("The longest word in input value is: '" + LongestWord(input) + "'");

    }

    private static String LongestWord (String input) {

        if (input.isEmpty()) {
            throw new IllegalArgumentException("Invalid input value!");
        }
        input = input.replaceAll("[^A-Za-z ]", "");
        ArrayList<String> wordLengthMap = new ArrayList<>(Arrays.asList(input.split(" ")));

        String keyWithMaxLenght = null;
        int maxKeyLenght = 0;
        for (String s : wordLengthMap) {
            if (s.length() > maxKeyLenght) {
                keyWithMaxLenght = s;
                maxKeyLenght = s.length();
            }
        }

        return keyWithMaxLenght;
    }


}
