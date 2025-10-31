package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Rand;

public class Progression {
    private static final String DESC = "What number is missing in the progression?";
    private static final int ROUNDS_COUNT = 3;
    private static final int MAX_START = 11;
    private static final int MAX_STEP = 5;
    private static final int PROGRESSION_LENGTH = 10;

    public static void progression() {
        String[][] rounds = new String[ROUNDS_COUNT][2];

        for (int i = 0; i < rounds.length; i++) {
            int start = Rand.RANDOM.nextInt(MAX_START);
            int step = Rand.RANDOM.nextInt(MAX_STEP) + 1;
            int hiddenIndex = Rand.RANDOM.nextInt(PROGRESSION_LENGTH);

            int[] progression = createProgression(start, step, PROGRESSION_LENGTH);
            String correctAnswer = String.valueOf(progression[hiddenIndex]);

            StringBuilder question = new StringBuilder();
            for (int j = 0; j < PROGRESSION_LENGTH; j++) {
                if (j == hiddenIndex) {
                    question.append(".. ");
                } else {
                    question.append(progression[j]).append(" ");
                }
            }

            rounds[i][0] = question.toString().trim();
            rounds[i][1] = correctAnswer;
        }

        Engine.enginegame(DESC, rounds);
    }

    public static int[] createProgression(int start, int step, int length) {
        int[] progression = new int[length];
        for (int i = 0; i < length; i++) {
            progression[i] = start + i * step;
        }
        return progression;
    }
}
