import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class FooList
{
    private int fooLength;
    private ArrayList<String> possibleFoos;
    
    //aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
    public FooList (int i)
    {
        fooLength = i;
        possibleFoos = new ArrayList<String>();
    }
    //bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb
    public boolean found(String key)
    {
        for(String str:possibleFoos)
        {
            if(str.equals(key))
                return true;
        }
        return false;
    }
    //cccccccccccccccccccccccccccccccccccccccccccccccc
    public void addFoo(String entry)
    {
        if(!found(entry)&&entry.length()==fooLength)
        {
            System.out.println(entry+" was added");
            possibleFoos.add(entry);
        }
        else if(found(entry))
            System.out.println("lolnope");
    }
    //dddddddddddddddddddddddddddddddddddddddddddddddd
    public String removeRandomFoo()
    {
        Random randNum = new Random();
        int i = randNum.nextInt(possibleFoos.size());
        return possibleFoos.remove(i);
    }
    //------------------------------------------------
    public String getFoo(int i)
    {
        return possibleFoos.get(i);
    }
    public int getFooLength()
    {
        return fooLength;
    }
    public void fillFooList()
    {
        Scanner in = new Scanner(System.in);
        
        int i=0;
        System.out.print("Enter String " +(i+1) +" <done-terminates>: ");
        String s = in.nextLine();
        
        while(!s.equalsIgnoreCase("done"))
        {
            possibleFoos.add(s);
            i++;
            System.out.print("\nEnter String " +(i+1) +" <done-terminates>: ");
            s = in.nextLine();
        }
        System.out.print("\n\nFooList filled with " +possibleFoos.size() +" entries.");
    }
}
