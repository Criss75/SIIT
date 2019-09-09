package com.Criss75;

import java.util.List;

public class Person {
    private String personName;
    private List<Hobbies> hobbies;

    public Person(String personName, List<Hobbies> hobbies) {
        this.personName = personName;
        this.hobbies = hobbies;
    }

    public String getPersonName() {

        return personName;
    }

    public void setPersonName(String personName) {

        this.personName = personName;
    }

    public List<Hobbies> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<Hobbies> hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public String toString() {
        return "\nName " + personName;
    }
}
