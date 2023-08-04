package org.cursjava.Concurrency;

import org.cursjava.Exceptions_Logging.StudentRepository;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FestivalStatisticsThread extends Thread {
    /**
     * Configure the Logger in order to store all the info/warnings into a file called: logs.txt
     **/
    private static Logger logger = Logger.getLogger(StudentRepository.class.getName());

    static {
        try {
            /*Configure the Logger to use FileHandler in order to write in log.txt**/
            Handler fileHandler = new FileHandler("src/main/resources/FestivalLogs_Concurrency/StatisticsLogs.txt");
            logger.addHandler(fileHandler);
            /*Setting the logger to store all the messages/info/warnings...etc..**/
            logger.setLevel(Level.ALL);

            //TODO
            // Disable the default console handler to prevent log messages from printing to the console
            Logger rootLogger = Logger.getLogger("");
            Handler[] handlers = rootLogger.getHandlers();
            for (Handler handler : handlers) {
                rootLogger.removeHandler(handler);
            }
        } catch (IOException e) {
            System.err.println("FileHandler for Logger can't be configured.");
        }
    }

    private final FestivalGate gate;

    public FestivalStatisticsThread(FestivalGate gate) {
        this.gate = gate;
    }

    @Override
    public void run() {
        int totalPeopleEntered = 0;
        int[] ticketCount = new int[TicketType.values().length];

        try {
            while (true) {
                logger.info("Get the next ticket type from the FestivalGate: success.");
                TicketType ticketType = gate.getNextTicket();
                logger.info("Increment the count for the corresponding ticket type: success.");
                ticketCount[ticketType.ordinal()]++;

                logger.info("Increment the total number of people entered: success.");
                totalPeopleEntered++;

                logger.info("Display statistics every 5 people entered: success.");
                if (totalPeopleEntered % 5 == 0) {
                    displayStatistics(totalPeopleEntered, ticketCount);
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }

    // Helper method to display statistics
    private void displayStatistics(int totalPeopleEntered, int[] ticketCount) {
        logger.info("Display statistics helper method method - started: success.");
        System.out.println(totalPeopleEntered + " people have entered through this festival gate.");
        for (TicketType ticketType : TicketType.values()) {
            // Display the count of each ticket type in lowercase
            System.out.println(ticketCount[ticketType.ordinal()] + " people have: " + ticketType.name().toLowerCase() + " tickets");
            logger.info("Display statistics helper method method - finished: success.");
        }
        System.out.println();
    }


}
