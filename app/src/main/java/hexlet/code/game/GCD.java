package hexlet.code.game;

import hexlet.code.Tools;
import hexlet.code.Engine;

public class GCD {
    static final String Description = "Find the greatest common divisor of given numbers.";
    static final int MAX_RANDOM = 100;

    public static void start() {
        Engine.run(Description, gcdDataGenerate());
    }

    static String[][] gcdDataGenerate() {
        String[][] data = new String[Engine.REPEAT][2];
        for (var i = 0; i < Engine.REPEAT; i++) {
            int first = Tools.random(1, MAX_RANDOM);
            int second = Tools.random(1, MAX_RANDOM);

            String result = String.valueOf(gcd(first, second));
            String question = first + " " + second;

            data[i][0] = question;
            data[i][1] = result;
        }
        return data;
    }

    static int gcd(int a, int b) {
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
}
}
