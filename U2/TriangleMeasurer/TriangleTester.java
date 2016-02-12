import javax.swing.JFrame;
import java.text.NumberFormat;

public class TriangleTester
{
    public static void header()
    {
        System.out.println("Daniel Classon");
        System.out.println("p.179 P4.1");
        System.out.println("Compute Area and Perimeter given triangle coordinates\n");
    }
    //************************************************************************************MAIN
    public static void main()
    {
        
        Triangle tri = new Triangle();
        
        //Try it with vertices 10,10 50,90 27,94 -> Area exactly 1000.000
        //Given coordinates = 14,25 80,58 78,153
        tri.queryVertices();
        tri.comSides();
        tri.comAngles();
        tri.comPeri();
        tri.comArea();
        
        JFrame frame = new JFrame();
        
        frame.setSize(450,400);
        
        frame.setTitle("Yo' Three-sided Geometry Heah Fo' Yo' Viewin'");
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
        frame.add(tri);
                             
        frame.setVisible(true);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        generateOutput(tri);
        
    }
    //************************************************************************************HELPERS
    public static void generateOutput(Triangle t)
    {
        NumberFormat formatter = NumberFormat.getNumberInstance( );
        formatter.setMinimumFractionDigits(3);	
	    formatter.setMaximumFractionDigits(3);

	    header();
        
        t.getVertices();
        
        System.out.println("Sides: \n\t"+formatter.format(t.getS1())+"\n\t"+formatter.format(t.getS2())+"\n\t"+formatter.format(t.getS3()));
        System.out.println("Angles: \n\t"+formatter.format(t.getA1())+" degrees \n\t"+formatter.format(t.getA2())+" degrees\n\t"+formatter.format(t.getA3())+" degrees");
        System.out.println("Perimeter: \n\t"+formatter.format(t.getPeri()));
        System.out.println("Area: \n\t"+formatter.format(t.getArea()));
    }
}
