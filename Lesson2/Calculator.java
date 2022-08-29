package Lesson2;

public class Calculator {
    private int x;
    private int y;
    private char mathSign;

    public void setOperand1(int x) {
        this.x = x;
    }

    public void setOperand2(int y) {
        this.y = y;
    }

    public void setOperator(char mathSign) {
        this.mathSign = mathSign;
    }

    public int calc(){
        int result = 0;
        switch (mathSign) {
            case '+' :
                return x + y;
            case '-' :
                return x - y;
            case '*' :
                return x * y;
            case '/' :
                return x / y;
            case '%' :
                return x % y;
            case '^' :
                result = 1;
                for (int i = 1; i <= y; i++) {
                    result = result * x;
                }
                return result;
            default :
                System.out. println("Такой операции не существует");
        }
        return 0;
    }
}