package com.turbotrove;

import java.util.Scanner;
import java.util.logging.Logger;
import java.util.logging.Level;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());
    private static final String BACK_TO_MAIN_MENU = "[9].GO BACK TO MAIN MENU";
    private static final String EXIT = "[0].EXIT";

    private static Showroom[] showroom = new Showroom[5];
    private static Employees[] employee = new Employees[5];
    private static Cars[] car = new Cars[5];
    private static int carCounter = 0;
    private static int showroomCounter = 0;
    private static int employeesCounter = 0;

    static void mainMenu() {
        logger.info("");
        logger.info("======================= *** WELCOME TO TURBOTROVE *** =======================");
        logger.info("");
        logger.info("============ *** Your Management System for a Car Dealership *** ============");
        logger.info("");
        logger.info("========================= *** ENTER YOUR CHOICE *** =========================");
        logger.info("");
        logger.info("[1].ADD SHOWROOMS");
        logger.info("[2].ADD EMPLOYEES");
        logger.info("[3].ADD CARS");
        logger.info("[4].GET SHOWROOMS");
        logger.info("[5].GET EMPLOYEES");
        logger.info("[6].GET CARS");
        logger.info("");
        logger.info("========================== *** ENTER 0 TO EXIT *** ==========================");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 100;

        while (choice != 0) {
            mainMenu();
            choice = sc.nextInt();

            while (choice != 9 && choice != 0) {
                switch (choice) {
                    case 1:
                        showroom[showroomCounter] = new Showroom();
                        showroom[showroomCounter].set_details();
                        showroomCounter++;
                        logger.info("");
                        logger.info("[1].ADD NEW SHOWROOM");
                        logger.info(BACK_TO_MAIN_MENU);
                        choice = sc.nextInt();
                        break;
                    case 2:
                        employee[employeesCounter] = new Employees();
                        employee[employeesCounter].set_details();
                        employeesCounter++;
                        logger.info("");
                        logger.info("[2].ADD NEW EMPLOYEE");
                        logger.info(BACK_TO_MAIN_MENU);
                        choice = sc.nextInt();
                        break;
                    case 3:
                        car[carCounter] = new Cars();
                        car[carCounter].set_details();
                        carCounter++;
                        logger.info("");
                        logger.info("[3].ADD NEW CAR");
                        logger.info(BACK_TO_MAIN_MENU);
                        choice = sc.nextInt();
                        break;
                    case 4:
                        for (int i = 0; i < showroomCounter; i++) {
                            showroom[i].get_details();
                            logger.info("");
                            logger.info("");
                        }
                        logger.info("");
                        logger.info(BACK_TO_MAIN_MENU);
                        logger.info(EXIT);
                        choice = sc.nextInt();
                        break;
                    case 5:
                        for (int i = 0; i < employeesCounter; i++) {
                            employee[i].get_details();
                            logger.info("");
                            logger.info("");
                        }
                        logger.info("");
                        logger.info(BACK_TO_MAIN_MENU);
                        logger.info(EXIT);
                        choice = sc.nextInt();
                        break;
                    case 6:
                        for (int i = 0; i < carCounter; i++) {
                            car[i].get_details();
                            logger.info("");
                            logger.info("");
                        }
                        logger.info("");
                        logger.info(BACK_TO_MAIN_MENU);
                        logger.info(EXIT);
                        choice = sc.nextInt();
                        break;
                    default:
                        logger.log(Level.WARNING, "ENTER VALID CHOICE: ");
                        break;
                }
            }
        }
        sc.close();
    }

    public static Showroom[] getShowroomArray() {
        return showroom;
    }

    public static Employees[] getEmployeeArray() {
        return employee;
    }

    public static Cars[] getCarArray() {
        return car;
    }

    public static int getCarCounter() {
        return carCounter;
    }

    public static int getShowroomCounter() {
        return showroomCounter;
    }

    public static int getEmployeesCounter() {
        return employeesCounter;
    }
}
