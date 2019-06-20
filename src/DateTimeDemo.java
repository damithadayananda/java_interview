import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateTimeDemo {
    public void date_time()  {
        System.out.println("************current date ***************");
        Date date = new Date();
        System.out.println(date.toString());

        System.out.println("************date time format************");
        SimpleDateFormat sdft = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss");
        System.out.println("Current Date: "+sdft.format(date));

        System.out.println("************string to date parsing******");
        String date1 = new String("2007-12-01");
        SimpleDateFormat sdft1 = new SimpleDateFormat("yyyy-MM-dd");
        try {
            System.out.println(sdft1.parse(date1));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println("************date utils*******************");
        System.out.println(date);
    }

    /**
     * Georgian calender is concrete implementation of calender class
     */
    public void georgian_calender(){
        System.out.println("******GregorianCalendar class************");
        GregorianCalendar gregorianCalendar = new GregorianCalendar();

        System.out.println("*************Day of month****************");
        System.out.println(gregorianCalendar.get(Calendar.DAY_OF_MONTH));

        System.out.println("***********check is leap year************");
        int year = gregorianCalendar.get(Calendar.YEAR);

        String expression = String.format("%d is an",year);

        if(gregorianCalendar.isLeapYear(year)){
            System.out.println(expression+" leap year");
        }else {
            System.out.println(expression+" not leap year");
        }
    }
}
