package org.example;

/**
 * Фрилансер (работник с почасовой оплатой)
 * TODO: Доработать в рамках домашней работы
 */

//1.Доработать класс Freelancer, при желании можно разработать и свой собтственный тип сотрудника.
// Формула расчета среднемесячной заработной платы может быть такова:
// «среднемесячная заработная плата = 20.8 * 8 * почасовая ставка»

//2.Переработать метод generateEmployees, метод должен создавать случайного сотрудника
// (Worker, Freelancer или любого другого). Метод должен быть один!

//3.Придумать свой собственный компаратор (Возможно отсортировать сотрудников по возрасту?
// Тогда добавьте соответствующее состояние на уровне ваших классов).

//4.Продемонстрировать сортировку объектов различного типа с использованием собственного компаратора.
public class Freelancer extends Employee {
    public Freelancer(String surName, String name, Integer old, double salary) {
        super(surName, name,old, salary);
    }
    public double calculateSalary() {
        return salary/20.8/8;
    }

    @Override
    public String toString() {
        return String.format("%s %s - %d лет; Фрилансер;Ставка: %.2f руб.; Среднемесячная заработная плата: %.2f руб.",
                surName, name,old, calculateSalary(),salary);
    }
}