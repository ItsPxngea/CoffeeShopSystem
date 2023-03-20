package za.ac.cput.util;

import org.apache.commons.validator.routines.DateValidator;

import java.text.*;
import java.util.*;

public class CustomerOrderHelper {
    public static boolean isNullOrEmpty(String str) {
        if (str == null || str.isEmpty()) {
            return true;
        }
        return false;
    }

    public static boolean isInvalidDouble(Double d) {
        if (d == null || d.isNaN()) {
            return true;
        } else if (d < 0) {
            return true;
        }
        return false;
    }

    public static Date isValidDate(String dateStr, String dateFormat){
        Date date = null;
        DateFormat sdf = new SimpleDateFormat(dateFormat);
        sdf.setLenient(false);
        try{
            date = sdf.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    public static String generateId(){
        return UUID.randomUUID().toString();
    }
}
