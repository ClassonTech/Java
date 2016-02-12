public class Checktester
{
    public static void main()
    {
        SavingsAcct collegeAcct = new SavingsAcct(4.25);
        CheckingAcct billAcct = new CheckingAcct();
        
        collegeAcct.deposit(10000);
        billAcct.deposit(5000);
        
        for(int i = 0; i<48; i++)
        {
            if(i%3 == 0)
            {
                collegeAcct.addInterest();
                billAcct.deposit(1300);
            }
            billAcct.writeCheck(500);
        }
        
        billAcct.deductFees();
        collegeAcct.transferBankAcct(billAcct, 200);
        
        System.out.println("collegeAcct bal: $"+collegeAcct.getBalance());
        System.out.println("billAcct bal: $"+billAcct.getBalance());
    }
}
