public class QuickSorter
{
    public QuickSorter(int[] anArray)
    {
        a = anArray;
    }
    
    public void sort()
    {
        sort(0, a.length-1);
    }
    
    public void sort(int start, int end)
    {
        int l,r,mid;
        
        l = start;
        r = end;
        mid = a[(l+r)/2];
        while(r>l)
        {
            while(a[l]<mid)
            {
                ++l;
            }
            while(a[r]>mid)
            {
                --r;
            }
            if(r>l)
            {
                swap(l,r);
                ArrayUtil.print(a);
                ++l;
                --r;
            }
        }
        
        if(r>start)
            sort(start,r);
        if(l<end-1)
            sort(l,end);   
    }
    
    private void swap(int i, int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    private int[] a;
}
