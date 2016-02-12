
public class Square implements ShapeInterface
{
    private double mySideLen;
    
    public Square(double size)
    {
        mySideLen = size;
    }
    
    public double getPerimeter()
    {
        return mySideLen*4;
    }
    public double getArea()
    {
        return Math.pow(mySideLen,2);
    }
    public double getSize()
    {
        return mySideLen;
    }
    
    public String context()
    {
        return "side ";
    }
}
