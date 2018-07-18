package coderbytes.simplesymbols;

public class SimpleSymbols {

    public static void main (String[] args) {

        String input;

        input = "+d+=3=+s+";
        System.out.println(String.format("Is '%s' a valid input? '%s'",
                                         input,
                                         simpleSymbols(input)
        ));

        input = "f++d+";
        System.out.println(String.format("Is '%s' a valid input? '%s'",
                                         input,
                                         simpleSymbols(input)
        ));

    }

    private static String simpleSymbols (String input) {

        boolean valid = true;

        for (int i = 1; i < input.length() - 2; i += 3) {
            String sub = input.substring(i - 1, i + 2);
            if (!sub.matches("[=+][a-zA-Z0-9][=+]")) {
                valid = false;
            }
        }

        return String.valueOf(valid);
    }

}
