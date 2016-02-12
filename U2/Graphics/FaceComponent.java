import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
public class FaceComponent extends JComponent
{
   public void paintComponent(Graphics g)
    {
        //Recover Graphics2D
        Graphics2D g2 = (Graphics2D) g;
        
        Ellipse2D.Double head = new Ellipse2D.Double(5,10,100,150);
        g2.draw(head);
        
        Line2D.Double eye1 = new Line2D.Double(25,70,45,90);
        g2.draw(eye1);
        
        Line2D.Double eye2 = new Line2D.Double(85,70,65,90);
        g2.draw(eye2);
        
        Rectangle mouth = new Rectangle(30,130,50,5);
        g2.setColor(Color.RED);
        g2.fill(mouth);
        
        g2.setColor(Color.BLUE);
        g2.drawString("Hello, World", 5, 175);
    }
}
