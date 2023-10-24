package org.example;

import java.util.Random;

public class EmployeeFabric {

    private static Random random = new Random();

    public static Worker generateWorker(){
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };

        int salary = random.nextInt(60000, 120001);
        int old = random.nextInt(25,30);
        return new Worker(
                surnames[random.nextInt(surnames.length)],
                names[random.nextInt(names.length)],
                old,
                salary);
    }
    public static Freelancer generateFreelancer(){
        String[] names = new String[] { "Вячеслав", "Дмитрий", "Игорь", "Вадим", "Владислав", "Яков", "Александр", "Нурлан", "Игорь", "Константин"};
        String[] surnames = new String[] { "Абрамов", "Фомин", "Шевчук", "Тальвик", "Быстрых", "Грицук", "Гераськин", "Телегин", "Ульянов", "Милинчук" };
        int salary = random.nextInt(60000, 120001);
        int old = random.nextInt(25,30);
        return new Freelancer(
                surnames[random.nextInt(surnames.length)],
                names[random.nextInt(names.length)],
                old,
                salary);
    }


    /**
     * TODO: Переработать метод generateEmployees, метод должен генерировать рабочих
     *  разных типов (Worker, Freelancer) в рамках домашней работы
     * @param count
     * @return
     */
    public static Employee[] generateEmployees(int count){
        Employee[] staffers = new Employee[count];
        for (int i = 0; i < count; i++){
            int r = random.nextInt(2);
            if (r == 1){
                staffers[i] = generateWorker();
            }else {staffers[i] = generateFreelancer();}
        }
        return staffers;
    }
}
