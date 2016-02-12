import javax.swing.JFrame;
public class HouseViewer
{
    public static void main()
    {
        JFrame frame = new JFrame();
        
        frame.setSize(400,400);
        frame.setTitle("Daniel Classon - 5285 Emerson Avenue");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        HouseComponent component = new HouseComponent();
        frame.add(component);
        frame.setVisible(true);
        
        
    }
}
