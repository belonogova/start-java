public class Calculator {
    private int operand1;
    private int operand2;
    private String operator;

    public void setOperand1(int operand) {
        this.operand1 = operand;
    }

    public void setOperand2(int operand) {
        this.operand2 = operand;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public int calc(){
        int result = 0;
        switch (operator) {
            case "+" :
                result = operand1 + operand2;
                break;
            case "-" :
                result = operand1 - operand2;
                break;
            case "*" :
                result = operand1 * operand2;
                break;
            case "/" :
                result = operand1 / operand2;
                break;
            case "%" :
                result = operand1 % operand2;
                break;
            case "^" :
                result = 1;
                for (int i = operand2; i > 0; i--) {
                    result *= operand1;
                    break;
                }
            default :
                System.out. println("Такой операции не существует");
        } return result;
    }
}