import java.util.ArrayList;

/**
 * @author Robert Reed
 * The observer interface for the observer pattern.
 */
public interface Observer {
    void update(ArrayList<Candidate> candidates);
}
