package com.Criss75;

public class Employee {
    private String name;
    private int seniority;
    private String role;
    private boolean hasParking;

    Employee(String name, int seniority, String role, boolean hasParking) {
        this.name = name;
        this.seniority = seniority;
        this.role = role;
        this.hasParking = hasParking;
    }

    int getSeniority() {
        return seniority;
    }

    String getRole() {
        return role;
    }

    boolean isHasParking() {
        return hasParking;
    }

    @Override
    public String toString() {
        return  "\nName='" + name + '\'' +
                ", seniority=" + seniority +
                ", role='" + role + '\'' +
                ", hasParking=" + hasParking;
    }
}
