public class Manager extends Employee implements Bonus
{
    private double salary;
    private String department;

    private static final double MGR_BON = .01;
    
    public Manager(String n,String t,Double d,String x)
    {
        super(n,t);
        salary = d;
        department = x;
    }
    
    public void computePay()
    {
        grossPay = salary/ANNUAL + calcBonus();
    }
    
    public String toString()
    {
        return super.toString() + department + "\t-----\t$"+round(salary) +"\t-----    \t$" + round(grossPay) +"  \t$"+ round(tax) +"\t$"+ round(netPay);
    }
    
    public double calcBonus()
    {
        return (salary/ANNUAL)*MGR_BON;
    }
}
