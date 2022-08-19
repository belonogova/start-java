public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("\n 1. Подсчет суммы четных и нечетных чисел \n");

        int startNumber = -10;
        int evenNumbers = 0;
        int oddNumbers = 0;
        do {
            if (startNumber % 2 == 0) {
                evenNumbers += startNumber;
            } else {
                oddNumbers += startNumber;
            }
            startNumber++;
        } while (startNumber <= 21);
        System.out.println("в промежутке [-10, 21] сумма четных чисел = " +  evenNumbers + " а нечетных = " + oddNumbers);

        System.out.println("\n 2. Вывод чисел в интервале (min и max) в порядке убывания \n");

        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int max = 0;
        int min = 0;

        if (num1 > num2) {
            max = num1;
        }
        if (num3 > max) {
            max = num3;
        }
        if (num1 < num2) {
            min = num1;
        }
        if (num3 < min) {
            min =num3;
        }

        for (int i = max; i >= min; i-- ) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n 3. Вывод реверсивного числа и суммы его цифр \n");

        int number = 1234;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += number % 10;
            number = number / 10;
            System.out.print(digit);
            }
        System.out.println(" Сумма цифр: " + sum);

        System.out.println("\n\n 4. Вывод чисел на консоль в несколько строк \n");

        int countNumb = 0;

        for (int i = 1; i < 24 ; i += 2) {
            System.out.printf("%4d",i);

            if (++countNumb % 5 == 0) {
                System.out.println();
            }
        }

        int a = 5 - countNumb % 5;
        for (int m = 0; m < a; m++) {
            System.out.printf("%4d", 0);
        }

        System.out.println("\n\n 5. Проверка количества единиц на четность \n");

        int numbers = 3141591;
        int count = 0;
        int copySrcNum = numbers;

        while (numbers > 0) {
            int digit = numbers % 10;
            if (digit == 1) {
                count++;
            }
            numbers /= 10;
        }
            
        if (count % 2 == 0) {
            System.out.println("Число " + copySrcNum + " содержит четное количество единиц - " + count);
        }else {
             System.out.println("Число " + copySrcNum + " содержит нечетное количество единиц - " + count);
        }

        System.out.println("\n\n 6. Отображение фигур в консоли \n");

        for (int i = 0; i < 5 ; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        int i = 5;
        while (i > 0) {
            int j = i;
            while (j > 0) {
                System.out.print("#");
                j--;
            }
            System.out.println();
            i--;
        }
        i = 2;
        do {
            int j = i;
            while (j < 3 ) {
                System.out.print("$");
                j++;
            }
            System.out.println();
            i--;
        } while (i > -1);
        i = 0;
        do {
            int j = i;
            while (j < 2 ) {
                System.out.print("$");
                j++;
            }
            System.out.println();
            i++;
        } while (i < 3);

        System.out.println("\n\n 7. Отображение ASCII-символов \n");

        for (int j = 0; j < 48; j++) {
            if (j % 2 != 0) {
                System.out.printf("%4d%4c%n", j, (char)j);
            }
        }

        for (int k = 97; k < 123; k++) {
            if (k % 2 ==0) {
                System.out.printf("%4d%4c%n", k, (char)k);
            }
        }

        System.out.println("\n\n 8. Проверка, является ли число палиндромом \n");

        int numbPalindrom = 1234321;
        int palindrom = numbPalindrom;
        int revers = 0;

        while (numbPalindrom != 0) {
            int rev = numbPalindrom % 10;
            revers = revers * 10 + rev;
            numbPalindrom = numbPalindrom / 10;
        }
        if (revers == palindrom) {
             System.out.println("Число " + palindrom + " являться палиндромом");
        }

        System.out.println("\n\n 9. Определение, является ли число счастливым \n");

        int numberLiky = 147273;
        int numberLiky1 = numberLiky;
        int sumLeft = 0;
        int sumRight = 0;
        int numberLeft = numberLiky / 1000;
        int numberRight = numberLiky1 % 1000;
        numberLiky = numberLiky * 1000;

        while (numberLiky > 1000) {
            int num = numberLiky % 10;
            sumRight += num;
            numberLiky = numberLiky / 10;
        }

        System.out.println("Сумма цифр " + numberRight + " = " + sumRight);

        while (numberLiky != 0) {
            int num = numberLiky % 10;
            sumLeft += num;
            numberLiky = numberLiky / 10;
        }
        System.out.println("Сумма цифр " + numberLeft + " = " + sumLeft);
        if (sumLeft == sumRight) {
            System.out.println("Число счастливое");
        } else {
            System.out.println("Число  не счастливое");
        }

        System.out.println("\n\n 10. Вывод таблицы умножения Пифагора \n");

        for (int n = 1; n < 10; n++) {
            for (int p = 1; p < 10 ; p++) {
                System.out.printf("%4d", (n*p));
            }
            System.out.println();
        }
    }
}