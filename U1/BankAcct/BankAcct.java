public class BankAcct
{
   //Data - Instance Fields. Instance Fields need private.
   private double myBalance;
   
   //Defaul;t Constructor
   public BankAcct()
   {
       myBalance = 0;
   }
   
   //Assignment Constructor
   public BankAcct(double initialDoubleValueFromTomorrowErrToday)
   {
       myBalance = initialDoubleValueFromTomorrowErrToday;
   }
   //Methods() manipulate data. Methods need to be public.
   public void deposit(double amt){
       myBalance = myBalance + amt;
    }
    
   public void withdraw(double amt){
       myBalance = myBalance - amt;
    }
   
   public double getBalance(){
       return myBalance;
    }
}
