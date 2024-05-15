// FrenchState.java
import java.util.ArrayList;

public class FrenchState implements State {
    private static final String TWINKLE_FILE_NAME = "twinkle-french.txt";
    private static final String HAPPY_FILE_NAME = "happy-french.txt";
    private MusicBox musicBox;

    public FrenchState(MusicBox box) {
        this.musicBox = box;
    }

    @Override
    public void pressStarButton() {
        ArrayList<String> lyrics = FileReader.getLyrics(TWINKLE_FILE_NAME);
        musicBox.playSong("Brille, brille, petite étoile", lyrics);
    }

    @Override
    public void pressHappyButton() {
        ArrayList<String> lyrics = FileReader.getLyrics(HAPPY_FILE_NAME);
        musicBox.playSong("Si tu as d' la joie au coeur", lyrics);
    }

    @Override
    public void pressEnglishButton() {
        musicBox.setState(musicBox.getEnglishState());
    }

    @Override
    public void pressFrenchButton() {
        // Typically no state change
    }

    @Override
    public void pressSpanishButton() {
        musicBox.setState(musicBox.getSpanishState());
    }
}
