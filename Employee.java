public class Employee
{
    private int id;
    private String name;
    private double basicSalary;
    public Employee(int id,String name,double basicSalary)
    {
        this.id=id;
        this.name=name;
        this.basicSalary=basicSalary;
    }
    public int getId()
    {
        return id;
    }
    public void display()
    {
        double hra=basicSalary*0.20;
        double da=basicSalary*0.10;
        double grossSalary=basicSalary+hra+da;
        System.out.println("\nEmployee ID: "+id);
        System.out.println("Name: "+name);
        System.out.println("Basic Salary: "+basicSalary);
        System.out.println("Gross Salary: "+grossSalary);
    }
}