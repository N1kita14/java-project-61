package hexlet.code.game;

import hexlet.code.Tools;
import hexlet.code.Engine;

public class Progression {
    static final String QUESTION = "What number is missing in the progression?";

    static final int MAX_STEP = 5;
    static final int MIN_NUMBERS = 5;
    static final int MAX_ROW = 10;
    static final int MAX_FIRST = 100;

    public static void start() {
        Engine.run(QUESTION, progressionGenerate1());
    }

    static String[] progressionGenerate(int first, int len, int step) {
        String[] numbers = new String[len];
        numbers[0] = Integer.toString(first);
        for (var i = 1; i < numbers.length; i++) {
            numbers[i] = Integer.toString(Integer.parseInt(numbers[i - 1]) + step);
        }
        return numbers;
    }

    static String[][] progressionGenerate1() {
        String[][] data = new String[Engine.REPEAT][2];

        for (var i = 0; i < Engine.REPEAT; i++) {
            int step = Tools.random(1, MAX_STEP);
            int len = Tools.random(MIN_NUMBERS, MAX_ROW);
            int first = Tools.random(1, MAX_FIRST);
            int unknown = Tools.random(0, len - 1);

            var progression = progressionGenerate(first, len, step);

            String result = progression[unknown];
            progression[unknown] = "..";
            String question = String.join(" ", progression);

            data[i][0] = question;
            data[i][1] = result;
        }
        return data;
    }
}
