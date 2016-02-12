import javax.swing.JOptionPane;
public class BankAcctTester
{
    public static void main(){
        BankAcct acct = new BankAcct();
    
        acct.deposit(10000);
        acct.deposit(1000);
        
        
        acct.withdraw(1999);
        BankAcct acct2 = new BankAcct(200);
    
        acct2.deposit(10000);
        acct2.withdraw(1999);
        
       System.out.println("Your best friend currently havs " +acct.getBalance()+" dollars in his account.");
       System.out.println("You currently have " +acct2.getBalance()+" dollars in your account. I'm so sorry.");
       
    
    
    
    }     
        
  
}
