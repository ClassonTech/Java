

public class EmployeeTester
{
    public static void main(String[] args)
    {
        Employee jon = new Employee("Jon",100000);        
        Employee jim = new Employee("Jim",jon.getSalary());
        
        System.out.println("His name is " + jon.getName() + " and he earns $" + jon.getSalary());
        System.out.println("His name is " + jim.getName() + " and he earns $" + jim.getSalary());
        
        jon.raiseSalary(3);
        jim.raiseSalary(-1.5);
        System.out.println(jon.getName() + " now earns $" + jon.getSalary());
        System.out.println(jim.getName() + " now earns $" + jim.getSalary());
    }
}
