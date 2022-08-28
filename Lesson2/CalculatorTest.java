import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String answer = "yes";
        Calculator calculator = new Calculator();

        while ("yes".equals(answer)) {
            System.out.print("Введите первое число: ");
            Scanner scanner = new Scanner(System.in);
            int num1 = scanner.nextInt();
            calculator.setOperand1(num1);
    
            System.out.print("Введите знак математической операции: ");
            scanner = new Scanner(System.in);
            String sign = scanner.nextLine();
            calculator.setOperator(sign);
        
            System.out.print("Введите  второе число: ");
            scanner = new Scanner(System.in);
            int num2 = scanner.nextInt();
            calculator.setOperand2(num2);

            System.out.println(calculator.calc());

            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                scanner = new Scanner(System.in);
                answer = scanner.nextLine();
        
            } while (!("yes".equals(answer) || "no".equals(answer)));
        }
    } 
    
   
 }