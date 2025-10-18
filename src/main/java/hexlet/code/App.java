package hexlet.code;
import java.util.logging.Logger;
public class App {
    private static final Logger logger = Logger.getLogger(App.class.getName());

    public static void main(String[] args) {
        logger.info("Please enter the game number and press Enter:" + "\n" + "1 - Greet\n" +
                "2 - Even\n" +
                "0 - Exit");
        int number = Input.scanner.nextInt();
        switch (number)
        {
            case 1 :
                System.out.println("Welcome to the Brain Games!");
                Cli.selectname(args);
                break;
            case 2:
                System.out.println("Welcome to the Brain Games!");
                Cli.selectname(args);
                System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
                Generation.generation(args);
                break;
            case 0:
                return;
            default:
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.\n" +
                        "Let's try again, " + Cli.name);
        }
    }
}
