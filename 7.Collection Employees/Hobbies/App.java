package com.Criss75;

import java.util.*;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        List<String> footballAddresses = new ArrayList<>();
        footballAddresses.add("CD Loga 28");
        footballAddresses.add("Prine 44");

        List<String> tennisAddresses = new ArrayList<>();
        tennisAddresses.add("MF Goga 28");
        tennisAddresses.add("Prince 24");

        List<String> pingPongAddresses = new ArrayList<>();
        pingPongAddresses.add("Club Ping 98");
        pingPongAddresses.add("FC porto 23");

        List<String> handballAddresses = new ArrayList<>();
        handballAddresses.add("sc Run 21");
        handballAddresses.add("Pride 45");

        Hobbies football = new Hobbies("Football", 2, footballAddresses);
        Hobbies tennis = new Hobbies("Tennis", 3, tennisAddresses);
        Hobbies pingPong = new Hobbies("Ping Pong", 3, pingPongAddresses);
        Hobbies handball = new Hobbies("Handball", 1, handballAddresses);

        List<Hobbies> johnHobbies = new ArrayList<>();
        johnHobbies.add(football);
        johnHobbies.add(tennis);
        Person john = new Person("John Doe", johnHobbies);

        List<Hobbies> mikeHobbies = new ArrayList<>();
        mikeHobbies.add(football);
        mikeHobbies.add(pingPong);
        Person mike = new Person("Mike Blue", mikeHobbies);

        List<Hobbies> andyHobbies = new ArrayList<>();
        andyHobbies.add(handball);
        andyHobbies.add(pingPong);
        Person andy = new Person("Andy Gore", andyHobbies);

        List<Hobbies> bobHobbies = new ArrayList<>();
        bobHobbies.add(football);
        bobHobbies.add(handball);
        Person bob = new Person("Bob Smith", bobHobbies);

        Map<Person, List<Hobbies>> newMap = new HashMap<>();
        newMap.put(mike, mikeHobbies);
        newMap.put(andy, andyHobbies);
        newMap.put(john, johnHobbies);
        newMap.put(bob, bobHobbies);

//        Set <Person> key = newMap.keySet();
////        for (Person p:key) {
//            System.out.println("\n" + key + "" + newMap.get(key));
////        }
        for (Map.Entry<Person, List<Hobbies>> entry : newMap.entrySet()) {
            System.out.println(entry.getKey() + "" + entry.getValue());
        }
    }
}
