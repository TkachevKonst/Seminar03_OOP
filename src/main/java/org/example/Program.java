package org.example;

import java.util.Arrays;

public class Program {

    public static void main(String[] args) {

        Employee[] staffers = EmployeeFabric.generateEmployees(25);
        for (Employee staffer : staffers) {
            System.out.println(staffer);
        }

        System.out.println();
        System.out.println("***");
        System.out.println();

        Arrays.sort(staffers/*, new SalaryComparator()*/);

        for (Employee staffer : staffers) {
            System.out.println(staffer);
        }

    }
}
