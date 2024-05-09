import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * A driver for our student government polling system.
 */
public class SchoolDriver {
    private static final String CANDIDATE_1 = "Jim Roberts";
    private static final String CANDIDATE_2 = "Cindy Smith";

    public SchoolDriver() {}

    /**
     * Runs our student government polling system.
     */
    public void run() {
        Random rand = new Random();
        StudentGovPoll schoolPolls = new StudentGovPoll("Fun Collegiate");
        new TallyDisplay(schoolPolls);
        new PercentageDisplay(schoolPolls);

        System.out.println("Welcome to " + schoolPolls.getSchool() + "'s Student Gov Poll");

        // Add the candidates to the poll
        schoolPolls.addCandidate("Jim", "Roberts");
        schoolPolls.addCandidate("Cindy", "Smith");
        schoolPolls.addCandidate("Joy", "Lynn");

        // Simulate voting 30 times
        for (int i = 0; i < 30; i++) {
            // Use 0, 1, 2 as indices for the candidates
            ArrayList<Integer> choices = new ArrayList<Integer>(Arrays.asList(0, 1, 2));
            // Select a random candidate for each position
            int a = choices.remove(rand.nextInt(choices.size()));
            int b = choices.remove(rand.nextInt(choices.size()));
            int c = choices.remove(rand.nextInt(choices.size()));
            // Enter votes with corrected indices
            schoolPolls.enterVotes(a, b, c);
        }
    }

    public static void main(String[] args) {
        SchoolDriver driver = new SchoolDriver();
        driver.run();
    }
}
