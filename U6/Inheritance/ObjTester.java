public class ObjTester
{
    public static void main()
    {
        BankAccount b = new BankAccount(1000);
        System.out.println(b);
        
        BankAccount s = new SavingsAcct(3.5);
        System.out.println(s);
        
    }
}