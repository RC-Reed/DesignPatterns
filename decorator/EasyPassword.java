/**
 * @author Robert Reed
 * Concrete implementation of Password that generates an easy-to-read password.
 * This class replaces spaces with dashes and appends a random number between 0 and 100.
 */
public class EasyPassword extends Password {
    private String password;

    /**
     * Constructs an EasyPassword instance by modifying the input phrase.
     *
     * @param phrase The input string to be transformed into an easy password.
     */
    public EasyPassword(String phrase) {
        this.password = phrase.replace(" ", "-") + (int)(Math.random() * 101);
    }

    /**
     * Retrieves the modified password with dashes and a random number.
     *
     * @return The easy password as a string.
     */
    @Override
    public String getPassword() {
        return password;
    }
}
