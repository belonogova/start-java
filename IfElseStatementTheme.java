 public class IfElseStatementTheme {
     public static void main(String[] args) {
        System.out.println("\n 1. Перевод псевдокода на язык Java \n");

        int age = 33;
        double  height = 1.60;
        boolean sex = false; 
        String name = "Alena";

        if (age > 20) {
            System.out.println("Я уже взрослая!");
        } else {
            System.out.println("Я еще малеькая!");
        }

        if (sex != true) {
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
            System.out.println("max - " + num2 +
                "\nmin - " + num1);
        } else {
            System.out.println("max - " + num1 +
                "\nmin - " + num2);
        }

        System.out.println("\n\n 3. Работа с числом \n");

        int num = 9;

        if (num == 0) {

        } 

        if (num % 2 == 0) {
            System.out.println("Число " + num + " четное");
        } else {
            System.out.println("Число " + num + " нечетное");
        }

        if (num > 0) {
            System.out.println("Число " + num + " положительное");
        } else {
            System.out.println("Число " + num + " отрицательное");
        }

        System.out.println("\n\n 4. Поиск одинаковых цифр в числах \n");

        int numb1 = 235;
        int numb2 = 735;

        String numb1String = numb1 + "";
        String numb2String = numb2 + "";

        System.out.println("Число первое - " + numb1 +
            "\nЧисло второе - " + numb2);

        System.out.println("Одинаковые цифры -");

        if (numb1String.charAt(0) == numb2String.charAt(0)) {
            System.out.println(numb1String.charAt(0) + "");
        }

        if (numb1String.charAt(1) == numb2String.charAt(1)) {
            System.out.println(numb1String.charAt(1) + "");
        }

        if (numb1String.charAt(2) == numb2String.charAt(2)) {
            System.out.println(numb1String.charAt(2));
        }

        System.out.println("Номера разрядов -");

        if (numb1String.charAt(0) == numb2String.charAt(0)) {
            System.out.println(3);
        }

        if (numb1String.charAt(1) == numb2String.charAt(1)) {
            System.out.println(2);
        }

        if (numb1String.charAt(2) == numb2String.charAt(2)) {
            System.out.println(1);
        }

        System.out.println("\n\n 5. Определение буквы, числа или символа по их коду \n");

        char  who = '\u0057';

        System.out.println(who + " -это большая буква");

        System.out.println("\n\n 6. Определение суммы вклада и начисленных банком % \n");

        int deposit = 300000;

        if (deposit <= 100000) {

            int percent = deposit / 100 * 5;

            System.out.println("Сумма вклада - " + deposit +
                "\nНачисленный % - " + percent +
                "\nИтоговая сумма с % - " + (deposit + percent));

        } else if (deposit > 100000 && deposit <= 300000) {

            int percent = deposit / 100 * 7;

            System.out.println("Сумма вклада - " + deposit +
                "\nНачисленный % - " + percent +
                "\nИтоговая сумма с % - " + (deposit + percent));
        } else if (deposit > 300000) {

            int percent = deposit / 100 * 10;

            System.out.println("Сумма вклада - " + deposit +
                "\nНачисленный % - " + percent +
                "\nИтоговая сумма с % - " + (deposit + percent));
        }

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

         System.out.println(gradeHistory + " - History\n");
         System.out.println(gradeProgramming + " - Programming\n");

         System.out.println((gradeProgramming + gradeHistory) / 2 + " - average rating\n");

         System.out.println((percentHistory + percentProgramming) / 2 + " - average percent");

         System.out.println("\n\n 8. Расчет прибыли\n");

         int rent = 5000;
         int costPrice = 9000;
         int profit = 13000;
         int netProfit = (profit - costPrice) - rent;

         System.out.println("Прибыль в год: " + netProfit * 12);

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