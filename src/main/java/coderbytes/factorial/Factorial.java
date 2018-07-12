package coderbytes.factorial;

public class Factorial {

    public static void main (String... args) {

        int input;
        input = 10;
        System.out.println("The first factorial of input value is: '" + factorial(input) + "'");
    }

    private static int factorial (int input) {

        int result = 1;
        for (int i = input; i > 0; i--) {
            result *= i;
        }

        return result;
    }
}
