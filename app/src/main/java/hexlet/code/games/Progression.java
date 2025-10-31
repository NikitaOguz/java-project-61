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
            int[] progression = createProgression(start, step, length);
            String correctAnswer = String.valueOf(progression[hiddenIndex]);
            StringBuilder question = new StringBuilder();
            for (int j = 0; j < length; j++) {
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
