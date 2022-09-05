import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    private Player player1;
    private Player player2;
    private int secretNumber;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        generateNumber();
        do {
            System.out.printf("%s, введите число: ", player1.getName());
            Scanner scanner = new Scanner(System.in);
            player1.setNumber(scanner.nextInt());
            if (guess(player1)) {
                System.out.println("Вы выиграли!");
                break;
            }

            System.out.printf("%s, введите число: ", player2.getName());
            scanner = new Scanner(System.in);
            player2.setNumber(scanner.nextInt());
            if (guess(player2)) {
                System.out.println("Вы выиграли!");
                break;
            }
        } while (true);
    }

    private void generateNumber() {
        int min = 1;
        int max = 100;
        int diff = max - min;
        Random random = new Random();
        secretNumber = random.nextInt(diff + 1) + min;
    }

    private boolean guess(Player player) {
        int name =player.getNumber();
        if (name > secretNumber) {
            System.out.println("Число " + name + " больше того, что загадал компьютер");
        } else if (name < secretNumber) {
            System.out.println("Число " + name + " меньше того, что загадал компьютер");
        }
        return name == secretNumber;
    }
}