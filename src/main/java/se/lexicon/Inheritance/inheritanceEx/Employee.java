package se.lexicon.Inheritance.inheritanceEx;

import java.time.LocalDate;

/**
 * Practice: Employee management
 * • Create a new class called Employee.
 * • Create two classes SystemDeveloper and SalesPerson that should inherit from employee.
 * • When hired each employee has a base salary of 25 000 a month.
 * • SystemDevelopers get 1000 extra for each certificate they have and 1500 extra for each
 * programming language they work with.
 * • SalesPersons get 500 extra for each client they maintain and 1000 extra for each new client they
 * have aquired.
 * • Create method calculateSalary() in Super class and override this method in its subclasses.
 * • Also make a toString implementation for SystemDevelopers and SalesPerson.
 * • Whenever they aquire new clients, certificates and languages the salary should update.
 */

public abstract class Employee {

    public static double BASE_SALARY = 25_000;

    private String name;
    private LocalDate dateHired;
    private int id;
    private double salary;

    public Employee(String name, LocalDate dateHired, int id) {
        this.name = name;
        this.dateHired = dateHired;
        this.id = id;

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateHired() {
        return dateHired;
    }

    public void setDateHired(LocalDate dateHired) {
        this.dateHired = dateHired;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public abstract void calculateSalary();
}
