import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void testMainMenu() {
        // Redirect System.out to capture the output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Call the method to be tested
        Main.mainMenu();

        // Expected output
        String expectedOutput = "1. ADD SHOWROOMS\n" +
                                "2. ADD EMPLOYEES\n" +
                                "3. ADD CARS\n" +
                                "4. GET SHOWROOMS\n" +
                                "5. GET EMPLOYEES\n" +
                                "6. GET CARS\n" +
                                "0. EXIT\n";

        // Check if the actual output matches the expected output
        assertEquals(expectedOutput, outContent.toString());

        // Reset System.out
        System.setOut(System.out);
    }
}
