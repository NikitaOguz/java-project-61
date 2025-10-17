package hexlet.code;
import java.util.Random;
public class Generation {
    public static void generation(String[] args)
    {

        Random random = new Random();
        for (int i = 0; i < 3; i++) {  // повторение 3 раза
        int rand = random.nextInt(100);
        System.out.println("Question: " + rand);
        String answer = Input.scanner.next();
        System.out.println("Your answer: " + answer);

        if (rand % 2 == 0 && answer.equals("yes")) {
            System.out.println("Correct!");
        } else {
            System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.\n" +
                    "Let's try again, " + Cli.name + "!");
            break;
        }
    }
    }
}