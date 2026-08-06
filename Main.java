import java.util.Scanner;
public class Main 
{
    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);
        Payroll payroll=new Payroll();

        while(true) 
        {

            System.out.println("\n===== Employee Payroll System =====");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Exit");
            System.out.print("Enter Choice: ");
            int choice=sc.nextInt();

            switch(choice) 
            {

                case 1:
                    System.out.print("Enter Employee ID: ");
                    int id=sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Employee Name: ");
                    String name=sc.nextLine();

                    System.out.print("Enter Basic Salary: ");
                    double salary=sc.nextDouble();

                    payroll.addEmployee(new Employee(id,name,salary));
                    break;

                case 2:
                    try
                    {
                        payroll.displayEmployees();
                    } 
                    catch(EmployeeNotFoundException e)
                    {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 3:
                    System.out.println("Thank You!");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}