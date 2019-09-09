package com.Criss75;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        FestivalGate festivalGate = new FestivalGate();

        FestivalAtendee[] festivalAtendees = new FestivalAtendee[100];

        for(int i = 0; i< festivalAtendees.length; i++){
            festivalAtendees[i] = new FestivalAtendee(festivalGate);
            festivalAtendees[i].start();
        }

        FestivalStatistics exitPoll = new FestivalStatistics(festivalGate);
        exitPoll.setDaemon(true);
        exitPoll.start();

        for(int i = 0; i< festivalAtendees.length; i++){
            try {
                festivalAtendees[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Final results are: " + festivalGate.getStatistics());
    }
}
