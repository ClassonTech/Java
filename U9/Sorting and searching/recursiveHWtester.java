
public class recursiveHWtester
{
    public static void main()
    {
        int[] a = {1,2,3,4,5,6,7,8};
        System.out.println(seqSearch(a,8));
        System.out.println(seqSearch(a,9));
        
        int[] b = {1,2,3,4,5,6,7,8};
        System.out.println(binSearch(b,8));
        System.out.println(binSearch(b,9));
    }
    
    public static int seqSearch(int[] a, int key)
    {
        if(a.length!=0)
        {
            if(a[a.length-1]==key)
                return a.length-1;
            else
            {
                int[] newA = new int[a.length-1];
                for(int i = 0; i < newA.length; i++)
                {
                    newA[i] = a[i];
                }
                seqSearch(newA, key);
            }
        }
        return -1;
    }
    
    public static int binSearch(int[]a, int key)
    {
        int f = 0;
        int l = a.length-1;
        if(f<=1)
        {
            int m = (f+l)/2;
            if(a[m]==key)
                return m;
            if(key>a[m])
                f= m + 1;
            else
                l = m-1;
            int[] newA = new int[a.length/2];
            System.arraycopy(a, f, newA, 0, l-f);
            binSearch(newA, key);
        }
        return -1;
    }
}
