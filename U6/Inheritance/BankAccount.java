public class BankAccount
{  
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

     public void transferBankAcct(BankAccount acct, double amt)
     {
         if(acct.getBalance() > amt)
         {
            acct.withdraw(amt);
            deposit(amt);
         }

     }
     
     public String toString()
     {
         return getClass().getName() + "[Balance: " + balance + "]";
     }
     private double balance;
}
