package application;

/**
 * Created by student03 on 15.12.15.
 */
public class StringOperator {

    public static String firstLetterToUpperCase(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1, str.length());
    }

    public static Boolean isAnyDigitCharacter(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i)))
                return true;
        }
        return false;
    }
}
