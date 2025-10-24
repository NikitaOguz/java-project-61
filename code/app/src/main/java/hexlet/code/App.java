package hexlet.code;

import hexlet.code.games.Engine;
import java.util.logging.Logger;

public class App {
    private static final Logger log = Logger.getLogger(App.class.getName());

    public static void main(String[] args) {
        log.info("""
        Please enter the game number and press Enter.
        1 - Greet
        2 - Even
        3 - Calc
        4 - GCD
        5 - Progression
        6 - Prime
        0 - Exit""");

        int number = Input.scanner.nextInt();
        switch (number) {
            case 1:
                log.info("Your choice: 1");
                Cli.selectname();
                break;

            case 2:
                log.info("Your choice: 2");
                Cli.selectname();
                log.info("Answer 'yes' if the number is even, otherwise answer 'no'.");
                Engine.generation();
                break;

            case 3:
                log.info("Your choice: 3");
                Cli.selectname();
                Engine.expression();
                break;

            case 4:
                log.info("Your choice: 4");
                Cli.selectname();
                Engine.nod();
                break;

            case 5:
                log.info("Your choice: 5");
                Cli.selectname();
                Engine.progression();
                break;

            case 6:
                log.info("Your choice: 6");
                Cli.selectname();
                Engine.prime();
                break;

            case 0:
                return;

            default:
                log.warning("'yes' is wrong answer ;(. Correct answer was 'no'.\n" +
                        "Let's try again, " + Cli.name);
        }
    }
}

