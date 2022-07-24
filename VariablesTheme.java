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
	int maxInt = 247483647;
	long maxLong = 9223372036854775807L;

	maxByte++;


    }
}