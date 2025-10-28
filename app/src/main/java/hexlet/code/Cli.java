package hexlet.code;
public final class Cli {
    private Cli() {
        throw new UnsupportedOperationException("Utility class");
    }

    public static String name;

    public static void selectname() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        name = Input.scanner.next();
        System.out.println("Hello, " + name + "!");
    }
}

