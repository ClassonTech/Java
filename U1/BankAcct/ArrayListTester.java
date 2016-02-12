import java.util.ArrayList; 
import java.util.Random;
import java.util.Scanner;

public class ArrayListTester
{
    public static void main( )
    {
        Random randNum = new Random();
        //Create an ArrayList of BankAcounts
        ArrayList<BankAcct> accts = new ArrayList<BankAcct>();
        for ( int x = 0 ; x < 10 ; x++)
        {
            //Create 10 new Bankaccounts with random balances(0..1000)  in an ArrayList
            accts.add(new BankAcct(1+randNum.nextInt(1000)));
            
            
            //1. Print the ArrayList 
            //2. Remove any account with a 'balance < 300' & print new list. 
            //3. Replace any account 'balance > 700' with new random balance & print
        }
        printList("Original List: ",accts);
        
        removeL300(accts);
        printList("\nRemove <300: ",accts);
        
        replaceG700(accts);
        printList("\nReplace >700: ",accts);
    }
    
    public static void printList( String s, ArrayList<BankAcct> accts)
    {   
        System.out.println(s);
        //Print out the arrayList
        for(BankAcct a:accts)
        {
            System.out.println(a.getBalance() + " ");
        }
        //Pause
    }
    
    public static void removeL300(ArrayList<BankAcct> accts)
    {
        for(int x=0; x < accts.size(); x++)
        {
            if((accts.get(x)).getBalance()<300)
            {
                accts.remove(x);
                x--; //If removed
            }
        }
    }
    
    public static void replaceG700(ArrayList<BankAcct> accts)
    {
        Random randNum = new Random();
        
        for(int x=0; x < accts.size(); x++)
        {
            if((accts.get(x)).getBalance()>700)
            {
                accts.set(x,new BankAcct(1+randNum.nextInt(1000)));
            }
        }
    }
    //Enhanced for loop print
}       
