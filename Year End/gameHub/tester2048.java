import javax.swing.*;
import java.util.*;

public class tester2048
{
    public static void main()
    {
        System.out.println("Welcome, player to 2048 Game!!!! \nDo you want to play?");
        
        Scanner in = new Scanner(System.in);
        String response = in.next();
        
        if(response.equalsIgnoreCase("y")||response.equalsIgnoreCase("yes"))
        {
            game2048 newGame = new game2048();
            newGame.playGame();
        }
    }
}
