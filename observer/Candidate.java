
/**
 * @author Robert Reed
 * Represents a candidate in the student government poll.
 */
public class Candidate {
    private String firstName;
    private String lastName;
    private int numFirstPlaceVotes = 0;
    private int numSecondPlaceVotes = 0;
    private int numThirdPlaceVotes = 0;

    /**
     * Constructs a new Candidate with the given first and last name.
     * 
     * @param firstName the first name of the candidate
     * @param lastName the last name of the candidate
     */
    public Candidate(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * Adds a first place vote to this candidate.
     */
    public void addFirstPlaceVote() {
        numFirstPlaceVotes++;
    }

    /**
     * Adds a second place vote to this candidate.
     */
    public void addSecondPlaceVote() {
        numSecondPlaceVotes++;
    }

    /**
     * Adds a third place vote to this candidate.
     */
    public void addThirdPlaceVote() {
        numThirdPlaceVotes++;
    }

    /**
     * Calculates and returns the weighted average of votes for this candidate.
     * 
     * @return the weighted average of votes
     */
    public double getWeightedVotes() {
        return 0.6 * numFirstPlaceVotes + 0.3 * numSecondPlaceVotes + 0.1 * numThirdPlaceVotes;
    }

    /**
     * Returns the full name of the candidate.
     * 
     * @return the full name of the candidate
     */
    public String getFullName() {
        return firstName + " " + lastName;
    }

    /**
     * Returns the number of first place votes.
     * 
     * @return the number of first place votes
     */
    public int getNumFirstPlaceVotes() {
        return numFirstPlaceVotes;
    }

    /**
     * Returns the number of second place votes.
     * 
     * @return the number of second place votes
     */
    public int getNumSecondPlaceVotes() {
        return numSecondPlaceVotes;
    }

    /**
     * Returns the number of third place votes.
     * 
     * @return the number of third place votes
     */
    public int getNumThirdPlaceVotes() {
        return numThirdPlaceVotes;
    }
}
