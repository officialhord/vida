package com.vida.errorHandling;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ValidityCheck {


    public boolean validateDate(String date) {
        boolean status = true;
        int currentYear = Calendar.YEAR;
        int makeYear = Integer.parseInt(date);
        if (makeYear > currentYear) {
            return false;
        }
        return status;
    }


}
