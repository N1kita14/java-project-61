package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.Tools;

public class Calc {
    static final String QUESTION = "What is the result of the expression?";
    static final int MAX_RANDOM = 100;
    static final String[] OPERATORS = {"+", "-", "*"};

    public static void start() {
        Engine.run(QUESTION, calcDataGenerate());
    }

    static int calculate(int first, int second, String operator) {
        switch (operator) {
            case "+":
                return first + second;
            case "-":
                return first - second;
            case "*":
                return first * second;
            default:
                return 0;
        }
    }

    static String[][] calcDataGenerate() {
        String[][] data = new String[Engine.REPEAT][2];
        for (var i = 0; i < Engine.REPEAT; i++) {
            int first = Tools.random(1, MAX_RANDOM);
            int second = Tools.random(1, MAX_RANDOM);
            int operatorPosition = Tools.random(0, OPERATORS.length - 1);

            String result = String.valueOf(calculate(first, second, OPERATORS[operatorPosition]));
            String question = first + " " + OPERATORS[operatorPosition] + " " + second;

            data[i][0] = question;
            data[i][1] = result;
        }
        return data;
    }
}
