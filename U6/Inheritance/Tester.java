public class Tester
{
    public static void main()
    {
        SavingsAcct save = new SavingsAcct(3.5);
        save.deposit(1000);
        save.addInterest();
        
        save.deposit(1000);
        save.addInterest();
        
        save.withdraw(500);
        save.addInterest();
        
        System.out.print("Bal: " + save.getBalance());
    }
}
