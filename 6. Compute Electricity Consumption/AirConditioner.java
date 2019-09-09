package com.Criss75;

/**
 * creates AirConditioner class that implements Appliance Interface
 */
public class AirConditioner implements Appliance {
    /**
     * the consumption per hour
     * if freezer is ON/OFF
     * If heater is ON/OFF
     */
    private float consumptionPerHour;
    private boolean freezer;
    private boolean heater;

    /**
     * Methods to START freezer
     */
    public void isFreezer() {
        System.out.println("Start freezer");
        this.consumptionPerHour = 25;
    }

    /**
     * Methods to START HEATER
     */
    public void isHeater() {
        System.out.println("Start heater");
        this.consumptionPerHour = 35;
    }

    @Override
    public void start() {
        System.out.println("Air conditioner is ON");
        this.consumptionPerHour = 20;
    }

    @Override
    public void stop() {
        System.out.println("Air conditioner is OFF");
        this.consumptionPerHour = 0;
    }

    @Override
    public float getConsumptionPerHour() {
       return this.consumptionPerHour;
    }
}

