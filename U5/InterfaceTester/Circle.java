
public class Circle implements ShapeInterface
{
    private double myRadius;
    
    public Circle(double size)
    {
        myRadius = size;
    }
    
    public double getPerimeter()
    {
        return Math.PI*2*myRadius;
    }
    public double getArea()
    {
        return Math.pow(Math.PI,2)*myRadius;
    }
    public double getSize()
    {
        return myRadius;
    }
    
    public String context()
    {
        return "radius ";
    }
}
