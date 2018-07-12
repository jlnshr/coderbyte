package coderbytes.firstreverse;

public class FirstReverse {

    public static void main (String[] args) {

        String input;

        input = "coderbyte";

        System.out.println("The reversed String is: '" + firstReverse(input) + "'");
    }

    private static String firstReverse (String str) {

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            result.append(str.charAt(str.length() - 1 - i));
        }

        return result.toString();
    }
}
