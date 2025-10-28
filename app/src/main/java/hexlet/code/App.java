package hexlet.code;

import hexlet.code.games.*;


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

        String choice = Input.scanner.next();

        switch (choice) {
            case "1" -> Cli.selectname();
            case "2" -> Even.even();
            case "3" -> Calc.calc();
            case "4" -> Gcd.gcd();
            case "5" -> Progression.progression();
            case "6" -> Prime.prime();
            case "0" -> System.out.println("Goodbye!");
        }
    }
}



