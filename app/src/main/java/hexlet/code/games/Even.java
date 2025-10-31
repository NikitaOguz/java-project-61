package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Rand;

public class Even {
    private static final String DESC = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final int ROUNDS_COUNT = 3;
    private static final int MAX_RANDOM_NUMBER = 100;

    public static void even() {
        String[][] rounds = new String[ROUNDS_COUNT][2];

        for (int i = 0; i < rounds.length; i++) {
            int number = Rand.RANDOM.nextInt(MAX_RANDOM_NUMBER);
            String question = String.valueOf(number);
            String answer = (number % 2 == 0) ? "yes" : "no";

            rounds[i][0] = question;
            rounds[i][1] = answer;
        }

        Engine.enginegame(DESC, rounds);
    }
}

