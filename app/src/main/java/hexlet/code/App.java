package hexlet.code;

import java.util.Scanner;

import hexlet.code.game.Even;
import hexlet.code.game.Progression;
import hexlet.code.game.GCD;
import hexlet.code.game.Calc;
import hexlet.code.game.Prime;


public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("Please enter the game number and press Enter.");

        System.out.println("1 - Great");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");

        Scanner input = new Scanner(System.in);
        System.out.println("Your choice: ");
        String button = input.next();
        selectButton(button);
    }

    public static void selectButton(String button) {
        switch (button) {
            case "1":
                Cli.doScanner();
                break;
            case "2":
                Even.playEven();
                break;
            case "3":
                Calc.start();
                break;
            case "4":
                GCD.start();
                break;
            case "5":
                Progression.start();
                break;
            case "6":
                Prime.start();
            default:
                System.out.println("Bye");
        }
    }
}