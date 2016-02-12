import java.util.Random;

public class Array2DEx
{
    public static void main()
    {
        Random randNum = new Random();
        
        int ro = 1+randNum.nextInt(10);
        int co = 1+randNum.nextInt(10);
        
        int[][] table = new int[ro][co];
        
        
        //[rows][columns]
        //tabel[0][2]
        for(int r = 0; r<table.length; r++)
            for(int c = 0; c<table[r].length;c++)
                table[r][c] = 1+randNum.nextInt(100);
                
        for(int r = 0; r<table.length; r++)
        {
            for(int c = 0; c<table[r].length;c++)
                System.out.print(table[r][c]+"\t ");
                System.out.println();
        }
            
    }
}
