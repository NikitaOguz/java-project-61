package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Rand;

public class Calc {
    private static final String DESC = "What is the result of the expression?";
    private static final int ROUNDS_COUNT = 3;
    private static final int MAX_RANDOM = 100;
    private static final int OPERATIONS_COUNT = 3;

    public static void calc() {
        String[][] rounds = new String[ROUNDS_COUNT][2];

        for (int i = 0; i < rounds.length; i++) {
            int first = Rand.RANDOM.nextInt(MAX_RANDOM);
            int second = Rand.RANDOM.nextInt(MAX_RANDOM);
            int operation = Rand.RANDOM.nextInt(OPERATIONS_COUNT);
            String question = first + " " + getOperator(operation) + " " + second;
            String correctAnswer = String.valueOf(getCalc(first, second, operation));

            rounds[i][0] = question;
            rounds[i][1] = correctAnswer;
        }

        Engine.enginegame(DESC, rounds);
    }

    private static int getCalc(int a, int b, int operation) {
        return switch (operation) {
            case 0 -> a + b;
            case 1 -> a - b;
            case 2 -> a * b;
            default -> 0;
        };
    }

    private static String getOperator(int operation) {
        return switch (operation) {
            case 0 -> "+";
            case 1 -> "-";
            case 2 -> "*";
            default -> "?";
        };
    }
}