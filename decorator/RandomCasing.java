/**
 * @author Robert Reed
 * Decorator that randomly changes the casing of each letter in the password.
 */
public class RandomCasing extends PasswordDecorator {
    /**
     * Constructs a RandomCasing decorator.
     *
     * @param passwordBeginning The initial Password object to be decorated.
     */
    public RandomCasing(Password passwordBeginning) {
        super(passwordBeginning);
    }

    /**
     * Returns the password with each letter randomly converted to upper or lower case.
     *
     * @return The modified password as a string.
     */
    @Override
    public String getPassword() {
        StringBuilder sb = new StringBuilder();
        for (char c : passwordBeginning.getPassword().toCharArray()) {
            if (Math.random() < 0.5) sb.append(Character.toLowerCase(c));
            else sb.append(Character.toUpperCase(c));
        }
        return sb.toString();
    }
}
