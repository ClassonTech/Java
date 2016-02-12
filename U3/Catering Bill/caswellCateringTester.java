public class caswellCateringTester
{
    public static void header()
    {
        System.out.println("Daniel Classon");
        System.out.println("Chapter 5");
        System.out.println("Caswell Catering & Convention Center Invoice");
        
        
    }
    //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^Main Method
    public static void main()
    {
        Invoice bill = new Invoice();
        
        getOutput(bill);
    }
    //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^Helpers
    public static void getOutput(Invoice b)
    {
        header();
        b.getInvoice();
    }
}
