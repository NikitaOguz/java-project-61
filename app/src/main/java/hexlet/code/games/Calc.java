package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Rand;

public class Calc {
    private static final String DESC = "What is the result of the expression?";

    public static void calc() {
        String[][] rounds = new String[3][2];
        for (int i = 0; i < rounds.length; i++) {
            int first = Rand.random.nextInt(100);
            int second = Rand.random.nextInt(100);
            int operation = Rand.random.nextInt(3);
            String question = first + " " + getGcd(operation) + " " + second;
            String correctAnswer = String.valueOf(GetCalc(first, second, operation));

            rounds[i][0] = question;
            rounds[i][1] = correctAnswer;
        }

        Engine.enginegame(DESC, rounds);
    }

    private static int GetCalc(int a, int b, int operation) {
        switch (operation) {
            case 0:
                return a + b;
            case 1:
                return a - b;
            case 2:
                return a * b;
            default:
                return 0;
        }
    }

    private static String getGcd(int operation) {
        switch (operation) {
            case 0:
                return "+";
            case 1:
                return "-";
            case 2:
                return "*";
            default:
                return "?";
        }
    }
}