
public class XYStuff
{
    public static void main(){
        int x = 3;
		int y;	// Is this ok?

		x = x+x; //x = 6
		y = 2*x; //y = 12
		x = 3*y - x; //x = 30
		y = y - x; //y = -18

		System.out.println("x = " +x  +"  y = " +y);

    }
}
