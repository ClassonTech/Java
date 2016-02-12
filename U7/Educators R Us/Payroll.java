import java.util.*;
import java.io.*;

public class Payroll
{
    public static void main() throws IOException, FileNotFoundException
    {
        ArrayList<Employee>myEmps = new ArrayList<Employee>();
        
        String address = "H:\\_JAVA_Classon_Daniel\\EdRUs.txt";
        //String address = "/Users/linclasson/Desktop/EdRUs.txt";
        
        inputFile(address, myEmps);
        
        header();
        System.out.println("EMPLOYEE\t"+"TITLE\t"+"DEPARTMENTS\t\t"+"HOURS\t"+"PAY\t\t"+"SALES\t\t"+"GROSS\t\t"+"TAX\t"+"NET\t");
        toStringer(myEmps); 
    }
    
    //##########################################################HELPERS
    public static void inputFile(String s, ArrayList arr) throws IOException, FileNotFoundException          
    {
        Scanner inF = new Scanner(new File(s));
            
        while(inF.hasNextLine())
        {
            String name = inF.nextLine();  
            String type = inF.nextLine();

            if(type.equals("mgr"))
            {
                String line = inF.nextLine();
                Scanner scan = new Scanner(line);
               
                Employee e = new Manager(name, type,scan.nextDouble(),inF.nextLine());
                arr.add(e);
            }
            else if(type.equals("help"))
            {
                String line = inF.nextLine();
                Scanner scan = new Scanner(line);
  
                line = inF.nextLine();
                Scanner scan2 = new Scanner(line);
                
                Employee e = new Help(name,type, scan.nextDouble(), scan2.nextInt());
                arr.add(e);
            }
            else if(type.equals("apr"))
            {
                String line = inF.nextLine();
                Scanner scan = new Scanner(line);
                
                line = inF.nextLine();
                Scanner scan2 = new Scanner(line);
                
                line = inF.nextLine();
                Scanner scan3 = new Scanner(line);
                
                Employee e = new Apprentice(name,type, scan.nextDouble(),scan2.nextInt(),scan3.nextDouble());
                arr.add(e);
            }
        }
    }
    
    public static void toStringer(ArrayList<Employee> arr)
    {
        for(Employee e: arr)
        {
            e.computePay();
            e.computeTax();
            System.out.println(e.toString());
        }
    }
    
    public static void header()
    {
        System.out.println("Daniel Classon");
        System.out.println("Educators R' Us");
        System.out.println("February 18, 2014\n");
    }
}