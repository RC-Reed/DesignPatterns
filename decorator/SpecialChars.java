/**
 * Decorator that adds a special character after each letter in the password randomly.
 */
public class SpecialChars extends PasswordDecorator {
    private static final char[] specials = {'*', '!', '%', '+', '.', '{', '}'};

    /**
     * Constructs a SpecialChars decorator.
     *
     * @param passwordBeginning The initial Password object to be decorated.
     */
    public SpecialChars(Password passwordBeginning) {
        super(passwordBeginning);
    }

    /**
     * Returns the password with random special characters added after each letter.
     *
     * @return The modified password as a string.
     */
    @Override
    public String getPassword() {
        StringBuilder sb = new StringBuilder();
        for (char c : passwordBeginning.getPassword().toCharArray()) {
            sb.append(c);
            if (Math.random() < 0.3) {
                sb.append(specials[(int)(Math.random() * specials.length)]);
            }
        }
        return sb.toString();
    }
}
