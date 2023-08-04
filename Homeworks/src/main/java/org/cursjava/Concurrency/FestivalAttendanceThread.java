package org.cursjava.Concurrency;

import java.util.Random;

class FestivalAttendanceThread extends Thread {
    private final FestivalGate gate;
    private final Random random = new Random();

    public FestivalAttendanceThread(FestivalGate gate) {
        this.gate = gate;
    }

    //override the run() method with the specific code;
    @Override
    public void run() {
        synchronized (gate) { // Synchronize on the same monitor as the addTicket() method
            TicketType ticketType = TicketType.values()[random.nextInt(TicketType.values().length)];
            gate.addTicket(ticketType);
        }
    }
}

