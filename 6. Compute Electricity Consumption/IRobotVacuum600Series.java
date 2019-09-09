package com.Criss75;

public class IRobotVacuum600Series extends IRobotVacuum {
    private float consumptionPerHour;

    @Override
    void doQuickClean() {
        consumptionPerHour = 9;
        System.out.println("Do quick clean");
    }

    @Override
    void cleanPetHair() {
        consumptionPerHour = 12;
        System.out.println("Clean pet hair start");
    }

    @Override
    public void start() {
        this.consumptionPerHour = 3;
        System.out.println("Vacuum cleaner start");
    }

    @Override
    public void stop() {
        this.consumptionPerHour = 0;
        System.out.println("Robot stop");
    }

    @Override
    public float getConsumptionPerHour() {
        return consumptionPerHour;
    }
}
