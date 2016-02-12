import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
public class HouseComponent extends JComponent
{
   public void paintComponent(Graphics g)
    {
        //Recover Graphics2D
        Graphics2D g2 = (Graphics2D) g;
        
        int x = getWidth()/2-65;
        int y = getHeight()/2-40;
        House house1 = new House(x,y);
        
        house1.draw(g2);
    }
}
