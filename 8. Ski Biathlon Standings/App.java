package com.Criss75;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App
{
        public static void main( String[] args )
    {
        List<Athletes> participants = readAthletsFromCSV ("C:\\Users\\Lenovo\\Desktop\\athlets.csv");
        Collections.sort(participants, new TimeComparator());
        System.out.println("Winner - " + participants.get(0));
        System.out.println("Runner-up - " + participants.get(1));
        System.out.println("Third Place - " + participants.get(2));
    }

    private static List<Athletes> readAthletsFromCSV(String fileName){
        List<Athletes> athlets = new ArrayList<>();
        Path pathToFile = Paths.get(fileName);

        try(BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.US_ASCII)){
            String line = br.readLine();
            while(line != null) {
                String[] attributes = line.split(",");
                Athletes athlets1 = createAthlete(attributes);
                athlets.add(athlets1);
                line = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return athlets;
    }

    private static Athletes createAthlete(String[] line) {
        String athleteNumber = line[0];
        String athleteName = line[1];
        String countryCode = line[2];
        String skiTimeResult = line[3];
        String firstShootingRange = line[4];
        String secondShootingRange = line[5];
        String thirdShootingRange = line[6];

        return new Athletes (athleteNumber, athleteName, countryCode, skiTimeResult, firstShootingRange,
                secondShootingRange, thirdShootingRange);
    }

}
