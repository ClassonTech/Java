
public class Ch14Project
{
    public static final int COLUMNS = 3;
    public static final int U = 1;
    private int[] a;
    
    public Ch14Project(int[] anArray)
    {
        a = anArray;
    }
    
    private void merge(int[][] first, int[][] second)
    {
        int iFirst = 0;
        int iSecond = 0;
        int j = 0;
        
        while(iFirst < first.length && iSecond < second.length)
        {
            if(first[iFirst][1] < second[iSecond][1])
            {
                ArrayUtil.print(a);
                a[j] = first[iFirst];
                iFirst++;
            }
            else
            {
                ArrayUtil.print(a);
                a[j] = second[iSecond];
                iSecond++;
            }
            j++;
        }
        
        for(int row = 0; row < arr.length; row++)
        {
            for(int col = 0; col < COLUMNS; col++)
            {
                
            }
        }
        System.arraycopy(first, iFirst, a, j, first.length - iFirst);
        System.arraycopy(second, iSecond, a, j, second.length - iSecond);
        
        ArrayUtil.print(a);
        System.out.println();
    }
    
}
