import java.util.ArrayList;

/**
 * The observer interface for the observer pattern.
 */
public interface Observer {
    void update(ArrayList<Candidate> candidates);
}
