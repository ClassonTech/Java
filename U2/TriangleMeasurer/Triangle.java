import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
import java.text.NumberFormat;


public class Triangle extends JComponent
{
    //Coords
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private int x3;
    private int y3;
    //Sides
    private double s1;
    private double s2;
    private double s3;
    //Angles
    private double a1;
    private double a2;
    private double a3;
    //Measures
    private double semi;
    private double peri;
    private double area;
    
    //Viewer spacing
    private int spacing;
    
    //Constructors
    
    public Triangle()
    {
        x1 = 0;
        y1 = 0;
        x2 = 0;
        y2 = 0;
        x3 = 0;
        y3 = 0;
        s1=s2=s3=a1=a2=a3=semi=peri=area=0.0;
        
    }
    
    //Input
    public void queryVertices()
    {
        x1 = Integer.parseInt(JOptionPane.showInputDialog("Vertice 1: X Coordinate?"));
        y1 = Integer.parseInt(JOptionPane.showInputDialog("Vertice 1: Y Coordinate?"));
        x2 = Integer.parseInt(JOptionPane.showInputDialog("Vertice 2: X Coordinate?"));;
        y2 = Integer.parseInt(JOptionPane.showInputDialog("Vertice 2: Y Coordinate?"));;
        x3 = Integer.parseInt(JOptionPane.showInputDialog("Vertice 3: X Coordinate?"));;
        y3 = Integer.parseInt(JOptionPane.showInputDialog("Vertice 3: Y Coordinate?"));;
        
    }
    
    //Computing Methods
    public void comSides()
    {
        s1 = Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));
        s2 = Math.sqrt(Math.pow(x2-x3,2)+Math.pow(y2-y3,2));
        s3 = Math.sqrt(Math.pow(x3-x1,2)+Math.pow(y3-y1,2));
    }
        public void comAngles()
    {
        //Converts to degrees from radians as well
        a1 = Math.acos((Math.pow(s2,2)+Math.pow(s3,2)-Math.pow(s1,2))/(2.0*s2*s3))*(180.0/Math.PI);
        a2 = Math.acos((Math.pow(s1,2)+Math.pow(s3,2)-Math.pow(s2,2))/(2.0*s1*s3))*(180.0/Math.PI);
        a3 = Math.acos((Math.pow(s2,2)+Math.pow(s1,2)-Math.pow(s3,2))/(2.0*s2*s1))*(180.0/Math.PI);
    }
        public void comPeri()
    {
        peri = s1 + s2 + s3;
    }
        public void comArea()
    {
        semi = (s1+s2+s3)/2.0;
        area = Math.sqrt(semi*(semi-s1)*(semi-s2)*(semi-s3));
    }
    
    //Return Methods
    public void getVertices()
    {
        System.out.println("With vertices of");
        System.out.println("\t"+x1+", "+y1);
        System.out.println("\t"+x2+", "+y2);
        System.out.println("\t"+x3+", "+y3);
    }
    
    public double getS1()
    {
        return s1;
    }
    public double getS2()
    {
        return s2;
    }
    public double getS3()
    {
        return s3;
    }
    
    public double getA1()
    {
        return a1;
    }
    public double getA2()
    {
        return a2;
    }
    public double getA3()
    {
        return a3;
    }
    
    public double getPeri()
    {
        return peri;
    }
    public double getArea()
    {
        return area;
    }
    
    //Draw Triangle
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        NumberFormat formatter = NumberFormat.getNumberInstance( );
        formatter.setMinimumFractionDigits(3);	
	    formatter.setMaximumFractionDigits(3);

        Point2D.Double v1 = new Point2D.Double(x1,y1);
        Point2D.Double v2 = new Point2D.Double(x2,y2);
        Point2D.Double v3 = new Point2D.Double(x3,y3);
        
        Line2D.Double a = new Line2D.Double(v1,v2);
        Line2D.Double b = new Line2D.Double(v2,v3);
        Line2D.Double c = new Line2D.Double(v3,v1);
            
        g2.drawString("a", (int)(x1+x2)/2, (int)(y1+y2)/2);
        g2.drawString("b", (int)(x2+x3)/2, (int)(y2+y3)/2);
        g2.drawString("c", (int)(x3+x1)/2, (int)(y3+y1)/2);
        
        g2.drawString("A", x3,y3);
        g2.drawString("B", x1,y1);
        g2.drawString("C", x2,y2);
        
        if (y1>y2 && y1>y3) {
            spacing = y1;
        }
        if (y2>y1 && y2>y3) {
            spacing = y2;
        }
        if (y3>y1 && y3>y2) {
            spacing = y3;
        }
        
        g2.drawString("Vertices: ",(int)15,spacing+10);
        g2.drawString("("+x1+", "+y1+")",15,spacing+20);
        g2.drawString("("+x2+", "+y2+")",15,spacing+30);
        g2.drawString("("+x3+", "+y3+")",15,spacing+40);
        
        g2.drawString("Sides: ",(int)15,spacing+60);
        g2.drawString("a = "+formatter.format(s1),15,spacing+70);
        g2.drawString("b = "+formatter.format(s2),15,spacing+80);
        g2.drawString("c = "+formatter.format(s3),15,spacing+90);
        
        g2.drawString("Angles: ",(int)15,spacing+110);
        g2.drawString("A = "+formatter.format(a1),15,spacing+120);
        g2.drawString("B = "+formatter.format(a2),15,spacing+130);
        g2.drawString("C = "+formatter.format(a3),15,spacing+140);
        
        g2.drawString("Perimeter: "+formatter.format(peri),15,spacing+160);
        g2.drawString("Area: "+formatter.format(area),15,spacing+180);
                        
        g2.draw(a);
        g2.draw(b);
        g2.draw(c);
    }
    
}
