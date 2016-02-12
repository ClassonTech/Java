import java.util.Scanner;

public class insertion
{
    public static void main()
    {
        int[] list = new int[10];
        String array = "23 34 4 9 55 46 -4 10 35 41";
        list = readInts(list,array);
        print(list);
    }
    
    public static int[] readInts(int[] arr, String array)
    {
        Scanner in = new Scanner(array);
        int n = in.nextInt();
        int length = 0;
        int[] tempArr = new int[arr.length];
        
        while(length < arr.length)
        {  
            length++;
            
            for(int i = 0; i<tempArr.length; i++)
            {
                tempArr[i] = arr[i];
            }
            
            int index = location(arr, n);
            if(index!=-1)
            {
                System.arraycopy(arr,index,tempArr,index+1,arr.length-index-1);
                tempArr[index] = n;
            }
            
            arr = tempArr;
            if(in.hasNext())
                n = in.nextInt();
            
        }
        return arr;
    }
    
    public static int location(int[] a, int key)
    {
        int index;
        for(index = 0; index<a.length; index++)
        {
            if(key<a[index]||a[index] == 0)
            return index;
        }
        return -1;
    }
    
    public static void print(int[] a)
    {
        for(int i = 0; i<a.length; i++)
        {
            System.out.print(a[i]+", ");
        }
    }
}
