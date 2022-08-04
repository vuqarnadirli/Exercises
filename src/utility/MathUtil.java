package utility;

public class MathUtil {
    public static void find(int value, int divide) {
        for (int i = 0; i <= value; i++) {
            if (i % divide == 0) {
                System.out.println(i);
            }
        }
    }


    public static void findBy2(int value) {
        find(value, 2);
    }

    public static int total(int value) {
        int temp;
        int total = 0;
        while (value > 0) {
            temp = value % 10;
            total += temp;
            value = value / 10;
        }
        return total;
    }

    public static int countDigit(int a) {
        int count = 0;
        while (a > 0) {
            count++;
            a = a / 10;
        }
        return count;
    }

    public static int factorial(int value) {
        if (value == 0) {
            return 1;
        } else {
            return value * factorial(value - 1);
        }
    }


    public static void simpleNumbers(int value) {
        boolean control = false;
        for (int i = 2; i < value; i++) {
            control = false;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    control = true;
                    break;
                }
            }
            if (!control) {
                System.out.println(i);
            }
        }
    }

    public static boolean strControl(String s) {
        boolean control = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(s.length() - 1 - i)) {
                control = true;
            } else {
                return false;
            }
        }
        return control;
    }

    public static void pow(int a, int b, int c){
        for (int i = a; i <=b ; i++) {
            System.out.println(Math.pow(i,c));
        }
    }
}
