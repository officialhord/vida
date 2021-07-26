package com.vida.Messenger;

import com.vida.Vehicle;
import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.logging.LogLevel;


public class ErrorMessage {

    private String message = null;

    public void invalidDate(String date) {

        //This should return an Invalid year entered message as the webservice response
        message = "Invalid year entered... " + date;

    }
}
