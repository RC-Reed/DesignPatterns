import java.util.ArrayList;

/**
 * Represents the student government poll.
 */
public class StudentGovPoll implements Subject {
    private ArrayList<Observer> observers = new ArrayList<>();
    private ArrayList<Candidate> candidates = new ArrayList<>();
    private String school;

    /**
     * Constructs a new Student Government Poll for the given school.
     * 
     * @param school the name of the school
     */
    public StudentGovPoll(String school) {
        this.school = school;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(new ArrayList<>(candidates));
        }
    }

    /**
     * Adds a new candidate to the poll.
     * 
     * @param firstName the first name of the candidate
     * @param lastName the last name of the candidate
     */
    public void addCandidate(String firstName, String lastName) {
        candidates.add(new Candidate(firstName, lastName));
    }

    /**
     * Enters votes for the candidates based on the positions provided.
     * 
     * @param firstPlace the index of the first place candidate
     * @param secondPlace the index of the second place candidate
     * @param thirdPlace the index of the third place candidate
     */
    public void enterVotes(int firstPlace, int secondPlace, int thirdPlace) {
        candidates.get(firstPlace).addFirstPlaceVote();
        candidates.get(secondPlace).addSecondPlaceVote();
        candidates.get(thirdPlace).addThirdPlaceVote();
        notifyObservers();
    }

    /**
     * Returns the school name associated with this poll.
     * 
     * @return the school name
     */
    public String getSchool() {
        return school;
    }
}
