package coderbytes.lettercapitalize;

public class LetterCapitalize {

    private static final String CAPITALIZED_STRING_IS = "Capitalized string is: '%s'";

    public static void main (String[] args) {

        String input;

        input = "Argument goes here";
        System.out.println(String.format(CAPITALIZED_STRING_IS,
                                         letterCapitzalize(input)
        ));

        input = "hello world";
        System.out.println(String.format(CAPITALIZED_STRING_IS,
                                         letterCapitzalize(input)
        ));

        input = "yooooooo hi";
        System.out.println(String.format(CAPITALIZED_STRING_IS,
                                         letter(input)
        ));

    }


    /***
     * Capitalizes the first latter of each word of a string. Words divided by a whitespace
     * @param input String to process
     * @return input String with first letter of each word capitalized
     */
    private static String letterCapitzalize (String input) {

        StringBuilder result = new StringBuilder();

        String[] splittedInput = input.split(" ");
        for (String s : splittedInput) {
            if (s.charAt(0) > 97 && s.charAt(0) < 122) {
                result.append(s.substring(0, 1).toUpperCase())
                      .append(s.substring(1))
                      .append(" ");
            } else {
                result.append(s).append(" ");
            }
        }
        return result.toString().substring(0, result.length() - 1);
    }

    /***
     * Does the same as the method above, just a little bit refactored
     * @param input String of which the first Letter of each word should be capitalized
     * @return String with first letter of each word capizalized
     */
    private static String letter (String input) {

        StringBuilder result = new StringBuilder();

        String[] splitted = input.split(" ");

        for (String s : splitted) {
            result.append(s.substring(0, 1).toUpperCase()).append(s.substring(1)).append(
                    " ");
        }

        return result.toString();

    }

}
