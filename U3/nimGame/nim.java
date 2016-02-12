import java.util.Scanner;
import java.util.Random;

public class nim
{
    private static final int PILESIZE = 100;
    private static final int SM_BASE = 2;
    private static final int SM_SUBTRACT = 1;
    private static final int MIN_MARBS = 1;
    private static final String SPACE = "###############################################";
    private static final String COM = "Computer";
    private static final String DRAW = "Draw";  
    private static final String MODE1 = "Smart";  
    private static final String MODE2 = "Random";  
    
    private int gamesPlayed;
    private int pile;
    private int halfPile;
    private int cpuWin;
    private int plWin;
    private int moves;
    private int initiative; //moves+1 or moves+2, tells who goes first
    private int turn; //1 is computer, 2 is player
    
    private String winner;
    private String bigWinner;
    private String initials;
    private String first;
    
    private boolean smart;
    private boolean random;
    private boolean done;
    
    //Constructors
    public nim()
    {
        gamesPlayed = 0;
        pile = 0;
        halfPile = 0;
        cpuWin = 0;
        plWin = 0;
        moves = 0;
        initiative = 0;
        turn = 0;
        
        winner = "";
        bigWinner = "";
        initials = "";
        first = "";
        
        smart = false;
        random = false;
        done = false;

    }
    
    //Set-up
    public void space()
    {
        System.out.println(SPACE);
    }
    
    public void title()
    {
        System.out.println(" ________ ______  ________   __  _______  ____  ____  _  ________  ___");
        System.out.println("/_  __/ // / __/ / ___/ _ | /  |/  / __/ / __ \\/ __/ / |/ /  _/  |/  /");
        System.out.println(" / / / _  / _/  / (_ / __ |/ /|_/ / _/  / /_/ / _/  /    // // /|_/ / ");
        System.out.println("/_/ /_//_/___/  \\___/_/ |_/_/  /_/___/  \\____/_/   /_/|_/___/_/  /_/  ");
        System.out.println("");
    }
    
    public void getName()
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter your initials");
        String str = in.next();
        initials = str;
        System.out.println("Welcome "+initials+".");
    }
    
    public void setupGame()
    {
        pile = PILESIZE;
        moves = 0;
        initiative = 0;
        turn = 0;

        smart = false;
        random = false;
        done = false;
    }
    
    public void gameMode()
    {
        System.out.println("There is random mode and smart mode.");
        System.out.println("Do you want to play random or smart?");
        
        Scanner in = new Scanner(System.in);
        
        boolean valid = false;
        String echo = "";

        do
        {         
            String str = in.next();      
            if (str.equalsIgnoreCase(MODE1))   
            {            
                echo = str;
                smart = true; 
                valid = true;  
            }         
            if (str.equalsIgnoreCase(MODE2))  
            {               
                echo = str;
                random = true; 
                valid = true;         
            }      
        }while(!valid); 
        
        System.out.println("Playing in "+echo+" mode!");
    }         
    
    public void goFirst() 
    {       
        Random randNum = new Random();    
        
        initiative = randNum.nextInt(2)+1; 
        
        if (initiative == 1)         
            first = COM;      
        if (initiative == 2)    
            first = initials;    
            
        System.out.println(first+" goes first!"); 
    }  
    
    //Game Methods
    public void theGame()  
    {                   
        gamesPlayed++;
        space(); 
        done();
        
        do     
        {     
            if ((initiative+moves)%2==0)   
            {         
                halfPile();
                playerTurn();   
                space();    
                done();
            }                  
            if ((initiative+moves)%2==1&&!done)
            {
                halfPile();
                cpuTurn();   
                space(); 
                done();
            }
        }while(!done);
    }
    
    public void cpuTurn()
    {
        moves++;
        turn = 1;
        
        int num = 0;
        
        System.out.print("Enter num between 1 and "+halfPile+": "); 
                
        if (random)
        {
            Random randNum = new Random();
            if (halfPile >= 1)
                num = randNum.nextInt(halfPile)+1;
        }
        else if (smart)
        {
            int n = 0;
            int temp = MIN_MARBS;
            boolean valid = false;
            
            do
            {
                n++;
                temp = goalPile(n);
                num = pile-temp;  
                if (num > halfPile || num == 0)
                    num = halfPile; //Rare cases where cpu can't reach mersenne, like 63
            }
            while(temp<halfPile); 
        }
        
        pile -= num;
        System.out.println(num+"\n"+COM+" takes "+num+" marbles.");
    }
    
    public int goalPile(int n)
    {
        return (int)Math.pow(SM_BASE,n)-SM_SUBTRACT;
    }
    
    public void playerTurn()
    {
        moves++;
        turn=2; 
        
        System.out.print("Enter num between 1 and "+halfPile+": ");  
        Scanner in = new Scanner(System.in);
        
        int num = 0;
        boolean valid = false;
        do
        {
            
            num = in.nextInt();
            if(num>=MIN_MARBS&&num<=halfPile)
            {
                pile -= num;
                valid = true;
            }
        }while(valid==false);
        
        System.out.println(initials+" takes "+num+" marbles.");
    }

        public boolean playAgain()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Play Again? Yes/no");
        do
        {
            String str = in.next();
            if(str.equalsIgnoreCase("yes"))
                return true;
            if(str.equalsIgnoreCase("no"))
                return false;
        }
        while(true);
    }
    
    public void done()
    {
        if (!done)
        {
            
            System.out.println("There are "+pile+" marbles left.");
            if(pile==0)
            {
                if (turn == 1)
                {
                    plWin++;
                    winner = initials;
            
                }
                if (turn == 2)
                {
                    cpuWin++;
                    winner = "Computer";
                    
                }
                done = true;
            }
        }
    }
       
    public void halfPile()
    {
        if (pile!=MIN_MARBS) 
            halfPile = Math.round(pile/2);
        else
            halfPile = pile;
    }
    
    //Get Methods
    public String winner()
    {
        return winner;
    }
    
    public String bigWinner()
    {
        if (plWin > cpuWin)
        return initials;
        if (cpuWin > plWin)
        return COM;
        return DRAW;
    }
    
    public int gameNum()
    {
        return gamesPlayed;
    }
    
    public int getMoves()
    {
        return moves;
    }
    
    public String getMode()
    {
        if (smart)
            return "smart";
        return "random";
    }
    
    public String getFirst()
    {
        return first;
    }
    
    public String scores()
    {
        return plWin+" - "+cpuWin;
    }
}