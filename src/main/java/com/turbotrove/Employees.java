package com.turbotrove;
import java.util.Scanner;
import java.util.UUID;
import java.util.logging.Logger;
import java.util.logging.Level;

public class Employees extends Showroom implements Utility {
    private static final Logger logger = Logger.getLogger(Employees.class.getName());

    String empId;
    String empName;
    int empAge;
    String empDepartment;

    // Getter methods
    public String getEmpName() {
        return empName;
    }

    public int getEmpAge() {
        return empAge;
    }

    public String getEmpDepartment() {
        return empDepartment;
    }

    @Override
    public void set_details() {
        try (Scanner sc = new Scanner(System.in)) {
            UUID uuid = UUID.randomUUID();
            empId = String.valueOf(uuid);
            logger.log(Level.INFO, "======================= *** ENTER EMPLOYEE DETAILS *** =======================");
            logger.log(Level.INFO, "");
            logger.log(Level.INFO, "EMPLOYEE NAME: ");
            empName = sc.nextLine();
            logger.log(Level.INFO, "EMPLOYEE AGE: ");
            empAge = sc.nextInt();
            sc.nextLine();
            logger.log(Level.INFO, "EMPLOYEE DEPARTMENT: ");
            empDepartment = sc.nextLine();
            logger.log(Level.INFO, "SHOWROOM NAME: ");
            showroomName = sc.nextLine();
        }
    }
}