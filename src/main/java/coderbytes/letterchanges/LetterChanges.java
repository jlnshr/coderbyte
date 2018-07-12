package coderbytes.letterchanges;

import java.util.Collections;

public class LetterChanges {

    private static final String THE_REVERSED_STRING_IS = "The reversed String is: '%s'";
    private static final int UPPERCASE_A_IN_ASCII_TABLE = 65;
    private static final int LOWERCASE_A_IN_ASCII_TABLE = 97;
    private static final int LOWERCASE_Z_IN_ASCII_TABLE = 122;
    private static final char CHAR_LOWERCASE_A = 'a';
    private static final char CHAR_LOWERCASE_E = 'e';
    private static final char CHAR_LOWERCASE_I = 'i';
    private static final char CHAR_LOWERCASE_O = 'o';
    private static final char CHAR_LOWERCASE_U = 'u';

    public static void main (String[] args) {

        String input;

        input = "hello world";

        System.out.println(String.format(THE_REVERSED_STRING_IS,
                                         Collections.singletonList(letterChanges(input))
        ));

        input = "fun times!";

        System.out.println(String.format(THE_REVERSED_STRING_IS,
                                         Collections.singletonList(letterChanges(input))
        ));

        input = "beautiful^";

        System.out.println(String.format(THE_REVERSED_STRING_IS,
                                         Collections.singletonList(letterChanges(input))
        ));

        input = "this long cake@&";

        System.out.println(String.format(THE_REVERSED_STRING_IS,
                                         Collections.singletonList(letterChanges(input))
        ));

        input = "a confusing /:sentence:/[ this is not!!!!!!!~";


        System.out.println(String.format(THE_REVERSED_STRING_IS,
                                         Collections.singletonList(letterChanges(input))
        ));
    }

    private static String letterChanges (String str) {

        StringBuilder result = new StringBuilder();
        char[] array = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {
            int ascichar = (int) array[i];
            if (ascichar < UPPERCASE_A_IN_ASCII_TABLE || UPPERCASE_A_IN_ASCII_TABLE < ascichar && ascichar < LOWERCASE_A_IN_ASCII_TABLE || ascichar > LOWERCASE_Z_IN_ASCII_TABLE) {
                result.append(array[i]);
                continue;
            }
            if (ascichar + 1 > LOWERCASE_Z_IN_ASCII_TABLE) {
                ascichar = UPPERCASE_A_IN_ASCII_TABLE;
            } else {
                ascichar++;
            }
            if ((char) ascichar == CHAR_LOWERCASE_A || (char) ascichar == CHAR_LOWERCASE_E || (char) ascichar == CHAR_LOWERCASE_I || (char) ascichar == CHAR_LOWERCASE_O || (char) ascichar == CHAR_LOWERCASE_U) {
                ascichar -= 32;
            }
            result.append(Character.toString((char) ascichar));
        }

        return result.toString();
    }

}
