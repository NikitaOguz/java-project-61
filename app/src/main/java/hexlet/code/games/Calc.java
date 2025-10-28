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
            int num = Rand.random.nextInt(3);
            int correctAnswer = 0;
            String question = " ";
            switch (num) {
                case 0:
                    question = first + " + " + second;
                    correctAnswer = first + second;
                    break;
                case 1:
                    question = first + " - " + second;
                    correctAnswer = first - second;
                    break;
                case 2:
                    question = first + " * " + second;
                    correctAnswer = first * second;
                    break;
            }
            rounds[i][0] = question;
            rounds[i][1] = String.valueOf(correctAnswer);
        }
        Engine.enginegame(DESC, rounds);
    }
}
