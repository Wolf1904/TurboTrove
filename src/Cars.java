import java.util.Scanner;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.logging.ConsoleHandler;
import java.util.logging.SimpleFormatter;

public class Cars extends Showroom implements Utility {
    private static final Logger logger = Logger.getLogger(Cars.class.getName());

    static {
        ConsoleHandler handler = new ConsoleHandler();
        handler.setLevel(Level.WARNING);
        handler.setFormatter(new SimpleFormatter());
        logger.addHandler(handler);
        logger.setUseParentHandlers(false);
    }
    
    String carName;
    String carColor;
    String carFueltype;
    int carPrice;
    String carType;
    String carTransmission;
    int modelYear;

    @Override
    public void get_details() {
        logger.log(Level.INFO, "NAME: {0}", carName);
        logger.log(Level.INFO, "COLOR: {0}", carColor);
        logger.log(Level.INFO, "FUEL TYPE: {0}", carFueltype);
        logger.log(Level.INFO, "PRICE: {0}", carPrice);
        logger.log(Level.INFO, "TYPE: {0}", carType);
        logger.log(Level.INFO, "TRANSMISSION: {0}", carTransmission);
        logger.log(Level.INFO, "MODEL YEAR: {0}", modelYear);
    }
    
    @Override
    public void set_details() {
        Scanner sc = new Scanner(System.in);
        logger.log(Level.INFO, "======================= *** ENTER CAR DETAILS *** =======================");
        logger.log(Level.INFO, "");
        logger.log(Level.INFO, "CAR NAME: ");
        carName = sc.nextLine();
        logger.log(Level.INFO, "CAR COLOR: ");
        carColor = sc.nextLine();
        logger.log(Level.INFO, "CAR FUEL TYPE (PETROL/DIESEL/CNG/ELECTRIC): ");
        carFueltype = sc.nextLine();
        logger.log(Level.INFO, "CAR PRICE: ");
        carPrice = sc.nextInt();
        sc.nextLine();
        logger.log(Level.INFO, "CAR TYPE (SEDAN/SUV/HATCHBACK): ");
        carType = sc.nextLine();
        logger.log(Level.INFO, "TRANSMISSION TYPE (AUTOMATIC/MANUAL): ");
        carTransmission = sc.nextLine();
        logger.log(Level.INFO, "MODEL YEAR: ");
        modelYear = sc.nextInt();
        totalCarsinStock++;
    }
}