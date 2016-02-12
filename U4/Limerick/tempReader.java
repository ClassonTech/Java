import java.util.Scanner;
import java.io.*;

public class tempReader
{
    public static void main( ) throws IOException, FileNotFoundException
    { 
        // Declarations
        // Reading
        // Writing
        
        String name = "";
        int[] avgHi = new int[12];
        int[] avgLow = new int[12];
        
        Scanner inF = new Scanner(new File("O:\\Students Extras\\_A_Java\\apCompSciData.txt"));
        Scanner lineScan;
        
        String line;
        String temp;
        
        String[] file = new String[100];
        while(inF.hasNextLine())
        {
            line = inF.nextLine();
            lineScan = new Scanner(line);
            
            name = line;
            avgHi = fillArray(inF);
            avgLow = fillArray(inF);

            while(lineScan.hasNext())
            {
                int i = 0;
                
                temp = lineScan.next();
                
                file[i] = temp;
            }
        }
        
        FileWriter writer = new FileWriter("H:\\Comsci\\temperatures.txt");
        PrintWriter outF = new PrintWriter(writer);
        
        outF.println(file);
        outF.close();
        
        while(inF.hasNextLine())
        {                                                           
                // First line has to be City, State
                    
                avgHi = fillArray(inF);
                avgLow = fillArray(inF);

                // Print info to output file
        }
    }
    
        private static int[ ] fillArray(Scanner inF)
    {
        int[]  arr = new int[12];
        
        String line = inF.nextLine();                  
        Scanner lineScan = new Scanner(line);
        
        int i = 0;
        while(lineScan.hasNext())
        {
             arr[i] = lineScan.nextInt();
             i++;
        }
        return arr;
    }


}
