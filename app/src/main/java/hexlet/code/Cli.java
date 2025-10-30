package hexlet.code;

import java.util.Scanner;

public final class Cli {
    private Cli() {
        throw new UnsupportedOperationException("Utility class");
    }

    public static void selectname() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String name = scanner.next();
        System.out.println("Hello, " + name + "!");
    }
}

