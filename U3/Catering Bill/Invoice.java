import javax.swing.*;
import java.text.NumberFormat;

public class Invoice
{
    private static final double CHICKEN = 15.75;
    private static final double STEAK = 19.95;
    private static final double CH_DISCOUNT = 0.60;
    
    private static final double RMAMIN = 10;
    private static final double RMAMAX = 25;
    private static final double RMBMIN = 26;
    private static final double RMBMAX = 40;
    private static final double RMCMIN = 41;
    private static final double RMCMAX = 60;
    private static final double RMDMIN = 61;
    private static final double RMDMAX = 100;
    private static final double RMEMIN = 101;
    private static final double RMEMAX = 0;
    
    private static final double RMA = 55;
    private static final double RMB = 75;
    private static final double RMC = 85;
    private static final double RMD = 100;
    private static final double RME = 130;
    
    private static final double GOLDAMIN = 100;
    private static final double GOLDBMIN = 250;
    private static final double GOLDCMIN = 400;
    private static final double GOLDDMIN = 800;
    private static final double GOLDEMIN = 800;
    
    private static final double GOLDA = 0.5;
    private static final double GOLDB = 1.5;
    private static final double GOLDC = 3.0;
    private static final double GOLDD = 4.0;
    private static final double GOLDE = 5.0;
    
    private static final double TIP = 18;
    private static final double TAX = 3.5;
       
    private int adults;
    private int children;
    
    private String entree;
    private String roomName;
    private String goldQuery;
    
    private boolean validParty;
    private boolean gcm;
    
    private double entreePrice;
    private double roomFee;
    private double goldDisc;
    private double tax;
    private double tip;
    private double deposit;
    private double tempTotal;
    private double subtotal;
    
    //Constructors
    public Invoice()
    {
        adults = 0;
        children = 0;
        
        entree = "";
        roomName = "";
        goldQuery = "";
        
        validParty = true;
        gcm = false;
        
        entreePrice = 0.0;
        roomFee = 0.0;
        goldDisc = 0.0;
        tax = 0.0;
        tip = 0.0;
        deposit = 0.0;
        tempTotal = 0.0;
        subtotal = 0.0;
    }
    
    //Methods
    public void queryParty()
    {
        adults = Integer.parseInt(JOptionPane.showInputDialog("How many adults will be served tonight?"));
        children = Integer.parseInt(JOptionPane.showInputDialog("How many kids menus will you need?"));
        entree = JOptionPane.showInputDialog("Would you like to eat *chicken* or *steak*?");
        goldQuery = JOptionPane.showInputDialog("Are you a part of our Gold Club Membership Rewards program? \n(If not, we will be happy to accomadate you. All we need is your email, social security number, teleph...)");
        deposit = Double.parseDouble(JOptionPane.showInputDialog("How much would you like to deposit?"));
    }
    
    public void entreePrice()
    {
        if (entree.equalsIgnoreCase("chicken"))
            entreePrice = CHICKEN;
        else if (entree.equalsIgnoreCase("steak"))
            entreePrice = STEAK;
        else 
            validParty = false;
    }
    
    public void whichRoom()
    {
        if (adults+children<10)
            validParty = false;
        else if (adults+children>=RMAMIN&&adults+children<=RMAMAX){
            roomFee = RMA;
            roomName = "A";
        }
        else if (adults+children>=RMBMIN&&adults+children<=RMBMAX){
            roomFee = RMB;
            roomName = "B";
        }
        else if (adults+children>=RMCMIN&&adults+children<=RMCMAX){
            roomFee = RMC;
            roomName = "C";
        }
        else if (adults+children>=RMDMIN&&adults+children<=RMDMAX){
            roomFee = RMD;
            roomName = "D";
        }
        else if(adults+children>=RMEMIN){
            roomFee = RME;   
            roomName = "E";
        }
    }
    
    public void isGold()
    {
        if (goldQuery.equalsIgnoreCase("yes"))
        gcm = true;
        if (goldQuery.equalsIgnoreCase("y"))
        gcm = true;
        if (goldQuery.equalsIgnoreCase("no"))
        gcm = false;
        if (goldQuery.equalsIgnoreCase("n"))
        gcm = false;
    }
    
