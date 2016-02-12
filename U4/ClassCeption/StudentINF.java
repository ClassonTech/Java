import java.util.Scanner;
import java.io.*;

public class StudentINF
{
    private String myName;
    
    private ScoresINF myTests;
    private ScoresINF myProgs;
    private ScoresINF myHk;
    private int myAve;
    
    private double testAve;
    private double progAve;
    private double hkAve;
    
    private String myGrade;
    
    private static final int possPtsTests = 100;
    private static final int possPtsProgs = 25;
    private static final int possPtsHk = 10;
    
    private static final double TEST_WT = .5;
    private static final double PROG_WT = .4;
    private static final double HK_WT = .1;
    
    //Grade Distribution
    private static final int APL = 99;
    private static final int A = 94;
    private static final int AMN = 90;
    private static final int BPL = 88;
    private static final int B = 84;
    private static final int BMN = 80;
    private static final int CPL = 78;
    private static final int C = 74;
    private static final int CMN = 70;
    private static final int DPL = 68;
    private static final int D = 64;
    private static final int DMN = 60;
    private static final int F = 59;
    
    private static final String S_APL = "A+";
    private static final String S_A = "A";
    private static final String S_AMN = "A-";
    private static final String S_BPL = "B+";
    private static final String S_B = "B";
    private static final String S_BMN = "B-";
    private static final String S_CPL = "C+";
    private static final String S_C = "C";
    private static final String S_CMN = "C-";
    private static final String S_DPL = "D+";
    private static final String S_D = "D";
    private static final String S_DMN = "D-";
    private static final String S_F = "F";
    
    //------------------------------------------------------------------------------
    public StudentINF( )
    {
        myName =  "";
        myTests= new ScoresINF();
        myProgs= new ScoresINF();
        myHk= new ScoresINF();
        
        myAve = 0;
        testAve = 0;
        progAve = 0;
        hkAve = 0;
        
        myGrade = "";
    }
    //------------------------------------------------------------------------------
    public void inputInfo(Scanner inF) throws IOException, FileNotFoundException   
    {
        //pre-condition:    Instance fields are empty.
        String line = inF.nextLine();     
        myName = line;
        
        line = inF.nextLine();
        myTests.getScores(line);
        
        line = inF.nextLine();
        myProgs.getScores(line);
        
        line = inF.nextLine();
        myHk.getScores(line);
        
        //post-condition:   myName, myTests, myProgs, and myHk will have values.
    }
    //------------------------------------------------------------------------------
    public void computeAve( )       
    {
        //pre-condition:    myTests, myProgs, and myHk will have been instantiated, and should contain scores.
        
        testAve = myTests.findAverage()/(double)possPtsTests*100;
        progAve = myProgs.findAverage()/(double)possPtsProgs*100;
        hkAve = myHk.findAverage()/(double)possPtsHk*100;
        
        myAve = (int)Math.round(testAve * TEST_WT + progAve * PROG_WT + hkAve * HK_WT);
        
        //post-condition:   myAve = 50% of the Test ave, 40% of the Prog ave, and 10% of the Hk ave.
    }
    //------------------------------------------------------------------------------
    public int getAve( )
    {
        return myAve;
    }
    //------------------------------------------------------------------------------
    public void computeGrade( )     
    {
        //pre-condition:    myAve has been established.
        if (myAve>=APL)
            myGrade = S_APL;
        else if (myAve>=A)
            myGrade = S_A;
        else if (myAve>=AMN)
            myGrade = S_AMN;
        else if (myAve>=BPL)
            myGrade = S_BPL;
        else if (myAve>=B)
            myGrade = S_B;
        else if (myAve>=BMN)
            myGrade = S_BMN;
        else if (myAve>=CPL)
            myGrade = S_CPL;
        else if (myAve>=C)
            myGrade = S_C;
        else if (myAve>=CMN)
            myGrade = S_CMN;
        else if (myAve>=CPL)
            myGrade = S_DPL;
        else if (myAve>=D)
            myGrade = S_D;
        else if (myAve>=DMN)
            myGrade = S_DMN;
        else if (myAve<=F)
            myGrade = S_F;
        //post-condition:   Compute Letter Grade, myGrade, as a String  .
        //Cut Offs: 99 A+, 94 A, 90 A-, 88 B+, 84 B, 80 B-, 78 C+, 74 C, 70 C-, 60-69 
    }
    //------------------------------------------------------------------------------
    public String getGrade()
    {
        if(myGrade==S_APL||myGrade==S_A||myGrade==S_AMN)
            return S_A;
        if(myGrade==S_BPL||myGrade==S_B||myGrade==S_BMN)
            return S_B;
        if(myGrade==S_CPL||myGrade==S_C||myGrade==S_CMN)
            return S_C;
        if(myGrade==S_DPL||myGrade==S_D||myGrade==S_DMN)
            return S_D;
        if(myGrade==S_F)
            return S_F;
            return "";
    }
    //------------------------------------------------------------------------------
    public String toString2( )   //Return a Students Grade information as a String.   
    {
        //Returns one line of data for toString1()
        return myName +"    \t" +testAve +"\t" +progAve +"\t" +hkAve+"\t" + myAve + "\t"+myGrade;
    }   
}
