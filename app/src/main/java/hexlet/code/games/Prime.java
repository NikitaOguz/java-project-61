package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Rand;

public class Prime {
    private static final String DESC = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static void prime() {
        String[][] rounds = new String[3][2];
        for (int i = 0; i < rounds.length; i++) {
            int number = Rand.random.nextInt(2, 101);
            String question = String.valueOf(number);
            String correctAnswer = isPrime(number) ? "yes" : "no";

            rounds[i][0] = question;
            rounds[i][1] = correctAnswer;
        }

        Engine.enginegame(DESC, rounds);
    }

    private static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}