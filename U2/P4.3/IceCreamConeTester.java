public class IceCreamConeTester
{
    public static void header()
    {
        System.out.println("Daniel Classon");
        System.out.println("Page 174 - P4.3");
        System.out.println("Ice Cream Cone measurments\n");
        
    }
    //&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&Main
    public static void main()
    {
        IceCreamCone noCone = new IceCreamCone();
        IceCreamCone snowCone = new IceCreamCone(3,5);
        
        header();
        generateOutput(noCone);
        generateOutput(snowCone);
    }
    //&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&Helpers
    public static void generateOutput(IceCreamCone cone)
    {
        cone.comVolume();
        cone.comSA();
        System.out.println("Your ice cream cone has dimensions: \n\tRadius: \t"+cone.getR()+"\n\tHeight: \t"+cone.getH()+"\n\tVolume: \t"+cone.getVolume()+"\n\tSurface Area: \t"+cone.getSA());
    }
}
