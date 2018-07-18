package coderbytes.checknums;

public class CheckNums {

    private static final String IS_S_GREATER_THAN_S_S = "Is '%s' greater than '%s'? '%s'";

    public static void main (String[] args) {

        int num1 = 1;
        int num2 = 11;

        System.out.println(String.format(IS_S_GREATER_THAN_S_S,
                                         num2,
                                         num1,
                                         checkNums(num1, num2)
        ));

    }

    private static String checkNums (int num1, int num2) {

        if (num1 == num2) {
            return "-1";
        }

        return num2 > num1 ? String.valueOf(true) : String.valueOf(false);

    }


}
