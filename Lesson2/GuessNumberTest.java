import java.util.Scanner;
import java.util.Random;

public class GuessNumberTest {
    public static void main(String[] args) {
        System.out.println("Введите имя первого игрока:");
        Scanner scanner = new Scanner(System.in);
        String name1 = scanner.nextLine();
        Player player1 = new Player(name1);

        System.out.println("Введите имя второго игрока:");
        String name2 = scanner.nextLine();
        Player player2 = new Player(name2);
        String answer = "yes";
        GuessNumber guessNumber = new GuessNumber();

        do {
            int numGenerate = GuessNumber.generateNumber();
            int numPlayer1 = 0;
            int numPlayer2 = 0;
            while (numGenerate != numPlayer1 || numGenerate != numPlayer2) {
                numPlayer1 = player1.guess();
                if (numPlayer1 > numGenerate) {
                    System.out.println("Число " + numPlayer1 + " больше того, что загадал компьютер");
                } else if (numPlayer1 < numGenerate) {
                    System.out.println("Число " + numPlayer1 + " меньше того, что загадал компьютер");
                } else {
                    System.out.println("Вы выиграли! Загаданное число: " + numGenerate);
                    break;
                }
                numPlayer2 = player2.guess();
                if (numPlayer2 > numGenerate) {
                    System.out.println("Число " + numPlayer2 + " больше того, что загадал компьютер");
                } else if (numPlayer2 < numGenerate) {
                    System.out.println("Число " + numPlayer2 + " меньше того, что загадал компьютер");
                } else {
                    System.out.println("Вы выиграли! Загаданное число: " + numGenerate);
                    break;
                }
            }
            do {
                System.out.println("Хотите продолжить игру? [yes/no]:");
                answer = scanner.nextLine();
            } while (!"yes".equals(answer) && !"no".equals(answer));
        } while ("yes".equals(answer));
    }
}