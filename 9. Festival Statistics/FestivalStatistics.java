package com.Criss75;

public class FestivalStatistics extends Thread {
    private FestivalGate festivalGate;

    public FestivalStatistics(FestivalGate festivalGate){
        this.festivalGate = festivalGate;
    }

    @Override
    public void run() {
        while(true) {
            try {
                sleep(5 * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("\nPartial results:");
            System.out.println(festivalGate.getStatistics() + "\n");
        }
    }
}
