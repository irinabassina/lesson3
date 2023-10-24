package ru.geekbrains.lesson3.task2;

/**
 * Фрилансер (работник с почасовой оплатой)
 * TO DO: Доработать в рамках домашней работы
 */
public class Freelancer extends Employee {

    /**
     * Почасовая ставка заработной платы
     */
    protected double salaryRate;

    public Freelancer(String surName, String name, int age, double salaryRate) {
        super(surName, name, age, 0);
        this.salaryRate = salaryRate;
        this.salary = calculateSalary();
    }


    @Override
    public double calculateSalary() {
        return 20.8*8*salaryRate;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d; Фрилансер; Почасовая ставка: %.2f руб.; Среднемесячная заработная плата: %.2f руб.",
                surName, name, age, salaryRate, calculateSalary());
    }
}
