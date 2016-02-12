public class Tile
{
    public int logicalX;
    public int logicalY;
    public int value;
    public Tile(int x, int y)
    {
        logicalX = x;
        logicalY = y;
        value = 0;
    }
    
    public int getX()
    {
        return logicalX;
    }
    
    public int getY()
    {
        return logicalY;
    }
    
    public int getValue()
    {
        return value;
    }
    
    public void setValue(int newVal)
    {
        value = newVal;
    }
}
