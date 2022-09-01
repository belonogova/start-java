import java.util.Scanner;

public class Player {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public int guess() {
        System.out.print("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        return num;
    }
}