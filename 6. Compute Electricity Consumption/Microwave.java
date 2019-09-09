package com.Criss75;

/**
 * creates a class for Microwave
 */
public class Microwave implements Appliance{
    /**
     * the consumption per hour
     */
    private float consumptionPerHour;

    float setPower (int powerLevel) {
        System.out.println("Set power level (1 to 3)");
        if (powerLevel == 1) {
            return consumptionPerHour = 10;
        }
        if (powerLevel == 2) {
            return consumptionPerHour = 20;
        }
        if (powerLevel == 3) {
            return consumptionPerHour =30;
        } return consumptionPerHour;
    }

    @Override
    public void start() {
        System.out.println("Microwave is on");
        consumptionPerHour = 5;
    }

    @Override
    public void stop() {
        System.out.println("Microwave is off");
        consumptionPerHour = 0;
    }

    @Override
    public float getConsumptionPerHour() {
        return consumptionPerHour;
    }
}
