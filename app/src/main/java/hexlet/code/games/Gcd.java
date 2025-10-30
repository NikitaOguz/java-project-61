package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Rand;

public class Gcd {
    private static final String DESC = "Find the greatest common divisor of given numbers.";

    public static void gcd() {
        String[][] rounds = new String[3][2];
        for (int i = 0; i < rounds.length; i++) {
            int num1 = Rand.random.nextInt(100);
            int num2 = Rand.random.nextInt(100);
            String question = num1 + " " + num2;
            String correctAnswer = String.valueOf(creategcd(num1, num2));

            rounds[i][0] = question;
            rounds[i][1] = correctAnswer;
        }

        Engine.enginegame(DESC, rounds);
    }
    private static int creategcd(int n1, int n2) {
        while (n2 != 0) {
            int temp = n2;
            n2 = n1 % n2;
            n1 = temp;
        }
        return Math.abs(n1);
    }
}