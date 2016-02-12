import javax.swing.JFrame;
public class RectangleViewer
{
    public static void main()
    {
        JFrame frame = new JFrame();
        
        frame.setSize(300,400);
        frame.setTitle("Dos rectumes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        RectangleComponent component = new RectangleComponent();
        frame.add(component);
        frame.setVisible(true);
        
        
    }
}
