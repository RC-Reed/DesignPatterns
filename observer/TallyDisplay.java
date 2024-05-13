import java.util.ArrayList;

/**
 * @author Robert Reed
 * Display observer that shows the current tallies of the votes.
 */
public class TallyDisplay implements Observer {
    private Subject poll;
    private ArrayList<Candidate> candidates;

    /**
     * Constructs a new TallyDisplay linked to the given poll.
     * 
     * @param poll the subject to observe
     */
    public TallyDisplay(Subject poll) {
        this.poll = poll;
        poll.registerObserver(this);
        this.candidates = new ArrayList<>();
    }

    @Override
    public void update(ArrayList<Candidate> candidates) {
        this.candidates = candidates;
        display();
    }

    /**
     * Displays the current tallies for each candidate.
     */
    private void display() {
        System.out.println("Current Tallies:");
        for (Candidate candidate : candidates) {
            System.out.println(candidate.getFullName() + ": First(" + candidate.getNumFirstPlaceVotes() + "), Second(" + candidate.getNumSecondPlaceVotes() + "), Third(" + candidate.getNumThirdPlaceVotes() + ")");
        }
        System.out.println(); // Add a blank line for spacing after the tallies
    }
}
