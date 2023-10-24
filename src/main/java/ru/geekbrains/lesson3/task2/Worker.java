package ru.geekbrains.lesson3.task2;

/**
 * Рабочий (работает с 9 до 18,
 * получает фиксированную заработную плату)
 */
public class Worker extends Employee {


    public Worker(String surName, String name, int age, double salary) {
        super(surName, name, age, salary);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d; Рабочий; Среднемесячная заработная плата: %.2f руб.",
                surName, name, age, calculateSalary());
    }
}
