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
            accts.add(x, new BankAcct(randNum.nextInt(1001)));
            
            printList(x,accts);
            //1. Print the ArrayList 
            //2. Remove any account with a 'balance < 300' & print new list. 
            //3. Replace any account 'balance > 700' with new random balance & print
        }
    }
    public static void printList( String s, ArrayList<BankAcct> accts)
    {   
        System.out.println(s);
        //Print out the arrayList
        
        //Pause
    }
    //Enhanced for loop print
}       
