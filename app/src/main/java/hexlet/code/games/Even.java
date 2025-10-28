package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Rand;

public class Even {
    private static final String DESC = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void even() {
        String[][] rounds = new String[3][2]; // 3 пары вопрос/ответ

        for (int i = 0; i < rounds.length; i++) {
            int number = Rand.random.nextInt(100);
            String question = String.valueOf(number);
            String answer = (number % 2 == 0) ? "yes" : "no";

            rounds[i][0] = question;
            rounds[i][1] = answer;
        }

        Engine.enginegame(DESC, rounds);
    }
}

