// EnglishState.java
import java.util.ArrayList;

public class EnglishState implements State {
    private static final String TWINKLE_FILE_NAME = "twinkle-english.txt";
    private static final String HAPPY_FILE_NAME = "happy-english.txt";
    private MusicBox musicBox;

    public EnglishState(MusicBox box) {
        this.musicBox = box;
    }

    @Override
    public void pressStarButton() {
        ArrayList<String> lyrics = FileReader.getLyrics(TWINKLE_FILE_NAME);
        musicBox.playSong("Twinkle Twinkle Little Star", lyrics);
    }

    @Override
    public void pressHappyButton() {
        ArrayList<String> lyrics = FileReader.getLyrics(HAPPY_FILE_NAME);
        musicBox.playSong("If You're Happy and You Know It", lyrics);
    }

    @Override
    public void pressEnglishButton() {
        // Typically no state change
    }

    @Override
    public void pressFrenchButton() {
        musicBox.setState(musicBox.getFrenchState());
    }

    @Override
    public void pressSpanishButton() {
        musicBox.setState(musicBox.getSpanishState());
    }
}
