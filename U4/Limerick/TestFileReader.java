import java.util.Scanner;
import java.io.*;

public class TestFileReader
{
    public static void main() throws IOException
    {
        readFromFile();
        writeToFile("Daniel Classon");
    }
    
    private static void readFromFile() throws FileNotFoundException
    {
        //Scanner in = new Scanner(System.in);
        //in.next() in.NextLine() Return Strings

        Scanner inF = new Scanner(new File("H:\\Comsci\\Java_Limerick.txt"));
        Scanner lineScan;
        String line, word;
        
        String[] file = new String[100];
        while(inF.hasNextLine())
        {
            line = inF.nextLine();
            lineScan = new Scanner(line);
            
            while(lineScan.hasNext())
            {
                int i = 0;
                
                word = lineScan.next();
                
                file[i] = word;
                System.out.print(word+" ");
            }
            System.out.println("");
        }
        
    }
    
    public static void writeToFile(String s) throws IOException
    {
        FileWriter writer = new FileWriter("H:\\Comsci\\lenses2.txt");
        PrintWriter outF = new PrintWriter(writer);
        
        outF.println(s);
        outF.close();
    }
}
