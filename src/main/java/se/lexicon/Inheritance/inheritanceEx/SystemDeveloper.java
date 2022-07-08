package se.lexicon.Inheritance.inheritanceEx;

import java.time.LocalDate;
import java.util.Arrays;

public class SystemDeveloper extends Employee {

      private String [] certificates;
      private  String [] languages;

    public SystemDeveloper(String name, LocalDate dateHired, int id, String[] certificates, String[] languages) {
        super(name, dateHired, id);
        this.certificates = certificates;
        this.languages = languages;
        calculateSalary();
    }

    public String[] getCertificates() {
        return certificates;
    }

    public void setCertificates(String[] certificates) {
        this.certificates = certificates;

    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }
    @Override
    public void calculateSalary(){
        double systemDeveloperSalary;
        double certificatesBonus;
        double languagesBonus;
        systemDeveloperSalary = Employee.BASE_SALARY;
        certificatesBonus = certificates.length*1000;
        languagesBonus = languages.length*1500;
        systemDeveloperSalary += certificatesBonus;
        systemDeveloperSalary+= languagesBonus;
        setSalary(systemDeveloperSalary);
    }
    public void printDescription(){
        System.out.println("System Developer: " + getName()+ " is hired on " + getDateHired() + " has salary : " + getSalary() + " and certificates: " + Arrays.toString(getCertificates()));
    }

    @Override
    public String toString() {
        return "SystemDeveloper{" +
                "certificates=" + Arrays.toString(certificates) +
                ", languages=" + Arrays.toString(languages) +
                '}';
    }
}
