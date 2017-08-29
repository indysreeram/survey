package com.summercollab.survey;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by sreeram.srini on 8/28/17.
 */
public class DateTest {

    public static void main(String agrs[]) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        System.out.println (dateFormat.format(date));

        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());

        Calendar cal1 =Calendar.getInstance();
        cal1.setTime(new Date());
        cal.add(Calendar.DATE,180);
        System.out.println (dateFormat.format(date));
        System.out.println (cal.getTime());
        System.out.print( "Value is :" + cal1.compareTo(cal));
    }



}
