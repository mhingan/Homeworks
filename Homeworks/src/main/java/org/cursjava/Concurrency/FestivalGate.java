package org.cursjava.Concurrency;

import java.util.LinkedList;
import java.util.Queue;

public class FestivalGate {

    private final Queue<TicketType> ticketQueue = new LinkedList<>();

    public synchronized void addTicket(TicketType ticketType) {
        ticketQueue.add(ticketType);
        notifyAll(); // Notify waiting threads that a new ticket has been added
    }

    public synchronized TicketType getNextTicket() throws InterruptedException {
        while (ticketQueue.isEmpty()) {
            // Wait until there is a ticket in the queue
            wait();
        }
        return ticketQueue.poll();
    }

}
