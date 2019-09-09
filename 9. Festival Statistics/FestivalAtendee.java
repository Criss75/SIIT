package com.Criss75;

public class FestivalAtendee extends Thread {
    private FestivalGate festivalGate;
    private TicketType preferredTicketType;

    public FestivalAtendee(FestivalGate festivalGate){
        this.festivalGate = festivalGate;
        this.preferredTicketType = RandomUtil.getRandomTicketType();
    }

    @Override
    public void run() {
        try {
            sleep(RandomUtil.generateRandomDelay());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        festivalGate.vote(new TicketTypeNumber(preferredTicketType));
    }
}
