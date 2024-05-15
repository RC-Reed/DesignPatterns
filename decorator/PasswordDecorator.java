/**
 * @author Robert Reed
 * Abstract decorator class extending Password to allow for additional modifications to the password.
 */
public abstract class PasswordDecorator extends Password {
    protected Password passwordBeginning;

    /**
     * Initializes a new PasswordDecorator with a reference to a Password object.
     *
     * @param passwordBeginning The initial Password object to be decorated.
     */
    public PasswordDecorator(Password passwordBeginning) {
        this.passwordBeginning = passwordBeginning;
    }
}
