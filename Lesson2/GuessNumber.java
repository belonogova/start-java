import java.util.Random;

public class GuessNumber {
    public static int generateNumber() {
        Random random = new Random();
        int num = random.nextInt(101);
        return num;
    }
}