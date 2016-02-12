import java.util.Scanner;
import java.io.*;

public class tempReader2
{
    public static void main( ) throws IOException, FileNotFoundException
    { 
        // Declarations
        // Reading
        // Writing
        Scanner inF = new Scanner(new File("O:\\Students Extras\\_A_Java\\apCompSciData.txt"));
        Scanner lineScan;
        
        int[] avgHi = new int[12];
        int[] avgLow = new int[12];
        String name;
        
        String file = "";
        while(inF.hasNextLine())
        {                                                           
            //while(lineScan.hasNext())
            //{
            //    name += lineScan.next();
            //    name += " ";
            //}
            
                avgHi = fillArray(inF);
                avgLow = fillArray(inF);
                int i = 0;
            //    while (i<arr.length)
            //    {
            //    file += avgHi[i];
            //    file += "\n";
            //    file += avgLow[i];
                // Print info to output file
            //}
        }
        FileWriter writer = new FileWriter("H:\\Comsci\\temperatures.txt");
        PrintWriter outF = new PrintWriter(writer);
        
        outF.println(file);
        outF.close();
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

