import java.util.*;

interface uitlity{
    public void get_details();
    public void set_details();
}

public class Main {
    
    static void mainMenu(){
        System.out.println();
        System.out.println("======================= *** WELCOME TO TURBOTROVE *** =======================");
        System.out.println();
        System.out.println("============ *** Your Management System for a Car Dealership *** ============");
        System.out.println();
        System.out.println("=============================== *** ENTER YOUR CHOICE *** ===============================");
        System.out.println();
        System.out.println("[1].ADD SHOWROOMS");
        System.out.println("[2].ADD EMPLOYEES");
        System.out.println("[3].ADD CARS");
        System.out.println("[4].GET SHOWROOMS");
        System.out.println("[5].GET EMPLOYEES");
        System.out.println("[6].GET CARS");
        System.out.println();
        System.out.println("=============================== *** ENTER 0 TO EXIT *** ===============================");
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        Showroom showroom[] = new Showroom[5];
        Employees employee[] = new Employees[5];
        Cars car[] = new Cars[5];
        int carCounter = 0;
        int showroomCounter = 0;
        int employeesCounter = 0;
        int choice = 100;
        while(choice!=0){

            mainMenu();
            choice = sc.nextInt();

            while(choice!=9 && choice!=0){
                switch (choice) {
                    case 1:
                        showroom[showroomCounter] = new Showroom();
                        showroom[showroomCounter].set_details();
                        showroomCounter++;
                        System.out.println();
                        System.out.println("[1].ADD NEW SHOWROOM");
                        System.out.println("[9].GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;
                    case 2:
                        employee[employeesCounter] = new Employees();
                        employee[employeesCounter].set_details();
                        employeesCounter++;
                        System.out.println();
                        System.out.println("[2].ADD NEW EMPLOYEE");
                        System.out.println("[9].GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;
                    case 3:
                        car[carCounter] = new Cars();
                        car[carCounter].set_details();
                        carCounter++;
                        System.out.println();
                        System.out.println("[3].ADD NEW CAR");
                        System.out.println("[9].GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;
                    case 4:
                        for (int i = 0; i < showroomCounter; i++) {
                            showroom[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("[9].GO BACK TO MAIN MENU");
                        System.out.println("[0].EXIT");
                        choice = sc.nextInt();
                        break;
                    case 5:
                        for (int i = 0; i < employeesCounter; i++) {
                            employee[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("[9].GO BACK TO MAIN MENU");
                        System.out.println("[0].EXIT");
                        choice = sc.nextInt();
                        break;
                    case 6:
                        for (int i = 0; i < carCounter; i++) {
                            car[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("[9].GO BACK TO MAIN MENU");
                        System.out.println("[0].EXIT");
                        choice = sc.nextInt();
                        break;
                    default:
                        System.out.println("ENTER VALID CHOICE: ");
                        break;
                }
            }
        }
    }
}
