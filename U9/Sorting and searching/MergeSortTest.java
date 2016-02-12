/**
   This program tests the merge sort algorithm by
   sorting an array that is filled with random numbers.
*/
public class MergeSortTest
{  
   public static void main()
   {  
      int[] a = ArrayUtil.randomIntArray(10, 100);
      
      System.out.println("Initial List");
      ArrayUtil.print(a);
      System.out.println();
      
      MergeSorter sorter = new MergeSorter(a);
      sorter.sort();
      
      System.out.println("\n\nSorted List");
      ArrayUtil.print(a);
   }
}
