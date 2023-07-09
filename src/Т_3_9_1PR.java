import java.util.Scanner;

public class Т_3_9_1PR {
    public static void main(String[] args) {
        int value = new Scanner(System.in).nextInt();
        int product = 1;
        for (int i = 1; i <= value; i++) {
            product *= i;
        }
        System.out.println(product);
    }
}
