public class SavingsAcct extends BankAccount
{
   private double myRate;
   
   public SavingsAcct(double r)
   {
       myRate = r*0.01;
   }
   
   public void addInterest()
   {
        deposit(getBalance()*myRate);
    }
   
   public String toString()
     {
         return super.toString()+"[rate = " + myRate + "]";
     }
    
}
