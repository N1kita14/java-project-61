package hexlet.code.game;
import java.util.Scanner;

public class Even {
    public static void playEven() {
        Scanner s = new Scanner(System.in);
        String number = s.nextLine();
        if (Integer.parseInt(number) % 2 == 0) {
            System.out.println("Число " + number + " четное");
        }
        else {
            System.out.println("Число " + number +" нечетное");
        }
    }
}
