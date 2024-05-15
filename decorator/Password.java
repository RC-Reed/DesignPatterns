/**
 * @author Robert Reed
 * Abstract class representing the base component in the Decorator Design Pattern for password generation.
 */
public abstract class Password {
    /**
     * Gets the current state of the password.
     *
     * @return A string representing the current password.
     */
    public abstract String getPassword();
}