    public void goldDisc()
    {
        if (gcm == false)
        goldDisc = 0;
        if (gcm == true)
        {
            if (subtotal<GOLDAMIN)
            goldDisc = GOLDA;
            if (subtotal<GOLDBMIN)
            goldDisc = GOLDB;
            if (subtotal<GOLDCMIN)
            goldDisc = GOLDC;
            if (subtotal<GOLDDMIN)
            goldDisc = GOLDD;
            if (subtotal>=GOLDEMIN)
            goldDisc = GOLDE;
        }
    }
    
    public void getTax()
    {
        tax = subtotal*TAX/100;
    }
    
    public void getTip()
    {
        tip = subtotal*TIP/100;
    }
    
    //Total methods
    public void getInvoice()
    {
        NumberFormat formatter = NumberFormat.getNumberInstance( );
        formatter.setMinimumFractionDigits(2);  
        formatter.setMaximumFractionDigits(2);
        
        queryParty();
        
        if (validParty == false)
        {
           System.out.println("I'm sorry, but you are ineligible for a meal. Check your information.");
           System.out.println("You ARE, however, eligible AS a meal.");
           System.out.println("Activate T-1000");
        }
        else 
        {
            System.out.println("\t\t\t\t\t\t\t\tBill");
            
            //1.
            entreePrice();
            
            tempTotal = adults*entreePrice;
            subtotal += adults*entreePrice;
            
            
            if (entree.equalsIgnoreCase("steak"))
            entree +="\t";
            System.out.println("1. Adults #: \t\t" + adults);
            System.out.println("\tEntrees: \t"+entree+" at $"+entreePrice+" each. \t\t+$" + formatter.format(tempTotal)+"\n");
            
            //2.
            tempTotal = children*entreePrice*CH_DISCOUNT;
            subtotal += children*entreePrice*CH_DISCOUNT;
            
            System.out.println("2. Children #: \t\t" + children);
            if (children!=0)
            System.out.println("\tKids' Meal: \t"+entree+" at %"+100*CH_DISCOUNT+" of "+entreePrice+" each. \t+$" + formatter.format(tempTotal)+"\n");
            else
            System.out.println("\tKids' Meal: \tno kids.\t\t\t\t+$" + formatter.format(tempTotal)+"\n");
            
            //3.
            whichRoom();
            
            tempTotal = roomFee;
            subtotal += roomFee;
            
            System.out.println("3. Room "+roomName+" fee: \t\t$"+roomFee+"\t\t\t\t\t+$" + formatter.format(tempTotal)+"\n");
            
            //4.
            isGold();
            goldDisc();
            
            tempTotal = subtotal*goldDisc/100;
            subtotal -= subtotal*goldDisc/100;
            
            System.out.println("4. Gold Club("+gcm+"): \t"+goldDisc+"% Discount\t\t\t\t-$" + formatter.format(tempTotal)+"\n");
            
            //Subtotal
            System.out.println("SUBTOTAL: \t\t\t\t\t\t\t=$" + formatter.format(subtotal)+"\n");
            
            //5. and 6.
            getTax();
            getTip();
            
            tempTotal = tax;
            subtotal += tax;
            
            System.out.println("5. Tax at \t\t%"+TAX+"\t\t\t\t\t+$"+formatter.format(tempTotal)+"\n");
            
            tempTotal = tip;
            subtotal += tip;
            
            System.out.println("6. Tip at \t\t%"+TIP+"\t\t\t\t\t+$"+formatter.format(tempTotal)+"\n");
            
            //7.
            tempTotal = deposit;
            subtotal -= deposit;
            
            System.out.println("7. Deposit of \t\t$"+formatter.format(deposit)+"\t\t\t\t\t-$"+formatter.format(tempTotal)+"\n");
            
            //TOTAL
            System.out.println("BILL: \t\t\t\t\t\t\t\t=$"+formatter.format(subtotal));
            
        }
    }
}
