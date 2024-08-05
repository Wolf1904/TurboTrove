package com.turbotrove;
import java.util.Scanner;
import java.util.logging.Logger;
import java.util.logging.Level;

public class Cars extends Showroom implements Utility {
    private static final Logger logger = Logger.getLogger(Cars.class.getName());

    String carName;
    String carColor;
    String carFueltype;
    int carPrice;
    String carType;
    String carTransmission;
    int modelYear;

    // Getter methods
    public String getCarName() {
        return carName;
    }

    public String getCarColor() {
        return carColor;
    }

    public String getCarFueltype() {
        return carFueltype;
    }

    public int getCarPrice() {
        return carPrice;
    }

    public String getCarType() {
        return carType;
    }

    public String getCarTransmission() {
        return carTransmission;
    }

    public int getModelYear() {
        return modelYear;
    }

    // Setter methods
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
