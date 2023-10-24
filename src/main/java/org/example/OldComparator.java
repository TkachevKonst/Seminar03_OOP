package org.example;

import java.util.Comparator;

public class OldComparator implements Comparator<Employee> {
    public int compare(Employee o1, Employee o2) {

        return Integer.compare(o1.old, o2.old);
    }
}
