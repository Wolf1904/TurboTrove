// Showroom.java
package com.turbotrove;
import java.util.Scanner;
import java.util.logging.Logger;
import java.util.logging.Level;

public class Showroom implements Utility {
    private static final Logger logger = Logger.getLogger(Showroom.class.getName());

    protected String showroomName;
    private String showroomAddress;
    private String managerName;
    private int totalEmployees;
    public int totalCarsinStock = 0;
    private int managerPhone;

    @Override
    public void get_details() {
        logger.log(Level.INFO, "Showroom Name: {0}", showroomName);
        logger.log(Level.INFO, "Showroom Address: {0}", showroomAddress);
        logger.log(Level.INFO, "Manager Name: {0}", managerName);
        logger.log(Level.INFO, "Total Employees: {0}", totalEmployees);
        logger.log(Level.INFO, "Total Cars in Stock: {0}", totalCarsinStock);
        logger.log(Level.INFO, "Manager Phone: {0}", managerPhone);
    }

    @Override
    public void set_details() {
        Scanner sc = new Scanner(System.in);
        logger.log(Level.INFO, "======================= *** ENTER SHOWROOM DETAILS *** =======================");
        logger.log(Level.INFO, "");
        logger.log(Level.INFO, "SHOWROOM NAME: ");
        setShowroomName(sc.nextLine());
        logger.log(Level.INFO, "SHOWROOM ADDRESS: ");
        setShowroomAddress(sc.nextLine());
        logger.log(Level.INFO, "MANAGER NAME: ");
        setManagerName(sc.nextLine());
        logger.log(Level.INFO, "TOTAL NO OF EMPLOYEES: ");
        setTotalEmployees(sc.nextInt());
        logger.log(Level.INFO, "TOTAL CARS IN STOCK: ");
        setTotalCarsinStock(sc.nextInt());
        logger.log(Level.INFO, "MANAGER PHONE: ");
        setManagerPhone(sc.nextInt());
    }

    public static Logger getLogger() {
        return logger;
    }

    public String getShowroomName() {
        return showroomName;
    }

    public void setShowroomName(String showroomName) {
        this.showroomName = showroomName;
    }

    public String getShowroomAddress() {
        return showroomAddress;
    }

    public void setShowroomAddress(String showroomAddress) {
        this.showroomAddress = showroomAddress;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public int getTotalEmployees() {
        return totalEmployees;
    }

    public void setTotalEmployees(int totalEmployees) {
        this.totalEmployees = totalEmployees;
    }

    public int getTotalCarsinStock() {
        return totalCarsinStock;
    }

    public void setTotalCarsinStock(int totalCarsinStock) {
        this.totalCarsinStock = totalCarsinStock;
    }

    public int getManagerPhone() {
        return managerPhone;
    }

    public void setManagerPhone(int managerPhone) {
        this.managerPhone = managerPhone;
    }
}
