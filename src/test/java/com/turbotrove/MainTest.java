package com.turbotrove;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import com.turbotrove.*;

public class MainTest {

    private Showroom showroom;
    private Cars car;
    private Employees employee;

    @Before
    public void setUp() {
        showroom = new Showroom();
        car = new Cars();
        employee = new Employees();
    }

    @Test
    public void testShowroomDetails() {
        // Mocking input
        String input = "Showroom A\n123 Main St\nJohn Doe\n10\n50\n123456789\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        showroom.set_details();

        assertEquals("Showroom A", showroom.getShowroomName());
        assertEquals("123 Main St", showroom.getShowroomAddress());
        assertEquals("John Doe", showroom.getManagerName());
        assertEquals(10, showroom.getTotalEmployees());
        assertEquals(50, showroom.getTotalCarsinStock());
        assertEquals(123456789, showroom.getManagerPhone());
    }

    @Test
    public void testCarDetails() {
        // Mocking input
        String input = "Car1\nRed\nPetrol\n20000\nSUV\nAutomatic\n2021\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        car.set_details();

        assertEquals("Car1", car.getCarName());
        assertEquals("Red", car.getCarColor());
        assertEquals("Petrol", car.getCarFueltype());
        assertEquals(20000, car.getCarPrice());
        assertEquals("SUV", car.getCarType());
        assertEquals("Automatic", car.getCarTransmission());
        assertEquals(2021, car.getModelYear());
        assertEquals(1, car.getTotalCarsinStock()); // Assuming one car was added
    }

    @Test
    public void testEmployeeDetails() {
        // Mocking input
        String input = "John Doe\n30\nSales\nShowroom A\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        employee.set_details();

        assertEquals("John Doe", employee.getEmpName());
        assertEquals(30, employee.getEmpAge());
        assertEquals("Sales", employee.getEmpDepartment());
        assertEquals("Showroom A", employee.getShowroomName());
    }
}
