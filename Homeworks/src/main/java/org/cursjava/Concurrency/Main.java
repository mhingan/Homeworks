package org.cursjava.Concurrency;
public class Main {
    public static void main(String[] args) {

        FestivalGate festivalGate = new FestivalGate();
        FestivalStatisticsThread festivalStatisticsThread = new FestivalStatisticsThread(festivalGate);

        festivalStatisticsThread.start();

        // Generate 100 attendee threads
        for (int i = 0; i < 100; i++) {
            // Create a new attendee thread and pass the FestivalGate to it
            FestivalAttendanceThread attendeeThread = new FestivalAttendanceThread(festivalGate);
            // Start the attendee thread
            attendeeThread.start();

            // Sleep a bit to simulate random generation of attendees
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

