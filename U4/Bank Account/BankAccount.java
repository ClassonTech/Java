public class BankAccount 
{  
   private double balance;
   
   /**private final int MAX_TRANS = 10;

   private double balance;
   private double[] transactions;
   private int numTrans;	

   public BankAccount()
   {   
      balance = 0;
      transactions = new double[MAX_TRANS];
      numTrans = 0;
   )*/
    
   public BankAccount()
   {   
      balance = 0;
   }

   public BankAccount(double initialBalance)
   {   
      balance = initialBalance;
   }

   public void deposit(double amount)
   {  
      double newBalance = balance + amount;
      balance = newBalance;
   }

   public void withdraw(double amount)
   {   
      double newBalance = balance - amount;
      balance = newBalance;
   }

   public double getBalance()
   {   
      return balance;
   }

}
