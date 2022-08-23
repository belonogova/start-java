public class CuessNumber {
	public static void main(String[] args){
        int num = 40;
        int number = 65;

        do {
            if (number > 0 && number <= 100) {
                if (number < num) {
                    System.out.println("Число меньше загаданного");
                    number += 5;
                } else {
                    System.out.println("Число больше загаданного");
                    number -= 5;
                }
            } else {
                System.out.println("Число не в диапазоне");
            }
        } while (num != number);
        System.out.println("Вы победили!");
    }
}
