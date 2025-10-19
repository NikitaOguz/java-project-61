package hexlet.code;
public class App {

    public static void main(String[] args) {
        System.out.println("""
        Please enter the game number and press Enter.
        1 - Greet
        2 - Even
        3 - Calc
        0 - Exit""");
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
                hexlet.code.Engine.generation(args);
                break;
            case 3:
                System.out.println("Welcome to the Brain Games!");
                Cli.selectname(args);
                hexlet.code.Engine.expression(args);
            case 0:
                return;
            default:
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.\n" +
                        "Let's try again, " + Cli.name);
        }
    }
}
