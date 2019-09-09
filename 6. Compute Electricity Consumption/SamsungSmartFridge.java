package com.Criss75;

/**
 * creates a class for Samsung Smart Fridge
 */
public class SamsungSmartFridge extends Fridge {
    /**
     * the consumption per hour
     * sets the serial number
     */
    private String serialNumber;
    private float consumptionPerHour;

    SamsungSmartFridge(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public void start() {
        this.consumptionPerHour = 10;
        System.out.println("Fridge is on");
    }

    @Override
    public void stop() {
        consumptionPerHour = 0;
        System.out.println("Fridge is off");
    }

    @Override
    public float getConsumptionPerHour() {
        return consumptionPerHour;
    }

    @Override
    public void turnOffPowerFreezer() {
        consumptionPerHour = 0;
        System.out.println("Stop power freezer");
    }

    @Override
    public void turnOnPowerFreezer() {
        consumptionPerHour = 20;
        System.out.println("Start power freezer");
    }
}