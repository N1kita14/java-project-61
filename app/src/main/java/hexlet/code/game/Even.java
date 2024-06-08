package hexlet.code.game;

import hexlet.code.Tools;
import hexlet.code.Engine;

public class Even {
    static final String DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    static final int MAX_RANDOM_RANGE = 100;

    public static void start() {
        Engine.run(DESCRIPTION, evenGenerate());
    }

    static String[][] evenGenerate() {
        String[][] data = new String[Engine.REPEAT][2];
        for (var i = 0; i < Engine.REPEAT; i++) {
            int generatedNumber = Tools.random(1, MAX_RANDOM_RANGE);

            String result = isEven(generatedNumber) ? "yes" : "no";
            String question = Integer.toString(generatedNumber);

            data[i][0] = question;
            data[i][1] = result;
        }
        return data;
    }

    static boolean isEven(int input) {
        return (input % 2 == 0);
    }
}
