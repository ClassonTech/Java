import javax.swing.*;

public class Towers
{
    public static int moves = 0;
    
    public static final int pegA = 1;
    public static final int pegB = 2;
    public static final int pegC = 3;
    
    public static void header()
    {
        System.out.println("Daniel Classon");
        System.out.println("Towers of Hanoi");
        System.out.println("March 7, 2014\n");
    }
    //##########################################################MAIN
    public static void main()
    {
        header();
        
        int plates = Integer.parseInt(JOptionPane.showInputDialog("How many plates are we moving today?"));
        System.out.println("Moving " + plates +" plates.\n");
        
        move(plates, pegA, pegC, pegB);
    }
    //##########################################################HELPERS
    public static void move(int stack, int from, int to, int other)
    {
        if (stack == 1)
        {
            print(from + " -> " + to);
        } 
        else
        {
            move(stack - 1, from, other, to);
            move(1, from, to, other);
            move(stack - 1, other, to, from);
        }
    }
    
    public static void print(String str)
    {
        moves++;
        System.out.println(moves + ". " + str);
    }
}
