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
            int hiddenValue = start + hiddenIndex * step;

            StringBuilder questionBuilder = new StringBuilder();

            for (int j = 0; j < length; j++) {
                int current = start + j * step;
                if (j == hiddenIndex) {
                    questionBuilder.append(".. ");
                } else {
                    questionBuilder.append(current).append(" ");
                }
            }

            String question = questionBuilder.toString().trim();
            String correctAnswer = String.valueOf(hiddenValue);

            rounds[i][0] = question;
            rounds[i][1] = correctAnswer;
        }

        Engine.enginegame(DESC, rounds);
    }
}
