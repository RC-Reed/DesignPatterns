package mathgame;

import java.util.Iterator;
import java.util.Scanner;

/**
 * Driver class to run the MathGame.
 */
public class MathDriver {
    public static void main(String[] args) {
        MathGame game = MathGame.getInstance();
        Iterator<Question> iterator = game.getIterator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Let's have fun with Math!");

        int score = 0;
        while (iterator.hasNext()) {
            Question question = iterator.next();
            System.out.print(question.getQuestion());
            int userAnswer = scanner.nextInt();
            question.setUserAnswer(userAnswer);

            if (question.isCorrect()) {
                System.out.println(Question.ANSI_GREEN + question + Question.ANSI_BLACK);
                score++;
            } else {
                System.out.println(Question.ANSI_RED + question + Question.ANSI_BLACK);
            }
        }

        System.out.println("\nResults:");
        iterator = game.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("\nTotal: " + score + "/5");
        scanner.close();
    }
}
