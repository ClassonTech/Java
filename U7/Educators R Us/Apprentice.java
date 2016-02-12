public class Apprentice extends Help implements Bonus
{
    private double sales;
    
    private static final double APR_BON = 0.05;
    
    public Apprentice(String n, String t, double d, int i, double d2)
    { 
        super(n,t,d,i);
        sales = d2;
    }
    
    public void computePay()
    {
        super.computePay();
        grossPay += calcBonus();
    }
    
    public double calcBonus()
    {
        return sales*APR_BON;
    }
    
    public String toString()
    {
        String str = "$";
        str += round(sales);
        return super.toString(str); 
    }
}
