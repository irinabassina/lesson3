package ru.geekbrains.lesson3.task2;

import java.util.Comparator;

public class AgeComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {

        return Integer.compare(o2.age, o1.age);
    }
}
