// SpanishState.java
import java.util.ArrayList; // Make sure this import is present

public class SpanishState implements State {
    private static final String TWINKLE_FILE_NAME = "twinkle-spanish.txt";
    private static final String HAPPY_FILE_NAME = "happy-spanish.txt";
    private MusicBox musicBox;

    /**
     * Constructs a SpanishState for the given MusicBox.
     * 
     * @param box the MusicBox associated with this state
     */
    public SpanishState(MusicBox box) {
        this.musicBox = box;
    }

    @Override
    public void pressStarButton() {
        ArrayList<String> lyrics = FileReader.getLyrics(TWINKLE_FILE_NAME);
        musicBox.playSong("Estrellita, ¿dónde estás?", lyrics);
    }

    @Override
    public void pressHappyButton() {
        ArrayList<String> lyrics = FileReader.getLyrics(HAPPY_FILE_NAME);
        musicBox.playSong("Si usted esta feliz", lyrics);
    }

    @Override
    public void pressEnglishButton() {
        musicBox.setState(musicBox.getEnglishState());
    }

    @Override
    public void pressFrenchButton() {
        musicBox.setState(musicBox.getFrenchState());
    }

    @Override
    public void pressSpanishButton() {
        // Typically no state change
    }
}
