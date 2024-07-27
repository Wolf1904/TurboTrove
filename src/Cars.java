import java.util.Scanner;

public class Cars extends Showroom implements uitlity{
    String carName;
    String carColor;
    String carFueltype;
    int carPrice;
    String carType;
    String carTransmission;
    int modelYear;

    @Override
    public void get_details() {
        System.out.println("NAME: "+carName);
        System.out.println("COLOR: "+carColor);
        System.out.println("FUEL TYPE: "+carFueltype);
        System.out.println("PRICE: "+carPrice);
        System.out.println("TYPE: "+carType);
        System.out.println("TRANSMISSION: "+carTransmission);
        System.out.println("MODEL YEAR: "+modelYear);
    }
    
    @Override
    public void set_details() {
        Scanner sc = new Scanner(System.in);
        System.out.println("======================= *** ENTER CAR DETAILS *** =======================");
        System.out.println();
        System.out.print("CAR NAME: ");
        carName = sc.nextLine();
        System.out.print(("CAR COLOR: "));
        carColor = sc.nextLine();
        System.out.print("CAR FUEL TYPE(PETROL/DIESEL/CNG/ELECTRIC): ");
        carFueltype = sc.nextLine();
        System.out.print("CAR PRICE: ");
        carPrice = sc.nextInt();
        sc.nextLine();
        System.out.print("CAR TYPE(SEDAN/SUV/HATCHBACK): ");
        carType = sc.nextLine();
        System.out.print("TRANSMISSION TYPE(AUTOMATIC/MANUAL): ");
        carTransmission = sc.nextLine();
        System.out.print("MODEL YEAR: ");
        modelYear = sc.nextInt();
        totalCarsinStock++;
    }

}


