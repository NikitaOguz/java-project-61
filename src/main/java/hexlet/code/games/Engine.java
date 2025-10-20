package hexlet.code.games;
import hexlet.code.*;
public class Engine {
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
    public static void expression(String[] args)
    {
        System.out.println("What is the result of the expression?");
        for(int i = 0; i < 3; i++) {
            int first = Rand.random.nextInt(100);
            int second = Rand.random.nextInt(100);
            int num = Rand.random.nextInt(3);
            int correctAnswer = 0;
            String question = "";
            switch (num) {
                case 0:
                    System.out.println("Question: " + first + "+" + second);
                    correctAnswer = first + second;
                    break;
                case 1:
                    System.out.println("Question: " + first + "-" + second);
                    correctAnswer = first - second;
                    break;
                case 2:
                    System.out.println("Question: " + first + "*" + second);
                    correctAnswer = first * second;
                    break;
            }
            int userAnswer = Input.scanner.nextInt();
            System.out.println("Your answer: " + userAnswer);

            if (userAnswer != correctAnswer) {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + Cli.name + "!");
                return;
            }

            System.out.println("Correct!");
        }
        System.out.println("Congratulations, " + Cli.name + "!");
    }
    }
