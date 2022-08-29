package Lesson2;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String answer = "yes";
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while ("yes".equals(answer)) {
            System.out.print("Введите первое число: ");
            int num1 = scanner.nextInt();
            calculator.setOperand1(num1);
    
            System.out.print("Введите знак математической операции: ");
            scanner.nextLine();
            char sign = scanner.nextLine().charAt(0);
            calculator.setOperator(sign);
        
            System.out.print("Введите второе число: ");
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