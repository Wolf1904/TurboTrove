import org.junit.Test;
import static org.github.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.Assert.assertTrue;

public class MainTest {
    @Test
    public void testMainMenuLogging() throws Exception {
        // Capture the console output
        String output = tapSystemOut(() -> {
            Main.mainMenu();
        });

        // Verify that the output contains expected log messages
        assertTrue("Expected 'WELCOME TO TURBOTROVE' in output", output.contains("WELCOME TO TURBOTROVE"));
        assertTrue("Expected 'Your Management System for a Car Dealership' in output", output.contains("Your Management System for a Car Dealership"));
        assertTrue("Expected 'ENTER YOUR CHOICE' in output", output.contains("ENTER YOUR CHOICE"));
        assertTrue("Expected 'ADD SHOWROOMS' in output", output.contains("ADD SHOWROOMS"));
        assertTrue("Expected 'EXIT' in output", output.contains("EXIT"));
    }
}
