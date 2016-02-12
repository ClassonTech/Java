import javax.swing.JOptionPane;
public class P30
{

    public static void main()
    {
        //1.1
        System.out.println("+------+");
        System.out.println("|Daniel|");
        System.out.println("+------+\n");
        
        //1.2
        System.out.println(" $$$$");
        System.out.println(" |oo|");
        System.out.println("C|<>|D");
        System.out.println(" | *|");
        System.out.println(" ----\n");
        
        //1.3
        System.out.println("+---+---+---+");
        System.out.println("|   |   |   |");
        System.out.println("+---+---+---+");
        System.out.println("|   |   |   |");
        System.out.println("+---+---+---+");
        System.out.println("|   |   |   |");
        System.out.println("+---+---+---+\n");
        
        //1.4
        System.out.println("            +---+");
        System.out.println("            |   |");
        System.out.println("        +---+---+");
        System.out.println("        |   |   |");
        System.out.println("    +---+---+---+");
        System.out.println("    |   |   |   |");
        System.out.println("+---+---+---+---+");
        System.out.println("|   |   |   |   |");
        System.out.println("+---+---+---+---+\n");
        
        //1.5
        System.out.print("1+2+3+4+5+6+7+8+9+10 is ");
        System.out.println(1+2+3+4+5+6+7+8+9+10);
        System.out.println();
 
        
        //1.6
        System.out.print("1/1.0+1/2.0+1/3.0+1/4.0+1/5.0+1/6.0+1/7.0+1/8.0+1/9.0+1/10.0 is ");
        System.out.println(1/1.0+1/2.0+1/3.0+1/4.0+1/5.0+1/6.0+1/7.0+1/8.0+1/9.0+1/10.0);
        System.out.println();
    
        
        //1.7
       
        
        JOptionPane.showMessageDialog(null, "Hello, Daniel!");
        System.out.println();
        //System.exit(0);
        
        //1.8
        String name = JOptionPane.showInputDialog("What is your name?");
        System.out.println("Hello, " + name + "!");
        //System.exit(0);
        
        //Project 1.1
        String request = JOptionPane.showInputDialog("What would you like me to do?");
        JOptionPane.showMessageDialog(null,"I'm sorry, " + name + ". I'm afraid I can't " + "\"" + request + "\".");
        System.exit(0);
        
    }

   
}