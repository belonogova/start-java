import java.util.Scanner;
import java.util.Random;

public class GuessNumberTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Введите имя первого игрока:");
        String name1 = scanner.nextLine();
        Player player1 = new Player(name1);

        System.out.println("Введите имя второго игрока:");
        String name2 = scanner.nextLine();
        Player player2 = new Player(name2);

        GuessNumber guessNumber = new GuessNumber(player1, player2);

        String answer = null;
        do {
            guessNumber.playGame();
            do {
                System.out.print("Хотите продолжить игру? [yes/no]: ");
                answer = scanner.nextLine();
            } while (!"yes".equals(answer) && !"no".equals(answer));
        } while ("yes".equals(answer));
    }
}