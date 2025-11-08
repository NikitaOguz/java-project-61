package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Rand;

public class Calc {
    private static final String DESC = "What is the result of the expression?";
    private static final int MAX_RANDOM = 100;
    private static final String[] OPERATIONS = {"+", "-", "*"};

    public static void calc() {
<<<<<<< HEAD
        String[][] rounds = new String[Engine.ROUNDS][2];
=======
        String[][] rounds = new String[ROUNDS_COUNT][2];
>>>>>>> 79ad30ec3a04ecce271eaf7f2669d01eaf16e283

        for (int i = 0; i < rounds.length; i++) {
            int first = Rand.RANDOM.nextInt(MAX_RANDOM);
            int second = Rand.RANDOM.nextInt(MAX_RANDOM);
            int operationIndex = Rand.RANDOM.nextInt(OPERATIONS.length);

            String operator = OPERATIONS[operationIndex];
            String question = first + " " + operator + " " + second;
            String correctAnswer = String.valueOf(getCalc(first, second, operator));

            rounds[i][0] = question;
            rounds[i][1] = correctAnswer;
        }

        Engine.enginegame(DESC, rounds);
    }

    private static int getCalc(int a, int b, String operator) {
        return switch (operator) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            default -> throw new RuntimeException("Unknown operator: " + operator);
        };
    }
}

