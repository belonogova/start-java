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
            System.out.println(" Число " + num + " нечетное");
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

        System.out.println("Одинаковые цифры - ");

        if (numb1String.charAt(0) == numb2String.charAt(0)) {
            System.out.println(numb1String.charAt(0) + "");
        }

        if (numb1String.charAt(1) == numb2String.charAt(1)) {
            System.out.println(numb1String.charAt(1) + "");
        }

        if (numb1String.charAt(2) == numb2String.charAt(2)) {
            System.out.println(numb1String.charAt(2));
        }

        System.out.println("Номера разрядов");

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

         
    }
}