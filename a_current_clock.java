import java.text.SimpleDateFormat;
import java.util.Date;

public class a_current_clock {
    public static void main(String[] args) {
        Date now = new Date();
        // now is object variable for class Date()
        SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // sdfDate is object variable for class simpleDateFormat and format date and time
        String date_time = sdfDate.format(now);
        // date_time is string variable for get the result of format from simpledateformate
        System.out.println(date_time);
    }
}
