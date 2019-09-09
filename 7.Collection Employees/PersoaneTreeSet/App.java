package com.Criss75;

import java.util.TreeSet;

public class App
{
    public static void main( String[] args )
    {
        Person doe_john = new Person("Doe John", 23);
        Person smith_john = new Person("Smith John", 44);
        Person nicholson_jack = new Person ("Nicholson Jack", 56);
        Person jackson_michael = new Person("Jackson Michael", 43);
        Person travolta_john = new Person("Travolta John", 44);
        Person bridges_jeff = new Person ("Bridges Jeff", 53);

        TreeSet <Person> nameComp = new TreeSet<>(new NameComparator());
        nameComp.add(doe_john);
        nameComp.add(smith_john);
        nameComp.add(nicholson_jack);
        nameComp.add(jackson_michael);
        nameComp.add(travolta_john);
        nameComp.add(bridges_jeff);

        for (Person p:nameComp
             ) {
            System.out.println(p);
        }

        System.out.println("+++++++++++++++++");

        TreeSet <Person> ageComp = new TreeSet<>(new AgeComparator());
        ageComp.add(doe_john);
        ageComp.add(smith_john);
        ageComp.add(nicholson_jack);
        ageComp.add(jackson_michael);
        ageComp.add(travolta_john);
        ageComp.add(bridges_jeff);

        for (Person p:ageComp
        ) {
            System.out.println(p);
        }
    }
}
