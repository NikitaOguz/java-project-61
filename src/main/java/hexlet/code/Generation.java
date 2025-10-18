package hexlet.code;

public class Generation {
    public static void generation(String[] args) {
        for (int i = 0; i < 3; i++) {  // цикл с 3 повторениями
            int number = Rand.random.nextInt(100);
            System.out.println("Question: " + number);
            String answer = Input.scanner.next();
            System.out.println("Your answer: " + answer);

            boolean isEven = number % 2 == 0;
            String correctAnswer = isEven ? "yes" : "no";

            if ((isEven && answer.equals("yes")) || (!isEven && answer.equals("no"))) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + Cli.name + "!");
                return; // завершение игры при ошибке
            }

        }
        System.out.println("Congratulations, " + Cli.name + "!");
    }
}
