package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.Tools;

public class Prime {
    static final String QUESTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    static final int MAX_RANDOM_NUMBER = 100;

    public static void start() {
        Engine.run(QUESTION, primeGenerate());
    }

    static String[][] primeGenerate() {
        String[][] data = new String[Engine.REPEAT][2];
        for (var i = 0; i < Engine.REPEAT; i++) {
            int generatedNumber = Tools.random(1, MAX_RANDOM_NUMBER);

            String result = isPrime(generatedNumber) ? "yes" : "no";
            String question1 = Integer.toString(generatedNumber);

            data[i][0] = question1;
            data[i][1] = result;
        }
        return data;
    }

    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
}
