public class arrayPractice
{
    //Daniel Classon
    public static void main()
    {
        //2. 
        System.out.println("Part 2");
        int[]a = {0,2,4,6,8};
        int[]b = {7};
        b=a;
        b[3]=-10;
        System.out.println(b[3]);
        displayArray(a);
        displayArray(b);
        
        //3.
        System.out.println("Part 3");
        int[]a2 = {0,2,4,6,8};
        int[]b2 = (int[])a2.clone();
        b2[3] = -10;
        System.out.println("a2");
        displayArray(a2);
        System.out.println("b2");
        displayArray(b2);
        
        //4.
        int[]list = {1,3,5};
        int[]newList = new int[2*list.length];
        
        //4.1
        System.out.println("Part 4");
        System.arraycopy(list,0,newList,0,list.length);
        list = newList;
        System.out.println("1 list ");
        displayArray(list);
        
        //4.2
        int i = 1;
        System.arraycopy(list,i,newList,i+1,list.length-i-1);
        list = newList;
        System.out.println("2 list ");
        displayArray(list);
        
        //4.3
        System.arraycopy(list,i+1,newList,i,list.length-i-1);
        list = newList;
        System.out.println("3 list ");
        displayArray(list);
    }
    
    //1.
    public static void displayArray(int[ ] arr)    // Array as a parameter
    {                 
         for(int value: arr)   
             System.out.print(value+" ");  
         System.out.println("");
    }
}
