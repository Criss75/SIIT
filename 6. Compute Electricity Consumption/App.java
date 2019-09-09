package com.Criss75;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        IRobotVacuum iRobot = new IRobotVacuum600Series();
        iRobot.start();
        iRobot.doQuickClean();
//        ((Appliance) iRobot).stop();
        System.out.println(iRobot.getConsumptionPerHour());

//        Appliance a = new Appliance(); // This must NOT compile
        // This must compile - serial number is passed via constructor
        SamsungSmartFridge fridge = new SamsungSmartFridge("SN-SMSG009");
        fridge.start();
        System.out.println(fridge.getConsumptionPerHour());// consumption should be 10w
        fridge.turnOnPowerFreezer();
        System.out.println(fridge.getConsumptionPerHour());// consumption should be 20w

        Microwave microwave = new Microwave();
        microwave.start();
        microwave.setPower(2);
        System.out.println((microwave.getConsumptionPerHour()));

        AirConditioner airconditioner = new AirConditioner();
        airconditioner.isFreezer();
        System.out.println(airconditioner.getConsumptionPerHour());

        System.out.println(iRobot.getConsumptionPerHour() + fridge.getConsumptionPerHour() +
                microwave.getConsumptionPerHour() + airconditioner.getConsumptionPerHour() +
                " is the total consumption for all appliances/hour");

    }
}
