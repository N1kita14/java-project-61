package hexlet.code;

import java.util.Random;

public class Tools {

    public static int random(int min, int max) {
        Random random = new Random();
        int result = random.nextInt(max - min) + min;
        return result;
    }
}
