package coderbytes.simpleadding;

public class SimpleAdding {

    private static final String THE_LONGEST_WORD_IN_INPUT_VALUE_IS = "The longest word in input value is: '%s'";

    public static void main (String[] args) {

        int input;

        input = 10;
        System.out.println(String.format(THE_LONGEST_WORD_IN_INPUT_VALUE_IS,
                                         simpleAdding(input)
        ));

    }

    private static int simpleAdding (int input) {

        if (input > 1000 || input < 1) {
            throw new IllegalArgumentException("Invalid argument!");
        }

        int result = 0;

        for (int i = 0; i <= input; i++) {
            result += i;
        }

        return result;
    }

}
