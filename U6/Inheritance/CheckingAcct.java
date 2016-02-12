public class CheckingAcct extends BankAccount
{
     private int myNumCks;
     private int myTransactions;
     
     public CheckingAcct()
     {
         myNumCks = 0;
         myTransactions = 0;
     }
     
     public void writeCheck(double amt)
     {
         if(validateFunds(amt))
         {
            withdraw(amt);
            myNumCks++;
         }
         //myTransactions++;
     } 
        
     public void deductFees()
     {
         for(int i = 1; i <= myNumCks; i++)
         {
             if(i%10 == 0)
                withdraw(.25);
         }
     }
     
     public boolean validateFunds(double amt)
     {
         if(amt<=getBalance())
         {
             if(getBalance()<100)//getBalance() - amt
             {
                System.out.println("less than 100");
                withdraw(5);
             }
             return true;
         }
         return false;
     }
}
