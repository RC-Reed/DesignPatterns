package mathgame;

/**
 * Class representing a math question.
 */
public class Question {
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_BLACK = "\u001B[30m";

    private int num1;
    private int num2;
    private int answer;
    private int userAnswer;
    private Operand operand;

    /**
     * Constructs a Question with the specified numbers and operand.
     * 
     * @param num1    the first number
     * @param num2    the second number
     * @param operand the operand
     */
    public Question(int num1, int num2, Operand operand) {
        this.num1 = num1;
        this.num2 = num2;
        this.operand = operand;
        calculateAnswer();
    }

    /**
     * Calculates the answer to the question based on the operand.
     */
    private void calculateAnswer() {
        switch (operand) {
            case PLUS:
                answer = num1 + num2;
                break;
            case MINUS:
                answer = num1 - num2;
                break;
            case MULTIPLY:
                answer = num1 * num2;
                break;
        }
    }

    /**
     * Gets the question as a string.
     * 
     * @return the question string
     */
    public String getQuestion() {
        return num1 + " " + operand.getLabel() + " " + num2 + " = ";
    }

    /**
     * Sets the user's answer to the question.
     * 
     * @param answer the user's answer
     */
    public void setUserAnswer(int answer) {
        this.userAnswer = answer;
    }

    /**
     * Checks if the user's answer is correct.
     * 
     * @return true if the user's answer is correct, false otherwise
     */
    public boolean isCorrect() {
        return userAnswer == answer;
    }

    /**
     * Returns a string representation of the question and the answer.
     * 
     * @return the string representation of the question
     */
    @Override
    public String toString() {
        String result = getQuestion() + answer;
        if (userAnswer != answer) {
            result += " You answered " + userAnswer;
        }
        return result;
    }
}
