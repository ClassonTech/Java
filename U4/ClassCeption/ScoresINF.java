import java.util.Scanner;
import java.io.*;

public class ScoresINF 
{
    private int[ ] myScores;                //Actual array holding scores
    private int mySize;             //Logical size of the array
    private static final int MAXSIZE = 10;

    //-------------------------------------------------------------------------------------------------------------------------------------------------
    public ScoresINF( )
    {
        myScores = new int[MAXSIZE];
        mySize = 0;
    }
    //-------------------------------------------------------------------------------------------------------------------------------------------------
    public void getScores(String line) throws IOException, FileNotFoundException 
    {
        //pre-condition:    myScores instantiated and ready to be filled.
        //post-condition:   mySize scores have been read in to myScores. 0 < mySize <= MAXSIZE          
        int i = 0;
        int temp = 0;
        Scanner lineScan = new Scanner(line);
        while(lineScan.hasNext())
            {
                 temp = lineScan.nextInt();
                 myScores[i] = temp;
                 i++;
                 mySize++;
            }
        
    }
    //-------------------------------------------------------------------------------------------------------------------------------------------------
    public int findAverage( )       
    {
        //pre-condition:    myScores has at least 1 score.
        //post-condition:   Return average of mySize scores as a whole number.  
        int sum = 0;

        for(int value:myScores)
        {
            sum += value;
        }
        return (int)Math.round(sum/mySize);
    }
    /*
    public String toString3( )   //Every class can override ‘toString()’ from base Object class to display itself.    
    {
        //pre-condition:    myScores has at least 1 score.
        //post-condition:   Return myScores as a String using String concatenation. 
        String concatenation = "";
        
        for(int value: myScores)
        {
            concatenation += value;
            concatenation += " ";
        }

        return concatenation;
    }
    */
}
