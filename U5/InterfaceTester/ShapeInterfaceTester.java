public class ShapeInterfaceTester
{
    public static void main()
    {
        ShapeInterface figure = new Square(5);
        print(figure);
        
        figure = new Pentagon(6);
        print(figure);
        
        figure = new Circle(3);
        print(figure);     
    }

    private static void print(ShapeInterface figure)
    {
        System.out.println("\n" +getFigure( figure ) +": " +figure.context() +"= " +figure.getSize() 
                                    +"\n\tArea :  " +figure.getArea() 
                                    +"\n\tPerimeter :  "+figure.getPerimeter());
    }
    
    private static String getFigure(ShapeInterface figure )
    {
        if(figure instanceof Square)
           return "Square";
        //else if(figure instanceof Pentagon)
        //    return "Pentagon";
        else
           return"Circle";
     }
     
}
