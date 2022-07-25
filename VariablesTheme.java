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

	int banana = 100;
	int tomato = 200;
	int discount = (banana + tomato) / 100 * 11;
	int sum = (banana + tomato) - discount;

	System.out.println(discount);
	System.out.println(sum);

	System.out.println("\n\n 3. Вывод на консоль слова JAVA \n");

	System.out.println("   J    a  v     v  a");
	System.out.println("   J   a a  v   v  a a");
	System.out.println("J  J  aaaaa  V V  aaaaa");
	System.out.println(" JJ  a     a  V  a     a");

	System.out.println("\n\n 4. Отображение min и max значений числовых типов данных \n");

	byte maxByte = 127;
	short maxShort = 32767;
	int maxInt = 2147483647;
	long maxLong = 9223372036854775807L;

	byte maxByteInc = maxByte++;
	short maxShortInc = maxShort++;
	int maxIntInc = maxInt++;
	long maxLongInc = maxLong++;

	byte maxByteDec = maxByte--;
	short maxShortDec = maxShort--;
	int maxIntDec = maxInt--;
	long maxLongDec = maxLong--;

	System.out.println(maxByte + "\n" +
		maxByteInc + "\n" +
		maxByteDec + "\n");

	System.out.println(maxShort + "\n" +
		maxShortInc + "\n" +
		maxShortDec + "\n");

	System.out.println(maxInt + "\n" +
		maxIntInc + "\n" +
		maxIntDec + "\n");

	System.out.println(maxLong + "\n" +
		maxLongInc + "\n" +
		maxLongDec + "\n");

	System.out.println("\n\n 5. Перестановка значений переменных \n");

	int one = 1;
	int two = 2;

	int three = one;
	one = two;
	two =three;

	System.out.println("Перестановка с помощью третьей переменной \n");
	System.out.println("Исходные значения переменных " + two + " " + one);
	System.out.println("Новые значения переменных " + one + " " + two);

	one = one + two;
	two = one - two;
	one = one -two;

	System.out.println("\n Перестановка с помощью арифметических операций \n");
	System.out.println("Исходные значения переменных " + two + " " + one);
	System.out.println("Новые значения переменных " + one + " " + two);

	one = one ^ two;
	two = two ^ one;
	one = one ^ two;

	System.out.println("\n Перестановка с помощью побитовой операции \n");
	System.out.println("Исходные значения переменных " + two + " " + one);
	System.out.println("Новые значения переменных " + one + " " + two);

	System.out.println("\n\n 6. Вывод символов и их кодов \n");

	int number1 = 35;
	int number2 = 38;
	int number3 = 64;
	int number4 = 94;
	int number5 = 95;

	System.out.println(number1 + " - " + (char) number1);
	System.out.println(number2 + " - " + (char) number2);
	System.out.println(number3 + " - " + (char) number3);
	System.out.println(number4 + " - " + (char) number4);
	System.out.println(number5 + " - " + (char) number5);

	System.out.println("\n\n 7. Произведение и сумма цифр числа \n");

	int number = 345;
	int char1 = number / 100;
	int char2 = number /10 % 10;
	int char3 = number % 10;

	int summa = char1 + char2 + char3;
	int product =char1 * char2 * char3;

	System.out.println("Сумма цифр числа " + number + " = " + summa);
	System.out.println("Произведение цифр числа "+ number + " = " + product);

	System.out.println("\n\n 8. Вывод на консоль ASCII-арт Дюка \n");

	char left = 47;
	char right = 92;
	char space = 0;
	char bktLeft = 40;
	char bktRight = 41;
	char line = 95;

	System.out.println(" " + space + space + space + space + left + right + space + space + space + space + space);
	System.out.println(" " + space + space + space + left + space + space + right + space + space + space + space);
	System.out.println(" " + space + space + left + line + bktLeft + space + bktRight + right + space + space + space);
	System.out.println(" " + space + left + space + space + space + space + space + space + right + space);
	System.out.println(" " + left + line + line + line + line + line + left + right + line + right);

	System.out.println("\n\n 9. Отображение количества сотен, десятков и единиц числа\n");

	System.out.println("Число " + number + " содержит: \n" + char1 + " сотен \n"
		+ char2 + " десятков \n"
		+ char3 + " единиц ");

	System.out.println("\n\n 10. Преобразование секунд \n");

	int time = 86399;

	int hours = time / 3600;
	int secondsRemainder = time % 3600;
	int minutes = secondsRemainder / 60;
	int seconds = secondsRemainder % 60;


	System.out.println(hours + " : " + minutes + " : " + seconds);
    }
}