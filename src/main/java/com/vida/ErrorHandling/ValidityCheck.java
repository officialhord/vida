package com.vida.ErrorHandling;

import java.util.Calendar;

public class ValidityCheck {


    public boolean validateDate(String date) {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int makeYear = Integer.parseInt(date);
        if (makeYear > currentYear) {
            return false;
        }
        return true;
    }


}
