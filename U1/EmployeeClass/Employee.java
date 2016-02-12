public class Employee
{
    //Data
    private String name;
    private double salary;
    
    //Counstructors
    public Employee()
    {
        name = "Default";
        salary = 0;
    }
    
    public Employee(String hisName, double hisPay)
    {
        name = hisName;
        salary = hisPay;
    }
    
    //Methods
    public String getName()
    {
        return name;      
    }
    
     public double getSalary()
    {
        return salary;     
    }
    
    public void raiseSalary(double byPercentage)
    {
        salary = salary + salary*byPercentage/100;
    }
}
