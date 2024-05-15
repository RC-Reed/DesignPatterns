import java.util.ArrayList;  // Import the ArrayList class

/**
 * The MusicBox class represents a music box that can play songs in different languages.
 * It uses the State design pattern to change its behavior based on its current state.
 */
public class MusicBox {
    private State englishState;
    private State frenchState;
    private State spanishState;
    private State state;

    /**
     * Constructs a new MusicBox and initializes the states for English, French, and Spanish.
     */
    public MusicBox() {
        englishState = new EnglishState(this);
        frenchState = new FrenchState(this);
        spanishState = new SpanishState(this);
        state = englishState;  // Initial state
    }

    /**
     * Simulates pressing the star button on the MusicBox.
     */
    public void pressStarButton() {
        state.pressStarButton();
    }

    /**
     * Simulates pressing the happy button on the MusicBox.
     */
    public void pressHappyButton() {
        state.pressHappyButton();
    }

    /**
     * Simulates pressing the English button on the MusicBox.
     */
    public void pressEnglishButton() {
        state.pressEnglishButton();
    }

    /**
     * Simulates pressing the French button on the MusicBox.
     */
    public void pressFrenchButton() {
        state.pressFrenchButton();
    }

    /**
     * Simulates pressing the Spanish button on the MusicBox.
     */
    public void pressSpanishButton() {
        state.pressSpanishButton();
    }

    /**
     * Sets the current state of the MusicBox.
     * 
     * @param state the new state of the MusicBox
     */
    public void setState(State state) {
        this.state = state;
    }

    /**
     * Gets the current English state of the MusicBox.
     * 
     * @return the English state
     */
    public State getEnglishState() {
        return englishState;
    }

    /**
     * Gets the current French state of the MusicBox.
     * 
     * @return the French state
     */
    public State getFrenchState() {
        return frenchState;
    }

    /**
     * Gets the current Spanish state of the MusicBox.
     * 
     * @return the Spanish state
     */
    public State getSpanishState() {
        return spanishState;
    }

    /**
     * Plays a song with the specified name and lyrics.
     * 
     * @param songName the name of the song to be played
     * @param lyrics the lyrics of the song in an ArrayList of Strings
     */
    public void playSong(String songName, ArrayList<String> lyrics) {
        System.out.println("Now playing: " + songName);
        for (String line : lyrics) {
            System.out.println(line);
        }
    }
}
