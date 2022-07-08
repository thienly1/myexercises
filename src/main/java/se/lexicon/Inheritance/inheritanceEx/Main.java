package se.lexicon.Inheritance.inheritanceEx;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SystemDeveloper systemDeveloper1 = new SystemDeveloper("Mimi", LocalDate.of(2022, Month.JULY, 25), 12453, new String []{"MDO", "MCA", "LPA"},new String[]{"C++", "Java", "Python"} );

        systemDeveloper1.printDescription();

       String [] arrays= Arrays.copyOf(systemDeveloper1.getCertificates(), systemDeveloper1.getCertificates().length +1);
       arrays[systemDeveloper1.getCertificates().length]= "HDA";
       systemDeveloper1.setCertificates(arrays);

        systemDeveloper1.setLanguages(new String[]{"C++", "Java", "Python","Patron"});
       System.out.println("systemDeveloper1.getCertificates() = " + Arrays.toString(systemDeveloper1.getCertificates()));

         systemDeveloper1.calculateSalary();
        systemDeveloper1.printDescription();

        SalesPerson salesPerson = new SalesPerson("Ly Ta", LocalDate.of(2022, 5,2), 12455, new String[]{"a", "b", "c", "d"}, 3);
        salesPerson.printDescription();


         salesPerson.setAcquiredClients(5);
         salesPerson.calculateSalary();
        salesPerson.printDescription();

    }
}
