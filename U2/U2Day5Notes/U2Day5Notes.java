import javax.swing.JOptionPane;
import java.text.NumberFormat;

public class U2Day5Notes
{
    public static final double TAX_RATE = 9.5;     		//Q: Day5Notes.TAX_RATE  has scope where?

    public static void main()
    {
        oneConstantsEx();
        twoStringEx();
        double amt = threeGUI_Input();
        fourOutputFormatter(amt);
    }
    
    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ ONE
    public static void oneConstantsEx()
    {
        final double TWO_DIGITS_PI = 3.14;
        double r = 5;
        
        System.out.println("Ex1:\tConstants");
        System.out.println("Area with radius = " +r +" is " +(Math.PI * Math.pow(r, 2)));
        System.out.println("Area with radius = " +r +" is " +(TWO_DIGITS_PI * Math.pow(r, 2)));
    }
    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ TWO
    public static void twoStringEx()
    {
        String team = "Twins";
        
        String outcome = team.substring(1,4);
        outcome = team +" " +outcome;
        
        System.out.println("\nEx2:\tStrings");
        System.out.println(outcome);
        System.out.println(outcome+1);
        System.out.println(outcome +(1+1));
    }
    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ THREE
     public static double threeGUI_Input()
    {
        //String item = "TootBrush";
        String item = JOptionPane.showInputDialog("Item Purchased?");
        String sPrice = JOptionPane.showInputDialog(item + " price?");
        
        //double price = 4.37;
        //int num = Integer.parseInt(sNum);
        double price = Double.parseDouble(sPrice);
        double tax = price * TAX_RATE / 100;
        
        System.out.println("\nEx3:\tGUI Input");
        System.out.println("\tItem:\t\t" +item);
        System.out.println("\tPrice:\t\t$" +price);
        System.out.println("\tTax(" +TAX_RATE +"%):\t$" +tax);
        
        return tax;
        System.exit(0);
    }
    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ FOUR
    public static void fourOutputFormatter(double tax)
    {
        NumberFormat formatter = NumberFormat.getNumberInstance();
        formatter.setMinimumFractionDigits(2);
        formatter.setMaximumFractionDigits(2);
        
        System.out.println("\nEx4:\tFormatting Decimals");
        System.out.println("\tTax Formatted:\t$"+formatter.format(tax));       
    }
}
