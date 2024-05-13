/**
 * @author Robert Reed
 * Decorator that replaces certain letters in the password with symbols.
 */
public class Symbols extends PasswordDecorator {
    /**
     * Constructs a Symbols decorator.
     *
     * @param passwordBeginning The initial Password object to be decorated.
     */
    public Symbols(Password passwordBeginning) {
        super(passwordBeginning);
    }

    /**
     * Replaces specified letters with symbols in the current password.
     *
     * @return The modified password as a string.
     */
    @Override
    public String getPassword() {
        String original = passwordBeginning.getPassword();
        return original.replace("a", "@").replace("b", "8")
                       .replace("e", "3").replace("g", "9")
                       .replace("i", "!").replace("o", "0")
                       .replace("s", "$").replace("t", "7");
    }
}
