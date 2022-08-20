public class Calculator {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 3;
        char sign = '^';
        if (sign == '+') {
            int result = num1 + num2;
            System.out.println(num1 + " " + sign + " " + num2 + " = " + result);
        } else if (sign == '-') {
            int result = num1 - num2;
            System.out.println(num1 + " " + sign + " " + num2 + " = " + result);
        } else if (sign == '*') {
            int result = num1 * num2;
            System.out.println(num1 + " " + sign + " " + num2 + " = " + result);
        } else if (sign == '/') {
            int result = num1 / num2;
            System.out.println(num1 + " " + sign + " " + num2 + " = " + result);
        } else if (sign == '%') {
            int result = num1 % num2;
            System.out.println(num1 + " " + sign + " " + num2 + " = " + result);
        } else if (sign == '^') { 
            int result = 1;
            for (int i = num2; i > 0; i--) {
                result *= num1;
            }
            System.out.println(num1 + " " + sign + " " + num2 + " = " + result);
        }

    }
}