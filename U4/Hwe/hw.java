import java.util.Random;

public class hw
{
    public static void main()
    {
        int[]list = new int[5];
        list[0]=1;
            for(int a = 1; a < 5; a++)
                list[a] = 2*list[a-1];       //List contains what?
        
                    displayArray(list);      //TBD
        
        Random num = new Random( );
            for(int a = 0; a < 5; a++)
                list[a] = 1+num.nextInt(100);    //List contains what? 
        
                     displayArray(list);
        
                
        
    }
    public static void displayArray(int[ ] arr)    // Array as a parameter
              {                 
                     for( int i = 0; i < arr.length ; i++)   
                        System.out.print(arr[i] +" ");      
              }
}
