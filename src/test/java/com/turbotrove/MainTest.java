package com.turbotrove;

import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class MainTest {

    private Showroom showroom;
    private Cars car;
    private Employees employee;
    private Main app;

    @Before
    public void setUp() {
        showroom = new Showroom();
        car = new Cars();
        employee = new Employees();
        app = new Main();
    }

    @Test
    public void testAddShowroom() {
        // Simulates adding a showroom and then returning to the menu
        String input = "1\nShowroom A\n123 Main St\nJohn Doe\n10\n50\n123456789\n9\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        app.run(); // Call the run method for testing
    }

    @Test
    public void testAddEmployee() {
        // Simulates adding an employee and then returning to the menu
        String input = "2\nJohn Doe\n30\nSales\nShowroom A\n9\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        app.run(); // Call the run method for testing
    }

    @Test
    public void testAddCar() {
        // Simulates adding a car and then returning to the menu
        String input = "3\nCar1\nRed\nPetrol\n20000\nSUV\nAutomatic\n2021\n9\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        app.run(); // Call the run method for testing
    }

    @Test
    public void testGetShowroom() {
        // Simulates viewing showroom details and exiting
        String input = "4\n0\n"; // View showroom details and exit
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        app.run(); // Call the run method for testing
    }

    @Test
    public void testGetEmployees() {
        // Simulates viewing employee details and exiting
        String input = "5\n0\n"; // View employee details and exit
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        app.run(); // Call the run method for testing
    }

    @Test
    public void testGetCars() {
        // Simulates viewing car details and exiting
        String input = "6\n0\n"; // View car details and exit
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        app.run(); // Call the run method for testing
    }
}
