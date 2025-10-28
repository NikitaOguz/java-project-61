package hexlet.code.games;
import java.math.BigInteger;

import hexlet.code.Engine;
import hexlet.code.Rand;

public class Gcd {
    private static final String DESC = "Find the greatest common divisor of given numbers.";
    public static void gcd() {
        String[][] rounds = new String[3][2];
        for (int i = 0; i < rounds.length; i++) {
            int nod1 = Rand.random.nextInt(100);
            int nod2 = Rand.random.nextInt(100);
            String question = nod1 + " " + nod2;
            BigInteger n1 = BigInteger.valueOf(nod1);
            BigInteger n2 = BigInteger.valueOf(nod2);
            String correctAnswer = n1.gcd(n2).toString();
            rounds[i][0] = question;
            rounds[i][1] = correctAnswer;
        }
        Engine.enginegame(DESC, rounds);
    }
}
