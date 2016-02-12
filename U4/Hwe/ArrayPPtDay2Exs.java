public class ArrayPPtDay2Exs
{
    public static void main()
    {
        //I.
        int[] arr = {4,5,7,2};  
        displayArray("I\tarr-> ", arr);
        
        //II.
        int[] a = {0,2,4,6,8};
        int[] b = {7};
        b=a;
        b[3] = -10;
        System.out.println("\nII\ta[3]= " +a[3]);
        System.out.println("\tBecause a=" +a +" & b=" +b);
        displayArray("\ta-> ", a);
        displayArray("\tb-> ", b);
        
        //III.
        int[] a2 = {0,2,4,6,8};
        int[] b2 = (int[])a2.clone();
        b2[3] = -10;
        displayArray("\nIII \ta2-> ", a2);
        displayArray("\tb2-> ", b2);
        System.out.println("\tBecause a2=" +a2 +" & b2=" +b2);
        
        //IV
        int[] list = {1,3,5};
        int[] newList = new int[2*list.length];
        
        System.arraycopy(list, 0, newList, 0, list.length);
        list = newList;
        displayArray("\nIV \t1.list-> ", list);
        
        int i=1;
        System.arraycopy(list, i, list, i+1, list.length-i-1);
        displayArray("\t2.list-> ", list);
        
        System.arraycopy(list, i+1, list, i, list.length-i-1);
        displayArray("\t3.list-> ", list);
        
    }  
    
    public static void displayArray(String s, int[ ] a)
    {        
             System.out.print(s);
             for( int comp:a)  
                  System.out.print(comp +" ");     
             System.out.println();
             
    }
}
