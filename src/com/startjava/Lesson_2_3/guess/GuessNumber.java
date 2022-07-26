package com.startjava.Lesson_2_3.guess;

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
        Random random = new Random();
        secretNumber = random.nextInt(100) + 1;
    }

    private boolean guess(Player player) {
        int num = player.getNumber();
        if (num > secretNumber) {
            System.out.println("Число " + num + " больше того, что загадал компьютер");
        } else if (num < secretNumber) {
            System.out.println("Число " + num + " меньше того, что загадал компьютер");
        }
        return num == secretNumber;
    }
}