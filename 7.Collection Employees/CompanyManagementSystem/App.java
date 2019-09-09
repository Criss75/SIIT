package com.Criss75;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App
{
    public static void main( String[] args )
    {

/*
  Company has 10 employees on three levels: managers, seniors and juniors
 */
        Employee emp1 = new Employee("John Doe",12, "Senior", true);
        Employee emp2 = new Employee("Benny Hill",1, "Junior", false);
        Employee emp3 = new Employee("Cristopher Plummer",3, "Manager", true);
        Employee emp4 = new Employee("Maia Morgenstern",4, "Manager", false);
        Employee emp5 = new Employee("Bob Dylan",8, "Junior", false);
        Employee emp6 = new Employee("Rob Schneider", 7, "Manager", false);
        Employee emp7 = new Employee("Greta Garbo",5, "Senior", false);
        Employee emp8 = new Employee("Ion Dolanescu",4, "Senior", true);
        Employee emp9 = new Employee("Toma Caragiu",2, "Junior", true);
        Employee emp10 = new Employee("Bill Gates", 1, "Junior", true);

        List<Employee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);
        employees.add(emp5);
        employees.add(emp6);
        employees.add(emp7);
        employees.add(emp8);
        employees.add(emp9);
        employees.add(emp10);

        Collections.sort(employees, new ParkingCompare());
        System.out.println("List of all employees" +
                "\n-------------------------------------------" + employees +
                "\n===========================================");

        /*
         * list of all employees without parking sorted by seniority
         */
        List<Employee> empWithoutParking = new ArrayList<>();
        for (Employee employee : employees) {
            if (!employee.isHasParking()) {
                empWithoutParking.add(employee);
            }
        }
        System.out.println("List of employees without parking space sorted by seniority " +
                "\n-------------------------------------------" + empWithoutParking +
                "\n===========================================");

        /*
          list of all managers
         */
        List<Employee> managers = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getRole().equals("Manager")) {
                managers.add(employee);
            }
        }
        System.out.println("List of all managers " +
                "\n-------------------------------------------" + managers +
                "\n===========================================");

        /*
         * list of all seniors
         */
        List<Employee> seniors = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getRole().equals("Senior")) {
                seniors.add(employee);
            }
        }
        System.out.println("List of all seniors " +
                "\n-------------------------------------------" + seniors +
                "\n===========================================");

        /*
         * list of all juniors
         */
        List<Employee> juniors = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getRole().equals("Junior")) {
                juniors.add(employee);
            }
        }
        System.out.println("List of all juniors " +
                "\n-------------------------------------------" + juniors +
                "\n===========================================");

    }
}
