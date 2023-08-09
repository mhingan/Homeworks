package org.cursjava.EXTRA_EXERCITII.Logging;


import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class LogPractice {
    private static final Logger logger = LogManager.getLogger(LogPractice.class);

    public int calculateSum(int a, int b){
        logger.info("Calculating sum starting.");
        return a+b;

    }
}
