package mathgame;

/**
 * Enumeration for mathematical operands.
 */
public enum Operand {
    PLUS("+"),
    MINUS("-"),
    MULTIPLY("*");

    private final String label;

    /**
     * Constructs an Operand with the specified label.
     * 
     * @param label the label of the operand
     */
    Operand(String label) {
        this.label = label;
    }

    /**
     * Gets the label of the operand.
     * 
     * @return the label of the operand
     */
    public String getLabel() {
        return label;
    }
}
