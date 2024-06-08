package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int REPEAT = 3;

    public static void run(String description, String[][] roundsData) {
        System.out.println("Welcome to the Brain Games!");
        Scanner input = new Scanner(System.in);
        System.out.print("May I have your name?");
        String userName = input.nextLine();
        System.out.println("Hello, " + userName + "!");
        System.out.println(description);

        for (String[] roundData : roundsData) {
            String question = roundData[0];
            String rightAnswer = roundData[1];

            System.out.println("Question: " + question);
            System.out.print("Your answer:");
            String answer = input.next();

            String rightAnswerText = "Correct!";
            String wrongAnswerText = "'" + answer + "' is wrong answer ;(. Correct answer was '" + rightAnswer + "'."
                    + "\n" + "Let's try again, " + userName + "!";

            if (answer.equals(rightAnswer)) {
                System.out.println(rightAnswerText);

            } else {
                System.out.println(wrongAnswerText);
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
