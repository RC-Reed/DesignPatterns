package mathgame;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/**
 * Singleton class to generate and manage math questions.
 */
public class MathGame {
    private static final int NUM_QUESTIONS = 5;
    private static MathGame mathGame = null;
    private ArrayList<Question> questions;

    /**
     * Private constructor to prevent instantiation.
     */
    private MathGame() {
        questions = new ArrayList<>();
        generateQuestions();
    }

    /**
     * Gets the single instance of MathGame.
     * 
     * @return the instance of MathGame
     */
    public static MathGame getInstance() {
        if (mathGame == null) {
            mathGame = new MathGame();
        }
        return mathGame;
    }

    /**
     * Gets an iterator for the questions.
     * 
     * @return an iterator for the questions
     */
    public Iterator<Question> getIterator() {
        return questions.iterator();
    }

    /**
     * Generates a list of random math questions.
     */
    private void generateQuestions() {
        Random rand = new Random();
        for (int i = 0; i < NUM_QUESTIONS; i++) {
            int num1 = rand.nextInt(100) + 1;
            int num2 = rand.nextInt(100) + 1;
            Operand operand = Operand.values()[rand.nextInt(Operand.values().length)];
            questions.add(new Question(num1, num2, operand));
        }
    }
}
