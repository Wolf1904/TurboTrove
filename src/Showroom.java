import java.util.Scanner;

public class Showroom implements uitlity{
    String showroomName;
    String showroomAddress;
    String managerName;
    int totalEmployees;
    int totalCarsinStock=0;
    int managerPhone;

    @Override
    public void get_details(){
        System.out.println("Showroom Name: "+showroomName);
        System.out.println("Showroom Address: "+showroomAddress);
        System.out.println("Manager Name: "+managerName);
        System.out.println("Total Employees: "+totalEmployees);
        System.out.println("Total Cars in Stock: "+totalCarsinStock);
        System.out.println("Manager Phone: "+managerPhone);
    }

    @Override
    public void set_details(){
        Scanner sc=new Scanner(System.in);
        System.out.println("======================= *** ENTER SHOWROOM DETAILS *** =======================");
        System.out.println();
        System.out.print("SHOWROOM NAME: ");
        showroomName = sc.nextLine();
        System.out.print(("SHOWROOM ADDRESS: "));
        showroomAddress = sc.nextLine();
        System.out.print("MANAGER NAME: ");
        managerName = sc.nextLine();
        System.out.print("TOTAL NO OF EMPLOYEES: ");
        totalEmployees = sc.nextInt();
        System.out.print("TOTAL CARS IN STOCK: ");
        totalCarsinStock = sc.nextInt();
        System.out.print("MANAGER PHONE: ");
        managerPhone = sc.nextInt();
    }
}
