public class Help extends Employee
{
    protected double hourlyPay;
    protected int hoursWorked;
    
    private static final double OT = 40;
    private static final double OT_BON = 1.5;
    
    public Help(String n, String t, double d, int i)
    {
        super(n,t);
        hourlyPay = d;
        hoursWorked = i;
    }
    
    public void computePay()
    {
        double temp = 0;
        
        if (hoursWorked>OT)
        {
            temp = hourlyPay*OT;
            temp += (hoursWorked-OT)*hourlyPay*OT_BON;
        }
        else if (hoursWorked <= OT)
        {
            temp = hoursWorked*hourlyPay;
        }
        grossPay = temp;
    }
    
    public String toString(String s)
    {
        String sales = s;
        return super.toString() + "\t\t\t" +hoursWorked + "hrs\t$" +round(hourlyPay) + "/hr \t"+sales+"\t$"+round(grossPay)+"  \t$"+round(tax)+"\t$"+round(netPay);
    }
    
    public String toString()
    {
        String s = "-----    ";
        return toString(s);
    }
}
