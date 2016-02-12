import java.util.ArrayList;
import javax.swing.*;
import java.util.Scanner;
import java.io.*;

public class ClassListINF
{ 
    private ArrayList<StudentINF>myStudents = new ArrayList<StudentINF>();          // ArrayList of class “Student”.
    private double myAve;                  // Overall class average.
    private int[ ] myGradeDistribution= new int[5];            // 5 element integer array for grade distribution.  
    private String classListString;
    private Scanner inF;
    private String address;
    // Cell [0] will contain the total number of ‘As’, 
    // [1] –Bs, [2] – Cs, [3] – Ds, and [4] – Fs.
    private static final String A = "A";
    private static final String B = "B";
    private static final String C = "C";
    private static final String D = "D";
    private static final String F = "F";
    
    public ClassListINF(String s)
    {
        myAve = 0;

        address = s;
        classListString = "";
        inF = null;

    }
    
    public void inputStudents() throws IOException, FileNotFoundException          
    {
        String  input;
        int i = 0;
        boolean anotherStudent = true;
        
        inF = new Scanner(new File(address));

        if(inF.hasNextLine())
        {
            anotherStudent = true;
            i++;
        }
        while(anotherStudent)
        {
            StudentINF aStudent = new StudentINF();
            
            aStudent.inputInfo(inF);        
            
            myStudents.add(aStudent);
            
            i++;
            input = JOptionPane.showInputDialog("Student no. " + i + " (y/n)?");
            if(!input.equals("Y") && !input.equals("y"))
                anotherStudent = false;
        }
    }

    public void computeClassAverage( )
    {
        int sum = 0;
        
        for(StudentINF s:myStudents)
        {
            s.computeAve();
            sum += s.getAve();
        }
        
        myAve = sum/myStudents.size();
    }
    
    public void computeGradeDist( )
    {
        for(StudentINF s: myStudents)
        {
            s.computeGrade();
            if(s.getGrade()== A)
                myGradeDistribution[0] ++;
            if(s.getGrade()== B)
                myGradeDistribution[1] ++;
            if(s.getGrade()== C)
                myGradeDistribution[2] ++;
            if(s.getGrade()== D)
                myGradeDistribution[3] ++;
            if(s.getGrade()== F)
                myGradeDistribution[4] ++;
        }
    }
    
    public void toString1( )   
    // Print out the entire class with the following guidelines:
    {
        
        System.out.println("\tName\t\tTestAve\tProgAve\tHkAve\tTotAve\tGrade");
        int i=1;
        for(StudentINF s : myStudents)
        {
            System.out.println(i + ". " + s.toString2());
            i++;
        }
       
        System.out.println("");
        System.out.println("Class Average: " + myAve);
        System.out.println();
        System.out.println("\tA\tB\tC\tD\tF");
        System.out.println("\t" + myGradeDistribution[0] + "\t" + myGradeDistribution[1] + "\t" + myGradeDistribution[2] + "\t" + myGradeDistribution[3] + "\t" + myGradeDistribution[4]);
   
    }
}
