package com.startjava.Lesson1.base;

 public class IfElseStatementTheme {
     public static void main(String[] args) {
        System.out.println("\n 1. Перевод псевдокода на язык Java \n");

        int age = 33;
        double  height = 1.60;
        boolean male = false; 
        String name = "Alena";

        if (age > 20) {
            System.out.println("Я уже взрослая!");
        } else {
            System.out.println("Я еще маленькая!");
        }

        if (!male) {
            System.out.println("Я женщина!");
        }

        if (height < 1.80) {
            System.out.println("Нужно еще подрасти!");
        } else {
            System.out.println("Могу достать воробушка");
        }

        char firstLetter = name.charAt(0);

        if (firstLetter == 'L') {
            System.out.println("Тебя зовут Лена?");
        } else if (firstLetter == 'E') {
            System.out.println("Тебя зовут Елена?");
        } else {
            System.out.println("Значит тебя зовут Алена!");
        }

        System.out.println("\n\n 2. Поиск max и min числа \n");

        int num1 = 5;
        int num2 = 7;

        if (num1 < num2) {
            System.out.println("max - " + num2 + " min - " + num1);
        } else {
            System.out.println("max - " + num1 + " min - " + num2);
        }

        System.out.println("\n\n 3. Работа с числом \n");

        int num = 9;
        System.out.print("Число " + num);

        if (num != 0) {
            if (num % 2 == 0) {
                System.out.print(" четное, ");
            } else {
                System.out.print(" нечетное, ");
            }

            if (num > 0) {
                System.out.print(" положительное");
            } else {
                System.out.print(" отрицательное");
            }
        } else {
            System.out.print(" ноль");
        }

        System.out.println("\n\n 4. Поиск одинаковых цифр в числах \n");

        int numb1 = 235;
        int numb2 = 735;

        System.out.println("Число первое - " + numb1 +
            "\nЧисло второе - " + numb2);

        int numb1Hundrid = numb1 / 100;
        int numb1Ten = numb1 / 10 % 10;
        int numb1One = numb1 % 10;

        int numb2Hundrid = numb2 / 100;
        int numb2Ten = numb2 / 10 % 10;
        int numb2One = numb2 % 10;

        System.out.println("Одинаковые цифры -");

        if (numb1Hundrid == numb2Hundrid) {
            System.out.println(numb1Hundrid + " разряд 3");
        }

        if (numb1Ten == numb2Ten) {
            System.out.println(numb1Ten + " разряд 2");
        }

        if (numb1One == numb2One) {
            System.out.println(numb1One + " разряд 1");
        }

        System.out.println("\n\n 5. Определение буквы, числа или символа по их коду \n");

        char unknownChar = '\u0057';
        System.out.println(unknownChar + " это ");

        if (unknownChar >= 65 && unknownChar <= 90) {
            System.out.println("- Большая буква");
        } else if ( unknownChar >= 97 && unknownChar <= 122) {
            System.out.println("- Маленькая буква");
        } else if (unknownChar >= 48 && unknownChar <= 57) {
            System.out.println("- цифра");
        } else {
            System.out.println("- символ");
        }

        System.out.println("\n\n 6. Определение суммы вклада и начисленных банком % \n");

        int deposit = 300000;
        int percent = 0;
        int sum = 0;

        if (deposit <= 100000) {
            percent = deposit / 100 * 5;
        } else if (deposit > 100000 && deposit <= 300000) {
            percent = deposit / 100 * 7;
        } else if (deposit > 300000) {
            percent = deposit / 100 * 10;
        }

        sum = deposit + percent;

        System.out.println("Сумма вклада - " + deposit +
                "\nНачисленный % - " + percent +
                "\nИтоговая сумма с % - " + sum);

         System.out.println("\n\n 7. Определение оценки по предметам\n");

         int percentHistory = 59;
         int percentProgramming = 91;
         int gradeHistory = 0;
         int gradeProgramming = 0;

         if (percentHistory > 91) {
             gradeHistory = 5;
         } else if (percentHistory > 73) {
             gradeHistory = 4;
         } else if (percentHistory > 60) {
             gradeHistory = 3;
         } else if (percentHistory <= 60) {
             gradeHistory = 2;
         }

         if (percentProgramming > 91) {
             gradeProgramming = 5;
         } else if (percentProgramming > 73) {
             gradeProgramming = 4;
         } else if (percentProgramming > 60) {
             gradeProgramming = 3;
         } else if (percentProgramming <= 60) {
             gradeProgramming = 2;
         }

         System.out.println(gradeHistory + " - History \n");
         System.out.println(gradeProgramming + " - Programming \n");

         System.out.println((gradeProgramming + gradeHistory) / 2 + " - average rating\n");

         System.out.println((percentHistory + percentProgramming) / 2 + " - average percent");

         System.out.print("\n\n 8. Расчет прибыли \n");

         int rent = 5000;
         int costPrice = 9000;
         int profit = 13000;
         int profitInYea = (profit - costPrice - rent) * 12;

         System.out.print("Прибыль за год: ");

         if (profitInYea > 0) {
             System.out.println("+" + profitInYea);
         } else {
            System.out.println(profitInYea);
         }

         System.out.println("\n\n 9. Подсчет количества банкнот \n");

         int number = 567;
         int hundred = number / 100;
         int remainderTen = number % 100;
         int remainderOne = remainderTen % 10;
         int ten = 0;
         int one = 0; 

         if (remainderTen <  50) {
             ten = remainderTen / 10;
             one = remainderTen % 10;
         } else if (remainderTen >=50) {
             ten = 5;
             one = remainderTen - 50;
         }

         System.out.println(hundred + " шт - 100$ \n" +
            ten + " шт - 10$ \n" +
            one + " шт - 1$");

         System.out.println("Сумма - " + (hundred * 100 + ten * 10 + one));
    }
}