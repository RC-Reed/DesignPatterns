import java.util.ArrayList;

/**
 * Display observer that shows the current percentage of votes for each candidate.
 */
public class PercentageDisplay implements Observer {
    private Subject poll;
    private ArrayList<Candidate> candidates;

    /**
     * Constructs a new PercentageDisplay linked to the given poll.
     * 
     * @param poll the subject to observe
     */
    public PercentageDisplay(Subject poll) {
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
     * Displays the current percentage of votes for each candidate.
     */
    private void display() {
        System.out.println("Current Percent of Votes:");
        double totalWeightedVotes = candidates.stream().mapToDouble(Candidate::getWeightedVotes).sum();
        for (Candidate candidate : candidates) {
            double percentage = (candidate.getWeightedVotes() / totalWeightedVotes) * 100;
            System.out.printf("%s %.2f%%\n", candidate.getFullName(), percentage);
        }
        System.out.println(); // Add a blank line for spacing after the percentages
    }
}
