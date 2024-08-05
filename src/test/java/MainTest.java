import org.junit.Test;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void testMainMenu() {
        Logger logger = Logger.getLogger(Main.class.getName());
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        Main.mainMenu();

        // Example assertion to check if certain output is present
        assertTrue(outContent.toString().contains("WELCOME TO TURBOTROVE"));

        // Restore the original System.out
        System.setOut(originalOut);
    }
}
