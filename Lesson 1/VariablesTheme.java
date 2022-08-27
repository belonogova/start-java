public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println(" 1. Создание переменных и вывод их значений на консоль \n");

        byte core = 64;
        char release = 'W';
        int memory = 32;
        long codProduct = 330800000000L;
        short vertion = 21;
        float assemblyOC = 19044.1826f;
        double contact = 120.22124180d;
        boolean isTrue = true;

        System.out.println(release);
        System.out.println(core);
        System.out.println(memory);
        System.out.println(codProduct);
        System.out.println(vertion);
        System.out.println(assemblyOC);
        System.out.println(contact);
        System.out.println(isTrue);

        System.out.println("\n\n 2. Расчет стоимости товара со скидкой \n");

        int bananaPrice = 100;
        int tomatoPrice = 200;
        int discount = (bananaPrice + tomatoPrice) / 100 * 11;
        int discountPrice = (bananaPrice + tomatoPrice) - discount;

        System.out.println(discount);
        System.out.println(discountPrice);

        System.out.println("\n\n 3. Вывод на консоль слова JAVA \n");

        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");

        System.out.println("\n\n 4. Отображение min и max значений числовых типов данных \n");

        byte maxByte = 127;
        //byte maxByte = Byte.MAX_VALUE;
        short maxShort = 32767;
        //short maxShort = Short.MAX_VALUE;
        int maxInt = 2147483647;
        //int maxInt = Integer.MAX_VALUE;
        long maxLong = 9223372036854775807L;
        //long maxLong = Long.MAX_VALUE;

        System.out.println(maxByte + "\n" +
                ++maxByte + "\n" +
                --maxByte + "\n");

        System.out.println(maxShort + "\n" +
                ++maxShort + "\n" +
                --maxShort + "\n");

        System.out.println(maxInt + "\n" +
                ++maxInt + "\n" +
                --maxInt + "\n");

        System.out.println(maxLong + "\n" +
                ++maxLong + "\n" +
                --maxLong + "\n");

        System.out.println("\n\n 5. Перестановка значений переменных \n");

        int num1 = 1;
        int num2 = 2;

        System.out.println("Перестановка с помощью третьей переменной \n");

        int tmp = num1;
        num1 = num2;
        num2 = tmp;

        System.out.println("Исходные значения переменных " + num2 + " " + num1);
        System.out.println("Новые значения переменных " + num1 + " " + num2);

        System.out.println("\n Перестановка с помощью арифметических операций \n");

        num2 += num1;
        num1 = num2 - num1;
        num2 -= num1;

        System.out.println("Исходные значения переменных " + num2 + " " + num1);
        System.out.println("Новые значения переменных " + num1 + " " + num2);

        System.out.println("\n Перестановка с помощью побитовой операции \n");

        num2 ^= num1;
        num1 ^= num2;
        num2 ^= num1;

        System.out.println("Исходные значения переменных " + num2 + " " + num1);
        System.out.println("Новые значения переменных " + num1 + " " + num2);

        System.out.println("\n\n 6. Вывод символов и их кодов \n");

        char code1 = 35;
        char code2 = 38;
        char code3 = 64;
        char code4 = 94;
        char code5 = 95;

        System.out.println((int) code1 + " - " + code1);
        System.out.println((int) code2 + " - " + code2);
        System.out.println((int) code3 + " - " + code3);
        System.out.println((int) code4 + " - " + code4);
        System.out.println((int) code5 + " - " + code5);

        System.out.println("\n\n 7. Произведение и сумма цифр числа \n");

        int srcNumber = 345;
        int hundred = srcNumber / 100;
        int ten = srcNumber / 10 % 10;
        int ones = srcNumber % 10;

        int sumDigits = ones + ten + hundred;
        int productDigits = ones * ten * hundred;

        System.out.println("Сумма цифр числа " + srcNumber + " = " + sumDigits);
        System.out.println("Произведение цифр числа " + srcNumber + " = " + productDigits);

        System.out.println("\n\n 8. Вывод на консоль ASCII-арт Дюка \n");

        char slash = '/';
        char backslash = '\\';
        char space = ' ';
        char bktLeft = '(';
        char bktRight = ')';
        char underline = '_';

        System.out.println(" " + space + space + space + space + slash + backslash + space + space + space + space + space);
        System.out.println(" " + space + space + space + slash + space + space + backslash + space + space + space + space);
        System.out.println(" " + space + space + slash + underline + bktLeft + space + bktRight + backslash + space + space + space);
        System.out.println(" " + space + slash + space + space + space + space + space + space + backslash + space);
        System.out.println(" " + slash + underline + underline + underline + underline + underline + slash + backslash + underline + backslash);

        System.out.println("\n\n 9. Отображение количества сотен, десятков и единиц числа\n");

        System.out.println("Число " + srcNumber + " содержит: \n" + hundred + " сотен \n"
                + ten + " десятков \n"
                + ones + " единиц");

        System.out.println("\n\n 10. Преобразование секунд \n");

        int time = 86399;

        int hours = time / 3600;
        int secondsRemainder = time % 3600;
        int minutes = secondsRemainder / 60;
        int seconds = secondsRemainder % 60;

        System.out.println(hours + " : " + minutes + " : " + seconds);
    }
}
