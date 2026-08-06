import java.util.HashMap;
public class Payroll
{

    private HashMap<Integer,Employee> employees=new HashMap<>();

    public void addEmployee(Employee emp) 
    {
        employees.put(emp.getId(),emp);
        System.out.println("Employee Added Successfully.");
    }

    public void displayEmployees() throws EmployeeNotFoundException
    {

        if(employees.isEmpty())
        {
            throw new EmployeeNotFoundException("No Employee Found!");
        }

        for(Employee emp:employees.values())
        {
            emp.display();
            System.out.println("-----------------------");
        }
    }
}