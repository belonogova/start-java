public class  CyclesTheme {
    public static void main(String[] args) {
        System.out.println("\n 1. Подсчет суммы четных и нечетных чисел \n");

        int m = -10;
        int even = 0;
        int odd = 0;
        do {
            if (m % 2 == 0) {
                even += m;
            } else {
                odd += m;
            }
            m++;
        } while (m <= 21);
        System.out.println("в промежутке [-10, 21] сумма четных чисел = " +  even + " а нечетных = " + odd);

        System.out.println("\n 2. Вывод чисел в интервале (min и max) в порядке убывания \n");

        int num1 = 10;
        int num2 = 5;
        int num3 = -1;

        int max = 0;
        int min = 0;

        if (num1 > num2 && num1 > num3) { 
            max = num1;
        } else if (num2 > num1 && num2> num3) {
            max =num2;
        } else if (num3 > num1 && num3 > num2) {
            max = num3;
        }

        if (num1 < num2 && num1 < num3) {
            max = num1;
        } else if (num2 < num1 && num2 < num3) {
            min = num2;
        } else if (num3 < num1 && num3 < num2) {
            min = num3;
        }
        for (int i = max; i >= min; i-- ) {
            System.out.print(i);
        }

        System.out.println("\n\n 3. Вывод реверсивного числа и суммы его цифр \n");

        int number = 1234;
        int i = 0;
        int sum = 0;

        while (number > 0) {
            sum = sum + number % 10;
            i = number % 10;
            number = number / 10;
            System.out.print(i);
            }
        System.out.println("\nСумма цифр: " + sum);
    }
}