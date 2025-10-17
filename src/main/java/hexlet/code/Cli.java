package hexlet.code;
public class Cli {
    public static String name;
    public static void selectname(String[] args)
    {
        System.out.println("May I have your name?");
        name = Input.scanner.next();
        System.out.println("Hello, " + name + "!");
    }
}
