import java.text.NumberFormat;
import java.lang.*;

public abstract class Employee
{
    protected String name;
    protected String type;
    
    protected double grossPay;
    protected double netPay;
    protected double tax;
    
    protected static final int ANNUAL = 24;
    private static final double TAX_RATE = 28;
    
    public Employee()
    {
    }
    
    public Employee(String n,String t)
    {
        name = n;
        type = t;
    }
    
    public abstract void computePay();
    
    public void computeTax()
    {
        tax = grossPay * TAX_RATE/100;
        netPay = grossPay - tax;
    }
    
    public String round(double d)
    {
        NumberFormat formatter = NumberFormat.getNumberInstance( ); 
        formatter.setMinimumFractionDigits(2);
        formatter.setMaximumFractionDigits(2);
        
        return formatter.format(d);
    }
    
    public String toString()
    {
        return name + "\t" + type + "\t";
    }
}
