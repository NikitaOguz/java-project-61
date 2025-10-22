package hexlet.code;

import hexlet.code.games.Engine;

public class App {
    public static void main(String[] args) {
        System.out.println("""
        Please enter the game number and press Enter.
        1 - Greet
        2 - Even
        3 - Calc
        4 - GCD
        5 - Progression
        0 - Exit""");
        int number = Input.scanner.nextInt();
        switch (number)
        {
            case 1 :
                Cli.selectname();
                break;
            case 2:
                Cli.selectname();
                System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
                hexlet.code.games.Engine.generation();
                break;
            case 3:
                Cli.selectname();
                hexlet.code.games.Engine.expression();
                break;
                case 4:
                    Cli.selectname();
                    Engine.nod();
                    break;
            case 5:
                Cli.selectname();
                Engine.progression();
                break;
            case 0:
                return;
            default:
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.\n" +
                        "Let's try again, " + Cli.name);
        }
    }
}
