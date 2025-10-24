package hexlet.code.games;
import hexlet.code.*;

import java.math.BigInteger;

public class Engine {

    public static void generation() {
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

    public static void expression() {
        System.out.println("What is the result of the expression?");
        for (int i = 0; i < 3; i++) {
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

    public static void nod() {
        System.out.println("Find the greatest common divisor of given numbers.");
        for (int i = 0; i < 3; i++) {
            int nod1 = Rand.random.nextInt(100);
            int nod2 = Rand.random.nextInt(100);
            System.out.println("Question: " + nod1 + " " + nod2);
            BigInteger n1 = BigInteger.valueOf(nod1);
            BigInteger n2 = BigInteger.valueOf(nod2);
            BigInteger resultnod = n1.gcd(n2);
            int gcdAnswer = Input.scanner.nextInt();
            System.out.println("Your answer: " + gcdAnswer);
            if (BigInteger.valueOf(gcdAnswer).equals(resultnod)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + gcdAnswer + "' is wrong answer ;(. Correct answer was '" + resultnod + "'.");
                System.out.println("Let's try again, " + Cli.name + "!");
                return;
            }
            System.out.println("Congratulations, " + Cli.name + "!");
        }
    }

    public static void formule() {
        int start = Rand.random.nextInt(11);
        int step = Rand.random.nextInt(5) + 1;
        int length = 10;
        int randindex = Rand.random.nextInt(length);
        StringBuilder question = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int currentElement = start + i * step;
            if (i == randindex) {
                question.append(".. ");
            } else {
                question.append(currentElement).append(" ");
            }
        }

        System.out.println("Question: " + question.toString().trim());
        System.out.print("Your answer: ");
        int answer = Input.scanner.nextInt();

        if (answer == start + randindex * step) {
            System.out.println("Correct!");
        } else {
            System.out.println(answer + " is wrong answer ;(. Correct answer was " + (start + randindex * step));
            System.out.println("Let's try again, " + Cli.name + "!" );
            System.exit(0);
        }
        System.out.println("Congratulations, " + Cli.name + "!");
    }

    public static void progression() {
        System.out.println("What number is missing in the progression?");
        for (int i = 0; i < 3; i++) {
            formule();
        }
    }
    public static void prime()
    {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        for(int i = 0; i < 3; i++) {
            int primenum = Rand.random.nextInt(100);
            System.out.println("Question: " + primenum);
            String useranswer = Input.scanner.next();
            System.out.println("Your answer: " + useranswer);
            boolean isPrime = true;
            if (primenum < 2) {
                isPrime = false;
                for (int j = 2; j < primenum / 2; i++) {
                    if (primenum % j == 0) {
                        isPrime = false;
                    }
                }
            }
            String correctAnswer = isPrime ? "yes" : "no";
            if (useranswer.equals(correctAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + useranswer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + Cli.name + "!");
                return; // завершить игру при первой ошибке
            }
        }
        System.out.println("Congratulations, " + Cli.name + "!");
    }
}