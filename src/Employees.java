import java.util.Scanner;
import java.util.UUID;

public class Employees extends Showroom implements uitlity{
    String empId;
    String empName;
    int empAge;
    String empDepartment;


    @Override
    public void get_details() {
        System.out.println("ID: "+empId);
        System.out.println("Name: "+empName);
        System.out.println("Age: "+empAge);
        System.out.println("Department: "+empDepartment);
        System.out.println("Showroom Name: "+showroomName);

    }
    @Override
    public void set_details(){
        Scanner sc = new Scanner(System.in);
        UUID uuid = UUID.randomUUID();
        empId = String.valueOf(uuid);
        System.out.println("======================= *** ENTER EMPLOYEE DETAILS *** =======================");
        System.out.println();
        System.out.print("EMPLOYEE NAME: ");
        empName = sc.nextLine();
        System.out.print(("EMPLOYEE AGE: "));
        empAge = sc.nextInt();
        sc.nextLine();
        System.out.print("EMPLOYEE DEPARTMENT: ");
        empDepartment = sc.nextLine();
        System.out.print("SHOWROOM NAME: ");
        showroomName = sc.nextLine();
    }
}
