import java.util.Calendar;
import java.util.GregorianCalendar;
public class CalendarTester
{
    public static void header()
    {
        System.out.println("Daniel Classon");
        System.out.println("Page 77 Project 2.1");
        System.out.println("Gregorian Calendar Class Printer\n");
    }
    //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^Main
    public static void main()
    {
        GregorianCalendar cal = new GregorianCalendar(2013,Calendar.SEPTEMBER,8);
        GregorianCalendar myBirthday = new GregorianCalendar(1998,Calendar.MARCH,9);
        GregorianCalendar myBirthday2 = new GregorianCalendar(2013,Calendar.MARCH,9);
        cal.add(Calendar.DAY_OF_MONTH, 100);
        myBirthday2.add(Calendar.DAY_OF_MONTH, 10000);
        
        header();
        generateOutput(cal,myBirthday,myBirthday2);        
    }
    //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^Helpers
    public static void generateOutput(GregorianCalendar cal, GregorianCalendar cal2, GregorianCalendar cal3){
        System.out.println("100 days from today it will be "+cal.get(Calendar.MONTH)+" "+cal.get(Calendar.DAY_OF_MONTH)+", "+cal.get(Calendar.YEAR)+" on the "+cal.get(Calendar.DAY_OF_WEEK)+"th day of the week.");
        System.out.println("I was born on the "+cal2.get(Calendar.DAY_OF_WEEK)+"th day of the week.");
        System.out.println("10000 days from my Birthday it will be "+cal3.get(Calendar.MONTH)+" "+cal3.get(Calendar.DAY_OF_MONTH)+", "+cal3.get(Calendar.YEAR)+" on the "+cal3.get(Calendar.DAY_OF_WEEK)+"th day of the week.");        
    }       
}