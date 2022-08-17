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
        int numb = 0;
        int sum = 0;

        while (number > 0) {
            sum = sum + number % 10;
            numb = number % 10;
            number = number / 10;
            System.out.print(numb);
            }
        System.out.println("Сумма цифр: " + sum);

        System.out.println("\n\n 4. Вывод чисел на консоль в несколько строк \n");

        for (int i = 1; i < 24 ; i += 2) {
            if (i % 5 == 0) {
                System.out.println();
            }
            System.out.printf(" %d", i);
        }

        System.out.println("\n\n 5. Проверка количества единиц на четность \n");


        int numbers = 3141591;
        int count = 0;
        int numbers3141591 = numbers;

        while (numbers > 0) {
            int number1 = numbers % 10;
            if (number1 == 1) {
                count++;
            }
            numbers = numbers / 10;
        }
            
        if (count % 2 == 0) {
            System.out.println("Число " + numbers3141591 + " содержит " + count + " четное количество единиц");
        }else {
             System.out.println("Число " + numbers3141591 + " содержит " + count + " нечетное количество единиц");
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
    }
}