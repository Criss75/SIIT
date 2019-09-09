package com.Criss75;

import static java.lang.Integer.parseInt;

public class Athletes {
    private String athleteNumber;
    private String athleteName;
    private String countryCode;
    private String skiTimeResult;
    private String firstShootingRange;
    private String secondShootingRange;
    private String thirdShootingRange;
//    private int result;

    public static int skiTimeResultInSeconds (String skiTimeResult) {
        int minutesToSeconds = parseInt(skiTimeResult.split(":")[0]) * 60;
        int seconds = parseInt(skiTimeResult.split(":")[1]);
        return minutesToSeconds + seconds;
    }

    public static int totalPenalties(String firstShootingRange, String secondShootingRange,
                              String thirdShootingRange) {
        String allShoots = firstShootingRange + secondShootingRange + thirdShootingRange;
        int penaltyPerShoot = 0;
        for (int i = 0; i < allShoots.length(); i++) {
            if (allShoots.charAt(i) == 'o') {
                penaltyPerShoot+=10;
            }
        }
        return penaltyPerShoot;
    }

    Athletes(String athleteNumber, String athleteName, String countryCode, String skiTimeResult,
            String firstShootingRange, String secondShootingRange, String thirdShootingRange) {
        this.athleteNumber = athleteNumber;
        this.athleteName = athleteName;
        this.countryCode = countryCode;
        this.skiTimeResult = skiTimeResult;
        this.firstShootingRange = firstShootingRange;
        this.secondShootingRange = secondShootingRange;
        this.thirdShootingRange = thirdShootingRange;
    }

    public String getAthleteNumber() {
        return athleteNumber;
    }

    public void setAthleteNumber(String athleteNumber) {
        this.athleteNumber = athleteNumber;
    }

    public String getAthleteName() {
        return athleteName;
    }

    public void setAthleteName(String athleteName) {
        this.athleteName = athleteName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getSkiTimeResult() {
        return skiTimeResult;
    }

    public void setSkiTimeResult(String skiTimeResult) {
        this.skiTimeResult = skiTimeResult;
    }

    public String getFirstShootingRange() {
        return firstShootingRange;
    }

    public void setFirstShootingRange(String firstShootingRange) {
        this.firstShootingRange = firstShootingRange;
    }

    public String getSecondShootingRange() {
        return secondShootingRange;
    }

    public void setSecondShootingRange(String secondShootingRange) {
        this.secondShootingRange = secondShootingRange;
    }

    public String getThirdShootingRange() {
        return thirdShootingRange;
    }

    public void setThirdShootingRange(String thirdShootingRange) {
        this.thirdShootingRange = thirdShootingRange;
    }

    public int getResult() {
        return skiTimeResultInSeconds(skiTimeResult) + totalPenalties(firstShootingRange,
                secondShootingRange,thirdShootingRange);
    }

    @Override
    public String toString() {
        return  athleteName + " " + getResult()/60 + ":" + getResult()%60 + " (" + getSkiTimeResult() + " + " +
                totalPenalties(firstShootingRange, secondShootingRange, thirdShootingRange) + ")";
    }
}
