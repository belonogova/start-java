public class GuessNumber {
	public static void main(String[] args) {
        int hiddenNumber = 40;
        int inputNumber = 65;

        do {
            if (hiddenNumber > 0 && hiddenNumber <= 100) {
                if (hiddenNumber < inputNumber) {
                    System.out.println("Число меньше загаданного");
                    hiddenNumber += 5;
                } else {
                    System.out.println("Число больше загаданного");
                    hiddenNumber -= 5;
                }
            } else {
                System.out.println("Число не в диапазоне");
            }
        } while (inputNumber != hiddenNumber);
        System.out.println("Вы победили!");
    }
}