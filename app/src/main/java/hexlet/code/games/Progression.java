package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Rand;

public class Progression {
    private static final String DESC = "What number is missing in the progression?";

    public static void progression() {
        String[][] rounds = new String[3][2];

        for (int i = 0; i < rounds.length; i++) {
            int start = Rand.random.nextInt(11);
            int step = Rand.random.nextInt(5) + 1;
            int length = 10;
            int hiddenIndex = Rand.random.nextInt(length);
            String question = createprogression(start, step, length, hiddenIndex);
            String correctAnswer = String.valueOf(start + hiddenIndex * step);
            rounds[i][0] = question;
            rounds[i][1] = correctAnswer;
        }
        Engine.enginegame(DESC, rounds);
    }

    public static String createprogression(int start, int step, int length, int hiddenIndex) {
        StringBuilder result = new StringBuilder();
        for (int j = 0; j < length; j++) {
            if (j == hiddenIndex) {
                result.append(".. ");
            } else {
                result.append(start + j * step).append(" ");
            }
        }

        return result.toString().trim();
    }

}
