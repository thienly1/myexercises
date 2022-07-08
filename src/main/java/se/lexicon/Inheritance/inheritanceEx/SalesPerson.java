package se.lexicon.Inheritance.inheritanceEx;

import java.time.LocalDate;
import java.util.Arrays;

public class SalesPerson extends Employee {

    private String[] clients ;
    private int acquiredClients ;

    public SalesPerson(String name, LocalDate dateHired, int id, String[] clients, int acquiredClients) {
        super(name, dateHired, id);
        this.clients = clients;
        this.acquiredClients = acquiredClients;
        calculateSalary();
    }
    public String[] getClients() {
        return clients;
    }

    public void setClients(String[] clients) {
        this.clients = clients;
    }

    public int getAcquiredClients() {
        return acquiredClients;
    }

    public void setAcquiredClients(int acquiredClients) {
        this.acquiredClients = acquiredClients;
    }

    public void calculateSalary(){
        double salesPersonSalary;
        double maintainClientsBonus;
        double acquiredClientsBonus;
        salesPersonSalary = BASE_SALARY;
        maintainClientsBonus = clients.length*500;
        acquiredClientsBonus = acquiredClients*1000;
        salesPersonSalary +=maintainClientsBonus;
        salesPersonSalary +=acquiredClientsBonus;
        setSalary(salesPersonSalary);
    }
    public void printDescription(){
        System.out.println("Sale person: " + getName() + " has id: " + getId() + " has salary: "+ getSalary()+ " has clients: " + Arrays.toString(getClients()));
    }



}
