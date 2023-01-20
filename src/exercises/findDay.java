import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        Date myDate = new Date(year-1900, month-1, day);
        Calendar calendar = Calendar.getInstance();
        String _day = "";
        if(year > 2000 && year < 3000) {
            calendar.setTime(myDate);  
            _day = new SimpleDateFormat("EEEE").format(myDate);
        }
        return _day.toUpperCase();
    }

}
