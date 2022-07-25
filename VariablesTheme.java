public class VariablesTheme {
	public static void main(String[] args) {
	System.out.println("1. Создание переменных и вывод их значений на консоль\n");

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

	System.out.println("\n\n2. Расчет стоимости товара со скидкой\n");

	int banana = 100;
	int tomato = 200;
	int discount = (banana + tomato) / 100 * 11;
	int sum = (banana + tomato) - discount;

	System.out.println(discount);
	System.out.println(sum);

	System.out.println("\n\n3. Вывод на консоль слова JAVA\n");

	System.out.println("   J    a  v     v  a");
	System.out.println("   J   a a  v   v  a a");
	System.out.println("J  J  aaaaa  V V  aaaaa");
	System.out.println(" JJ  a     a  V  a     a");

	System.out.println("\n\n4. Отображение min и max значений числовых типов данных\n");

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

	System.out.println("\n\n5. Перестановка значений переменных\n");

	int one = 1;
	int two = 2;

	int three = one;
	one = two;
	two =three;

	System.out.println("Перестановка с помощью третьей переменной\n");
	System.out.println("Исходные значения переменных " + two + " " + one);
	System.out.println("Новые значения переменных " + one + " " + two);

	one = one + two;
	two = one - two;
	one = one -two;

	System.out.println("\nПерестановка с помощью арифметических операций\n");
	System.out.println("Исходные значения переменных " + two + " " + one);
	System.out.println("Новые значения переменных " + one + " " + two);

	one = one ^ two;
	two = two ^ one;
	one = one ^ two;

	System.out.println("\nПерестановка с помощью побитовой операции\n");
	System.out.println("Исходные значения переменных " + two + " " + one);
	System.out.println("Новые значения переменных " + one + " " + two);

	System.out.println("\n\n6. Вывод символов и их кодов\n");

	

    }
}