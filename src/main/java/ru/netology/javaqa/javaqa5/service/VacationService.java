package ru.netology.javaqa.javaqa5.service;
public class VacationService {

    public int calculate(int income, int expenses, int threshold) {
        int count = 0;
        int money = 0;
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) {
                count++;
                money = (money - expenses) /3;
            } else {
                money = money + income;
                money = money - expenses;
            }
        }
        return count;
    }
}
