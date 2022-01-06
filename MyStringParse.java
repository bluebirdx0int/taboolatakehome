/**
 * stringparse
 */
public class MyStringParse {


    public static Integer convertStringToInt(String s) {
        int result = 0;
        int factor = 1;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '-') {
                result = -result;
                break;
            }
            result += (int) s.charAt(i) * factor;
            factor *= 10;
        }
        return result;
    }

    public static boolean detectInt(String s) {
        for (int i = 0; i <= s.length() - 1; i++) {
            if (Character.isDigit(s.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String test = "123";
        String noint = "hello";
        System.out.println(convertStringToInt(test).getClass());
        if (!detectInt(noint)) {
            System.out.println("pass");
        }
        if (detectInt(test)) {
            System.out.println("pass");
        }
    }
}