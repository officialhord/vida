package com.vida.Messenger;

import org.slf4j.Logger;

public class ErrorMessage {

    Logger logger;

    public void invalidDate() {
        logger.error("Invalid date entered, kindly review information and save again");

    }
}
