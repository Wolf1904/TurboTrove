import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.logging.Logger;

public class MainTest {

    private static final Logger logger = Logger.getLogger(MainTest.class.getName());

    @Test
    public void testMainMenu() {
        // Set up a stream to capture output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        // Call the mainMenu method
        Main.mainMenu();

        // Restore original System.out
        System.setOut(originalOut);

        // Capture the output for manual verification
        logger.info(outContent.toString());

        // Manual verification can be done by inspecting the log output
        // Remove this line in production if automated verification is not required
    }
}
