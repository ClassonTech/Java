public class tester
{
    public static void main()
    {
        System.out.println(sum(5));
        System.out.println(fact(5));
        System.out.println(exp(2,3));
    }
    
    public static int sum(int n)
    {
        if(n == 1)
        return n;
        else
        return n + sum(n-1);
    }
    
    public static int fact(int n)
    {
        if(n == 1)
        return n;
        else
        return n * fact(n-1);
    }
    
    public static int exp(int b, int n)
    {
        if(n == 1)
        return b;
        else
        return b * exp(b,n-1);
    }
}
