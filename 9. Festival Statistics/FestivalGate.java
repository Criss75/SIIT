package com.Criss75;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FestivalGate {
    private List<TicketTypeNumber> ticketTypeNumbers = new ArrayList<>();

    public void vote(TicketTypeNumber ticketTypeNumber){
        System.out.println(ticketTypeNumber.getTycketType().name());
        this.ticketTypeNumbers.add(ticketTypeNumber);
    }

    public String getStatistics(){
        Map<TicketType, Integer> results = new HashMap<>();
        for(TicketTypeNumber ticketTypeNumber: ticketTypeNumbers){
            if(results.containsKey(ticketTypeNumber.getTycketType())){
                results.put(ticketTypeNumber.getTycketType(), results.get(ticketTypeNumber.getTycketType()) + 1);
            } else{
                results.put(ticketTypeNumber.getTycketType(), 1);
            }
        }

        String result = "";

        for(TicketType ticketType: results.keySet()){
            result = result + ticketType.name() + ":" + results.get(ticketType) + "\n";
        }

        return result;
    }

}
