package hexlet.code;
import java.util.logging.Logger;
public final class Cli {
    Logger logger = Logger.getLogger(getClass().Cli.class.getName());
    private Cli() {
        throw new UnsupportedOperationException("Utility class");
    }

    public static String name;

    public static void selectname() {
        logger.info("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        name = Input.scanner.next();
        System.out.println("Hello, " + name + "!");
    }
}

