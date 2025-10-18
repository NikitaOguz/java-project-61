package hexlet.code;
public class Generation {
    public static void generation(String[] args)
    {
        Rand r = new Rand();                   // создаём объект
        int number = r.random.nextInt(100);
        for (int i = 0; i < 3; i++) {  // повторение 3 раза
        System.out.println("Question: " + number);
        String answer = Input.scanner.next();
        System.out.println("Your answer: " + answer);

        if (number % 2 == 0 && answer.equals("yes")) {
            System.out.println("Correct!");
        } else {
            System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.\n" +
                    "Let's try again, " + Cli.name + "!");
            break;
        }
    }
    }
}