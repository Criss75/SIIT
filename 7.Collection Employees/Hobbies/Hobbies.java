package com.Criss75;

import java.util.List;

public class Hobbies {
    private String hobbies;
    private int freq;
    private List<String> address;

    public Hobbies(String hobbies, int freq, List<String> address) {
        this.hobbies = hobbies;
        this.freq = freq;
        this.address = address;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    public int getFreq() {
        return freq;
    }

    public void setFreq(int freq) {

        this.freq = freq;
    }

    public List<String> getAddress() {

        return address;
    }

    public void setAddress(List<String> address) {

        this.address = address;
    }

    @Override
    public String toString() {
        return "\n"+hobbies +
                "\nfreq=" + freq +
                ", address=" + address +
                '}';
    }
}
