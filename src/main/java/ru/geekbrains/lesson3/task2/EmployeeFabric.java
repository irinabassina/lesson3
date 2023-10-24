package ru.geekbrains.lesson3.task2;

import java.util.Random;

public class EmployeeFabric {

    private static Random random = new Random();
    private static String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим",
            "Панкратий", "Рубен", "Герман" };
    private static String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков",
            "Копылов", "Горбунов", "Лыткин", "Соколов" };

    public static Worker generateWorker() {

        int age = random.nextInt(18, 69);
        int salary = random.nextInt(60000, 120001);

        return new Worker(
                surnames[random.nextInt(surnames.length)],
                names[random.nextInt(names.length)],
                age, salary);
    }

    public static Freelancer generateFreelancer() {

        int age = random.nextInt(18, 69);
        int salaryRate = random.nextInt(400, 801);

        return new Freelancer(
                surnames[random.nextInt(surnames.length)],
                names[random.nextInt(names.length)],
                age, salaryRate);
    }

    /**
     * TO DO: Переработать метод generateEmployees, метод должен генерировать
     * рабочих
     * разных типов (Worker, Freelancer) в рамках домашней работы
     * 
     * @param count
     * @return
     */
    public static Employee[] generateEmployees(int count) {
        Employee[] employees = new Employee[count];
        for (int i = 0; i < count; i++) {
            if (random.nextInt(2) == 0) {
                employees[i] = generateWorker();
            } else {
                employees[i] = generateFreelancer();
            }
        }
        return employees;
    }
}