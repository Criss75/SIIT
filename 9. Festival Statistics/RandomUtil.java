package com.Criss75;

import java.util.Random;

public class RandomUtil {

    static TicketType getRandomTicketType(){
        TicketType[] ticketType = TicketType.values();
        Random randomizer = new Random();
        int index = randomizer.nextInt(ticketType.length);
        return ticketType[index];
    }

    static long generateRandomDelay(){
        Random randomizer = new Random();
        int delay = randomizer.nextInt(60);
        return delay * 1000;
    }
}
