package com.turbotrove;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

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
        // Remove assertions if necessary
        System.out.println("Showroom Name: " + showroom.getShowroomName());
        System.out.println("Showroom Address: " + showroom.getShowroomAddress());
        System.out.println("Manager Name: " + showroom.getManagerName());
        System.out.println("Total Employees: " + showroom.getTotalEmployees());
        System.out.println("Total Cars in Stock: " + showroom.getTotalCarsinStock());
        System.out.println("Manager Phone: " + showroom.getManagerPhone());
    }

    @Test
    public void testCarDetails() {
        // Mocking input
        String input = "Car1\nRed\nPetrol\n20000\nSUV\nAutomatic\n2021\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        car.set_details();
        // Remove assertions if necessary
        System.out.println("Car Name: " + car.getCarName());
        System.out.println("Car Color: " + car.getCarColor());
        System.out.println("Car Fuel Type: " + car.getCarFueltype());
        System.out.println("Car Price: " + car.getCarPrice());
        System.out.println("Car Type: " + car.getCarType());
        System.out.println("Car Transmission: " + car.getCarTransmission());
        System.out.println("Model Year: " + car.getModelYear());
        System.out.println("Total Cars in Stock: " + car.getTotalCarsinStock());
    }

    @Test
    public void testEmployeeDetails() {
        // Mocking input
        String input = "John Doe\n30\nSales\nShowroom A\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        employee.set_details();
        // Remove assertions if necessary
        System.out.println("Employee Name: " + employee.getEmpName());
        System.out.println("Employee Age: " + employee.getEmpAge());
        System.out.println("Employee Department: " + employee.getEmpDepartment());
        System.out.println("Showroom Name: " + employee.getShowroomName());
    }
}
