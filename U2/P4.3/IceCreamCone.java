public class IceCreamCone
{
    private double radius;
    private double height;
    private double volume;
    private double sA;
        
    public IceCreamCone ()
    {
        radius = 0.0;
        height = 0.0;
        volume = 0.0;
        sA = 0.0;
    }
    
    public IceCreamCone (double r, double h)
    {
        radius = r;
        height = h;
        volume = 0.0;
        sA = 0.0;
    }
        
    public void comVolume ()
    {
        volume = 2.0/3.0*Math.PI*Math.pow(radius,3);
        volume += 1.0/3.0*Math.PI*Math.pow(radius,2)*height;
    }
    
    public void comSA ()
    {
        sA = 2.0*Math.PI*Math.pow(radius,2)+Math.PI*radius*Math.sqrt(Math.pow(radius,2)+Math.pow(height,2));
        
    }
    
    public double getVolume ()
    {
        return volume;
    }
    
    public double getSA ()
    {
        return sA;
    }
    
    public double getH ()
    {
        return height;
    }
    
    public double getR ()
    {
        return radius;
    }
}
