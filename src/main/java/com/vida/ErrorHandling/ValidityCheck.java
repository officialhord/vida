package com.vida.ErrorHandling;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class ValidityCheck {


    public boolean validateDate(String date) {

        Calendar calendar = new GregorianCalendar();
        int currentYear = calendar.get(Calendar.YEAR);
        int makeYear = Integer.parseInt(date);
        if (makeYear > currentYear) {
            return false;
        }
        return true;
    }


}
