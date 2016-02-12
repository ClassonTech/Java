public class nimTester
{
    public static void header()
    {
        System.out.println("Daniel Classon");
        System.out.println("P6.16");
        System.out.println("THE GAME OF NIM");
        System.out.println("Nov. 4 2013");
    }
    //################################################Main
    public static void main()
    {
        header();
        
        nim n = new nim();
        
        
        
        n.title();
        n.getName();
        do
        {
            n.setupGame();
            n.gameMode();
            n.goFirst();
            n.theGame();
            scores(n);
        }while(n.playAgain());
        
        rankings(n);
        credits();
    }
    //################################################Helpers
    public static void scores(nim n)
    {
        System.out.println("\nGame Number: \t\t"+n.gameNum());
        System.out.println("The winner is: \t\t"+n.winner());
        System.out.println("Moves: \t\t\t"+n.getMoves());
        System.out.println("Game mode: \t\t"+n.getMode());
        System.out.println("First Player: \t\t"+n.getFirst());
    }
    
    public static void rankings(nim n)
    {
        System.out.println("\nGames Played: \t\t"+n.gameNum());
        System.out.println("Overall Winner:\t\t"+n.bigWinner());
        System.out.println("Overall Score:\t\t"+n.scores());
    }
    
    public static void credits()
    {
        System.out.println("\nThanks for playing!");
        
    }    
}
