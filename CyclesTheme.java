public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("\n 1. Подсчет суммы четных и нечетных чисел \n");

        int counter = -10;
        int sumEven = 0;
        int sumOdd = 0;
        do {
            if (counter % 2 == 0) {
                sumEven += counter;
            } else {
                sumOdd += counter;
            }
            counter++;
        } while (counter <= 21);
        System.out.println("в промежутке [-10, 21] сумма четных чисел = " +  sumEven + " а нечетных = " + sumOdd);

        System.out.println("\n 2. Вывод чисел в интервале (min и max) в порядке убывания \n");

        int num1 = 10;
        int num2 = 10;
        int num3 = -1;
        int max = 0;
        int min = 0;

        if (num1 > num2) {
            max = num1;
            min = num2;
        } else {
            max = num2;
            min = num1;
        }
        if (num3 > max) {
            max = num3;
        }
        if (num3 < min) {
            min = num3;
        }

        for (int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n 3. Вывод реверсивного числа и суммы его цифр \n");

        int num = 1234;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
            System.out.print(digit);
        }
        System.out.println(" Сумма цифр: " + sum);

        System.out.println("\n\n 4. Вывод чисел на консоль в несколько строк \n");

        counter = 0;
        for (int i = 1; i < 24; i += 2) {
            System.out.printf("%4d", i);

            if (++counter % 5 == 0) {
                System.out.println();
            }
        }

        int count = 5 - counter % 5;
        for (int i = 0; i < count; i++) {
            System.out.printf("%4d", 0);
        }

        System.out.println("\n\n 5. Проверка количества единиц на четность \n");

        num = 3141591;
        int countOnes = 0;
        int copySrcNum = num;

        while (num > 0) {
            int digit = num % 10;
            if (digit == 1) {
                countOnes++;
            }
            num /= 10;
        }
            
        if (countOnes % 2 == 0) {
            System.out.println("Число " + copySrcNum + " содержит четное количество единиц - " + countOnes);
        } else {
             System.out.println("Число " + copySrcNum + " содержит нечетное количество единиц - " + countOnes);
        }

        System.out.println("\n\n 6. Отображение фигур в консоли \n");

        for (int i = 0; i < 5 ; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        int countLines = 5;
        while (countLines > 0) {
            int countRows = countLines;
            while (countRows > 0) {
                System.out.print("#");
                countRows--;
            }
            System.out.println();
            countLines--;
        }

        countLines = 2;
        do {
            int countRows = countLines;
            while (countRows < 3 ) {
                System.out.print("$");
                countRows++;
            }
            System.out.println();
            countLines--;
        } while (countLines > -1);

        countLines = 0;
        do {
            int countRows = countLines;
            while (countRows < 2 ) {
                System.out.print("$");
                countRows++;
            }
            System.out.println();
            countLines++;
        } while (countLines < 3);

        System.out.println("\n\n 7. Отображение ASCII-символов \n");

        for (int i = 0; i < 48; i++) {
            if (i % 2 != 0) {
                System.out.printf("%4d%4c%n", i, (char) i);
            }
        }

        for (int i = 97; i < 123; i++) {
            if (i % 2 == 0) {
                System.out.printf("%4d%4c%n", i, (char) i);
            }
        }

        System.out.println("\n\n 8. Проверка, является ли число палиндромом \n");

        int palindrom = 1234321;
        int copyPalindrom = palindrom;
        int revers = 0;

        while (palindrom != 0) {
            int digit = palindrom % 10;
            revers = revers * 10 + digit;
            palindrom /= 10;
        }
        if (revers == copyPalindrom) {
             System.out.println("Число " + copyPalindrom + " являться палиндромом");
        }

        System.out.println("\n\n 9. Определение, является ли число счастливым \n");

        int luckyNumber = 147273;
        int copyLuckyNumber = luckyNumber;
        int sumLeftDigit = 0;
        int sumRightDigit = 0;
        int numberLeft = luckyNumber / 1000;
        int numberRight = copyLuckyNumber % 1000;
        int copyNumberLeft = numberLeft;
        int copyNumberRight = numberRight;

        while (numberLeft != 0) {
            sumLeftDigit += numberLeft % 10;
            sumRightDigit += numberRight % 10;
            numberLeft /= 10;
            numberRight /= 10;
        }
        System.out.println("Сумма цифр " + copyNumberLeft + " = " + sumLeftDigit);
        System.out.println("Сумма цифр " + copyNumberRight + " = " + sumRightDigit);

        if (sumLeftDigit == sumRightDigit) {
            System.out.println("Число счастливое");
        } else {
            System.out.println("Число  не счастливое");
        }

        System.out.println("\n\n 10. Вывод таблицы умножения Пифагора \n");

        System.out.println("Вариант 1");

        System.out.printf("%3c%c", (char) 95, (char) 124);

        for (int i = 2; i < 10; i++) {
            if (i == 2) {
                System.out.println("__2__3__4__5__6__7__8__9");
            }
            for (int j = 1; j < 10 ; j++) {
                if (j == 1) {
                    System.out.printf("%3d%c", (i * j), (char) 124);
                } else {
                System.out.printf("%3d", (i * j));
                }
            }
            System.out.println();
        }
        System.out.println("Вариант 2");

        System.out.println("   |  2  3  4  5  6  7  8  9");
        System.out.println(" __|________________________");

        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10 ; j++) {
                if (j == 1) {
                    System.out.printf("%3d%c", (i * j), (char) 124);
                } else {
                System.out.printf("%3d", (i * j));
                }
            }
            System.out.println();
        }
    }
}