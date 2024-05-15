import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * The LanguageSongs class serves as the main driver for the application,
 * allowing users to interact with the MusicBox through a command-line interface.
 */
public class LanguageSongs {
    private Scanner reader;

    /**
     * Constructs a LanguageSongs object initializing the command-line reader.
     */
    public LanguageSongs() {
        reader = new Scanner(System.in);
        clear();
    }

    /**
     * Runs the main loop of the program, handling user commands to control the MusicBox.
     */
    public void run() {
        MusicBox box = new MusicBox();
        
        while(true) {
            System.out.print("Enter (E)nglish, (F)rench, (S)panish, (T)winkle, (H)appy, Or (Q)uit: ");
            String command = reader.nextLine().trim().toLowerCase();

            if(command.equals("q")) break;

            switch (command) {
                case "e":
                    box.pressEnglishButton();
                    break;
                case "f":
                    box.pressFrenchButton();
                    break;
                case "s":
                    box.pressSpanishButton();
                    break;
                case "t":
                    box.pressStarButton();
                    break;
                case "h":
                    box.pressHappyButton();
                    break;
                default:
                    System.out.println("Invalid command");
                    break;
            }
        }
        System.out.println("Goodbye");
    }

    /**
     * Clears the console screen for cleaner output display.
     */
    public static void clear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    /**
     * Sleeps the main thread for a short duration to simulate delay.
     */
    public static void sleep() {
        try {
            TimeUnit.MILLISECONDS.sleep(1000);
        } catch (Exception e) {
            System.out.println("Timer error");
        }
    }

    /**
     * The main method to start the application.
     * 
     * @param args Command-line arguments (not used)
     */
    public static void main(String[] args) {
        LanguageSongs driver = new LanguageSongs();
        driver.run();
    }
}

