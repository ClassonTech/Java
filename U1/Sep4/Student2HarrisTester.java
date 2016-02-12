public class Student2HarrisTester
{
    //Only Header up here. Helper
    //Always do header
    public static void header()
    {
        System.out.println("Daniel Classon");
        System.out.println("p126 P3.6");
        System.out.println("Quiz Averaging Program\n");
    }
    //===================================================================main Method
    public static void main()
    {
        Student2Harris s = new Student2Harris("Butely Penniesworth");
        
        s.addQuiz(99);
        s.addQuiz(79);
        s.addQuiz(87);
        
        header();
        generateOutput(s);       
    }
    //Other Helper Methods
    //===============================================================Generate output
    public static void generateOutput(Student2Harris s)
    {
        System.out.println("Name: \t\t" + s.getName());
        System.out.println("Sum Scores= \t" + s.getTotalSum());
        System.out.println("Num Scores= \t" + s.getNumScores());
        System.out.println("Average= \t" + s.getAve());
    }
}
