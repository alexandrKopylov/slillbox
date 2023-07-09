import java.util.Random;
import java.util.Scanner;

public class T_3_9_4_PR {
    public static void main(String[] args) {
        int value = new Random().nextInt(100);
        while (true) {
            int attempt = new Scanner(System.in).nextInt();
            if (value == attempt) {
                System.out.println("Вы угадали!");
                break;
            }
            if (value > attempt) {
                System.out.println("Загаданое число больше");
            }
            if (value < attempt) {
                System.out.println("Загаданое число меньше");
            }
        }
    }
}
