import java.util.Scanner;
import java.util.UUID;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.logging.ConsoleHandler;
import java.util.logging.SimpleFormatter;

public class Employees extends Showroom implements Utility {
    private static final Logger logger = Logger.getLogger(Employees.class.getName());

    static {
        ConsoleHandler handler = new ConsoleHandler();
        handler.setLevel(Level.WARNING);
        handler.setFormatter(new SimpleFormatter());
        logger.addHandler(handler);
        logger.setUseParentHandlers(false);
    }
    
    String empId;
    String empName;
    int empAge;
    String empDepartment;

    @Override
    public void get_details() {
        logger.log(Level.INFO, "ID: {0}", empId);
        logger.log(Level.INFO, "Name: {0}", empName);
        logger.log(Level.INFO, "Age: {0}", empAge);
        logger.log(Level.INFO, "Department: {0}", empDepartment);
        logger.log(Level.INFO, "Showroom Name: {0}", showroomName);
    }

    @Override
    public void set_details() {
        Scanner sc = new Scanner(System.in);
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
