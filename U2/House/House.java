import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class House
{
   public House(int x, int y)
   {
       xM = x; //xMouse
       yM = y;//yMouse
   }
   
   public void draw(Graphics2D g2)
    {
        //Garage, Door        
        Rectangle g1 = new Rectangle(xM,yM+50,50,30);
        Rectangle g3 = new Rectangle(xM+5,yM+62,40,18);
        Rectangle dw = new Rectangle(xM+80,yM+50,20,10);
        Rectangle df = new Rectangle(xM+80,yM+60,20,20);
        Rectangle door = new Rectangle(xM+86,yM+60,8,20);
        //Canopies
        Rectangle c1 = new Rectangle(xM+55,yM+50,20,30);
        Rectangle cp1 = new Rectangle(xM+59,yM+50,12,30);
        Rectangle c2 = new Rectangle(xM+105,yM+50,20,30);
        Rectangle cp2 = new Rectangle(xM+109,yM+50,12,30);
        //Windows
        Rectangle w1 = new Rectangle(xM+55,yM+24,8,20);
        Rectangle w2 = new Rectangle(xM+67,yM+24,8,20);
        Rectangle w3 = new Rectangle(xM+80,yM+24,20,20);
        Rectangle w4 = new Rectangle(xM+105,yM+24,8,20);
        Rectangle w5 = new Rectangle(xM+117,yM+24,8,20);
        Rectangle m1 = new Rectangle(xM+60,yM+57,3,13);
        Rectangle m2 = new Rectangle(xM+67,yM+57,3,13);
        Rectangle m3 = new Rectangle(xM+110,yM+57,3,13);
        Rectangle m4 = new Rectangle(xM+117,yM+57,3,13);
        Rectangle d2 = new Rectangle(xM+81,yM+62,3,9);
        Rectangle d3 = new Rectangle(xM+96,yM+62,3,9);
        
        //Doorknob
        Ellipse2D.Double dk = new Ellipse2D.Double(xM+88,yM+69,2,2);  
        //House base
        Point2D.Double f1 = new Point2D.Double(xM+50,yM+80);  
        Point2D.Double f2 = new Point2D.Double(xM+130,yM+80);  
        Point2D.Double f3 = new Point2D.Double(xM+130,yM+20);  
        Point2D.Double f4 = new Point2D.Double(xM+10,yM+20); 
        Point2D.Double f5 = new Point2D.Double(xM+10,yM+40);
        //Triangle Garage Roof
        Point2D.Double t1 = new Point2D.Double(xM+25,yM+25);
        Point2D.Double t2 = new Point2D.Double(xM+50,yM+50);
        Point2D.Double t3 = new Point2D.Double(xM,yM+50);
        //Roof
        Point2D.Double r1 = new Point2D.Double(xM+135,yM+20);
        Point2D.Double r2 = new Point2D.Double(xM+105,yM+6);
        Point2D.Double r3 = new Point2D.Double(xM+100,yM);
        Point2D.Double r4 = new Point2D.Double(xM+80,yM);
        Point2D.Double r5 = new Point2D.Double(xM+75,yM+6);
        Point2D.Double r6 = new Point2D.Double(xM+15,yM+6);
        Point2D.Double r7 = new Point2D.Double(xM+5,yM+20);
        
        
        Line2D.Double f1f2 = new Line2D.Double(f1,f2);
        Line2D.Double f2f3 = new Line2D.Double(f2,f3);
        Line2D.Double f3f4 = new Line2D.Double(f3,f4);
        Line2D.Double f4f5 = new Line2D.Double(f4,f5);
        Line2D.Double t1t2 = new Line2D.Double(t1,t2);
        Line2D.Double t1t3 = new Line2D.Double(t1,t3);
        Line2D.Double r1r2 = new Line2D.Double(r1,r2);
        Line2D.Double r2r3 = new Line2D.Double(r2,r3);
        Line2D.Double r3r4 = new Line2D.Double(r3,r4);
        Line2D.Double r4r5 = new Line2D.Double(r4,r5);
        Line2D.Double r5r6 = new Line2D.Double(r5,r6);
        Line2D.Double r6r7 = new Line2D.Double(r6,r7);
        
        
        
        
        
        
        g2.draw(g1);
        g2.draw(g3);
        g2.draw(dw);
        g2.draw(df);
        g2.draw(door);
        g2.draw(c1);
        g2.draw(cp1);
        g2.draw(c2);
        g2.draw(cp2);
        g2.draw(w1);
        g2.draw(w2);
        g2.draw(w3);
        g2.draw(w4);
        g2.draw(w5);
        g2.draw(m1);
        g2.draw(m2);
        g2.draw(m3);
        g2.draw(m4);
        g2.draw(d2);
        g2.draw(d3);
        g2.draw(dk);
        
        g2.draw(f1f2);
        g2.draw(f2f3);
        g2.draw(f3f4);
        g2.draw(f4f5);
        g2.draw(t1t2);
        g2.draw(t1t3);
        
        g2.draw(r1r2);
        g2.draw(r2r3);
        g2.draw(r3r4);
        g2.draw(r4r5);
        g2.draw(r5r6);
        g2.draw(r6r7);
        
    }
    private int xM;
    private int yM;
}
