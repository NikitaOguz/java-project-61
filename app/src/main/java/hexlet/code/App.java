package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        System.out.println("""
        Please enter the game number and press Enter.
        1 - Greet
        2 - Even
        3 - Calc
        4 - GCD
        5 - Progression
        6 - Prime
        0 - Exit""");

        Scanner scanner = new Scanner(System.in);
        String choice = scanner.next();
        System.out.println("Your choice: " + choice);

        switch (choice) {
            case "1" -> Cli.selectname();
            case "2" -> Even.even();
            case "3" -> Calc.calc();
            case "4" -> Gcd.gcd();
            case "5" -> Progression.progression();
            case "6" -> Prime.prime();
            case "0" -> System.out.println("Goodbye!");
            default -> throw new Error("Unknown state!");
        }
    }
}

