import java.io.*;

public class GradeBookTester
{
    public static void header()
    {
        System.out.println("Daniel Classon");
        System.out.println("GradeBook Program");
        System.out.println("December 10, 2013\n");
    }
    
    public static void main() throws IOException, FileNotFoundException
    {
        //ClassListINF list = new ClassListINF("/media/daniel/PENDRIVE/Comsci/Gradebook1.txt");
        ClassListINF list = new ClassListINF("H:\\Comsci\\Gradebook1.txt");
      
        list.inputStudents();
        list.computeClassAverage();
        list.computeGradeDist();
  
        genOut(list);
    }
    
    public static void genOut(ClassListINF list)
    {
        header();
        list.toString1();
    }
}
