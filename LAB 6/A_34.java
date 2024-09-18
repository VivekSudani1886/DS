import java.util.Scanner;

class Employee_Detail{

    int Employee_ID;
    String Name;
    String Designation;
    int Salary;
}

public class A_34 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Employee_Detail ed = new Employee_Detail();

        System.out.print("Enter Employee Id : ");
        ed.Employee_ID = sc.nextInt();

        System.out.print("Enter Employee Name : ");
        ed.Name = sc.next();

        System.out.print("Enter Employee Designation : ");
        ed.Designation = sc.next();

        System.out.print("Enter Employee Salary : ");
        ed.Salary = sc.nextInt();

        System.out.println("Employee Id : "+ed.Employee_ID);
        System.out.println("Employee Name : "+ed.Name);
        System.out.println("Employee Designation : "+ed.Designation);
        System.out.println("Employee Salary : "+ed.Salary);
    }
}