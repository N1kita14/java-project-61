package hexlet.code.game;

import hexlet.code.Tools;
import hexlet.code.Engine;

public class GCD {
    static final String Description = "Find the greatest common divisor of given numbers.";
    static final int Max_random = 100;

    public static void start() {
        Engine.run(Description, gcdDataGenerate());
    }

    static String[][] gcdDataGenerate() {
        String[][] data = new String[Engine.Repeat][2];
        for (var i = 0; i < Engine.Repeat; i++) {
            int first = Tools.random(1, Max_random);
            int second = Tools.random(1, Max_random);

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
