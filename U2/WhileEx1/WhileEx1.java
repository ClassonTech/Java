import java.util.Scanner;

public class WhileEx1
{
   public static void main()
   {
       	int	numa, a = 4, b = 7;

	do
	{
		numa = a;
		while ( numa <= b )
		{
		      for ( int x = a ; x <= b ; x++ )
			System.out.print( numa );
		      System.out.println( );
		     ++numa;
		}
		 System.out.println( ); 
		++a;
	} while ( a!= b);

       int num, sum=0, ct=0;
       
       num=getNum();
       
       while (num!=-999)
       {
           sum += num;
           num=getNum();
           
           ct++;
       }
       System.out.print(ct+" scores average to "+sum/ct);
       
   }
   //*****Helpers
   public static int getNum()
   {
           Scanner in = new Scanner(System.in);
           int num;
           
           do
           {
              System.out.print("Enter num <-999 terminates>: ");
              num = in.nextInt();
           }while(num<0 && num!=-999);
           
           return num;
   }
}
