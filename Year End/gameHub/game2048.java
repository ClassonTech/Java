import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class game2048
{
    public int sides;
    public int score;
    
    public Tile[][] gameBoard;
    public int[] spawnNums;
    
    public boolean started;
    public boolean nothingHappened; //Determines whether a change happened
    
    public game2048()
    {
        sides = 0;
        score = 0;
        
        spawnNums = new int[] {2,4,1024};
        
        started = true;
        nothingHappened = false;
    }
    
    public void playGame()
    {
        System.out.println("What grid would you like to play on today? (enter side length)");
        
        Scanner in = new Scanner(System.in);
        sides = in.nextInt();
        
        initializeBoard();
        System.out.println("Type W D S A to go North, East, South and West! Type 'Quit' any time you need to take a pee-pee :)");
        
        while(started)
        {
            makeMove(readInput());
        }
        
        System.out.println("\nYour final score was "+score+"!!!\nThank you so much for playing!");
    }
    
    public int readInput()
    {
        System.out.println("");
        
        Scanner in = new Scanner(System.in);
        while(true)
        {
            String response = in.next();
        
            if(response.equalsIgnoreCase("quit"))
                return -1;
            else if(response.equalsIgnoreCase("W"))
                return 0;
            else if(response.equalsIgnoreCase("D"))
                return 1;
            else if(response.equalsIgnoreCase("S"))
                return 2;
            else if(response.equalsIgnoreCase("A"))
                return 3;
            
            System.out.println("Please only type W D S A or quit.");
        }
    }
    
    public boolean compareTile(Tile one, Tile two)
    {
        if(one.getValue() == two.getValue() && one.getValue() > 0)
        {
            score += 2*one.getValue();
            two.setValue(2*one.getValue());
            one.setValue(0);
            return false;
        }
        if(two.getValue()==0 && one.getValue() > 0)
        {
            two.setValue(one.getValue());
            one.setValue(0);
            if(two.getValue()==2048)
            {
                System.out.println("YOU WIIIIIIIIIIIIIN YAYAYYAAYYAYAYAYAY");
            }
            return false;
        }
        
        return true;
    }
    
    public void makeMove(int key)
    {
            nothingHappened = true;
            if(key == -1)
            {
                started = false;
                return;
            }
            else if (key == 0) 
            {
                int row = 1; //Can't move first row 
                int col;
                
                while(row < sides)
                {
                    col = 0;
                    while(col < sides)
                    {
                        int recur;
                        for(recur = row; recur > 0; recur--)
                        {
                            Tile aTile = gameBoard[recur][col];
                            Tile bTile = gameBoard[recur-1][col];
                            boolean bool = compareTile(aTile,bTile );
                            nothingHappened = nothingHappened && bool;
                        }
                        col++;
                    }
                    row++;
                }
            }
            else if(key == 1)
            {
                int row; 
                int col = sides-2; //Can't move first col
                
                while(col >= 0)
                {
                    row = 0;
                    while(row < sides)
                    {
                        int recur;
                        for(recur = col; recur < sides-1; recur++)
                        {
                            Tile aTile = gameBoard[row][recur];
                            Tile bTile = gameBoard[row][recur+1];
                            boolean bool = compareTile(aTile,bTile );
                            nothingHappened = nothingHappened && bool;
                        }
                        row++;
                    }
                    col--;
                }
            }
            else if(key == 2)
            {
                int row = sides-2; //Can't move first row 
                int col;
                
                while(row >= 0)
                {
                    col = 0;
                    while(col < sides)
                    {
                        int recur;
                        for(recur = row; recur < sides-1; recur++)
                        {
                            Tile aTile = gameBoard[recur][col];
                            Tile bTile = gameBoard[recur+1][col];
                            boolean bool = compareTile(aTile,bTile );
                            nothingHappened = nothingHappened && bool;
                        }
                        col++;
                    }
                    row--;
                }
            }
            else if(key == 3)
            {
                int row; 
                int col = 1; //Can't move first row 
                
                while(col < sides)
                {
                    row = 0;
                    while(row < sides)
                    {
                        int recur;
                        for(recur = col; recur > 0; recur--)
                        {
                            Tile aTile = gameBoard[row][recur];
                            Tile bTile = gameBoard[row][recur-1];
                            boolean bool = compareTile(aTile,bTile );
                            nothingHappened = nothingHappened && bool;
                        }
                        nothingHappened = nothingHappened && compareTile(gameBoard[row][col],gameBoard[row][col-1]);
                        row++;
                    }
                    col++;
                }
            }
            
            if(!nothingHappened)
            {
                System.out.println("[SCORE: "+score+"]");
                spawnTwo();
                printBoard();
            }
    }
    
    public void printBoard()
    {
        int row = 0;
        int col;
                
        while(row < sides)
        {
            col = 0;
            //if(row < sides)
            {
                for(int i = 0; i<sides; i++)
                    System.out.print("+--------");
                System.out.println("+");
                for(int i = 0; i<sides; i++)
                    System.out.print("|        ");
                System.out.println("|");
            }
            while(col < sides)
            {
                if(gameBoard[row][col].getValue()==0)
                    System.out.print("|        ");
                else if(gameBoard[row][col].getValue()<10)
                    System.out.print("|    "+gameBoard[row][col].getValue()+"   ");
                else if(gameBoard[row][col].getValue()<100)
                    System.out.print("|   "+gameBoard[row][col].getValue()+"   ");
                else if(gameBoard[row][col].getValue()<1000)
                    System.out.print("|   "+gameBoard[row][col].getValue()+"  ");
                else
                    System.out.print("|  "+gameBoard[row][col].getValue()+"  ");
                col++;
            }
            System.out.println("|");
            for(int i = 0; i<sides; i++)
                    System.out.print("|        ");
            System.out.println("|");
            row++;
        }

        for(int i = 0; i<sides; i++)
                System.out.print("+--------");
        System.out.println("+\n");
    }
    
    public void initializeBoard()
    {
        gameBoard = new Tile[sides][sides];
        
        int row = 0;
        int col;
        
        while(row < sides)
        {
            col = 0;
            while(col < sides)
            {
                Tile aTile = new Tile(row,col);
                gameBoard[row][col] = aTile;
                col++;
            }
            row++;
        }
        spawnTwo();
        printBoard();
    }
    
    public void spawnTwo()
    {
        //Pre-c: Board is not full
        Random val = new Random();
        
        ArrayList<Tile> emptyTiles = getEmptyTiles();
        if(emptyTiles.size()>0)
        {
            Tile aTile = emptyTiles.get((int)(Math.random()*emptyTiles.size()));
            int spawnNum = val.nextInt(spawnNums.length);
            gameBoard[aTile.getX()][aTile.getY()].setValue(spawnNums[spawnNum]);
        }
    }
    
    public boolean isEmpty(int row, int col)
    {
        if(gameBoard[row][col].getValue() == 0)
            return true;
        return false;
    }
    
    public ArrayList<Tile> getEmptyTiles()
    {
        int row = 0;
        int col;
        
        ArrayList<Tile> arr = new ArrayList<Tile>();
        while(row < sides)
        {
            col = 0;
            while(col < sides)
            {
                if(gameBoard[row][col].getValue() == 0)
                    arr.add(gameBoard[row][col]);
                col++;
            }
            row++;
        }
        return arr;
    }
}