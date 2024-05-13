/**
 * Decorator that appends the reverse of the current password to itself.
 */
public class Pallendrome extends PasswordDecorator {
    /**
     * Constructs a Pallendrome decorator.
     *
     * @param passwordBeginning The initial Password object to be decorated.
     */
    public Pallendrome(Password passwordBeginning) {
        super(passwordBeginning);
    }

    /**
     * Returns the password followed by its reverse.
     *
     * @return The modified password as a string.
     */
    @Override
    public String getPassword() {
        String original = passwordBeginning.getPassword();
        return original + new StringBuilder(original).reverse().toString();
    }
}
