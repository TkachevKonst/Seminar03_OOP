package org.example;
/**
 * Рабочий (работает с 9 до 18,
 * получает фиксированную заработную плату)
 */
public class Worker extends Employee {


    public Worker(String surName, String name,Integer old, double salary) {
        super(surName, name, old, salary);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s - %d лет; Рабочий; Среднемесячная заработная плата: %.2f руб.",
                surName, name,old, calculateSalary());
    }
}