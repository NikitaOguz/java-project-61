package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Rand;

public class Progression {
    private static final String DESC = "What number is missing in the progression?";
    private static final int MAX_START = 11;
    private static final int MAX_STEP = 5;
    private static final int PROGRESSION_LENGTH = 10;

    public static void progression() {
        String[][] rounds = new String[Engine.ROUNDS][2];

        for (int i = 0; i < rounds.length; i++) {
            int start = Rand.RANDOM.nextInt(MAX_START);
            int step = Rand.RANDOM.nextInt(MAX_STEP) + 1;
            int hiddenIndex = Rand.RANDOM.nextInt(PROGRESSION_LENGTH);

<<<<<<< HEAD
            String[] progression = makeProgression(start, step, PROGRESSION_LENGTH);
            String correctAnswer = progression[hiddenIndex];

            progression[hiddenIndex] = "..";
            String question = String.join(" ", progression);

            rounds[i][0] = question;
            rounds[i][1] = correctAnswer;
=======
            int[] progression = createProgression(start, step, PROGRESSION_LENGTH);
            int correctAnswer = progression[hiddenIndex];
            progression[hiddenIndex] = -1;

            StringBuilder questionBuilder = new StringBuilder();
            for (int j = 0; j < PROGRESSION_LENGTH; j++) {
                if (j == hiddenIndex) {
                    questionBuilder.append(".. ");
                } else {
                    questionBuilder.append(progression[j]).append(" ");
                }
            }

            String question = questionBuilder.toString().trim();

            rounds[i][0] = question;
            rounds[i][1] = String.valueOf(correctAnswer);
>>>>>>> 79ad30ec3a04ecce271eaf7f2669d01eaf16e283
        }

        Engine.enginegame(DESC, rounds);
    }
    private static String[] makeProgression(int start, int step, int length) {
        String[] progression = new String[length];
        for (int i = 0; i < length; i++) {
            progression[i] = String.valueOf(start + i * step);
        }
        return progression;
    }
}

