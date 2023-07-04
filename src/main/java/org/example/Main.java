package org.example;

import ru.netology.javaqa.javaqa5.service.VacationService;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        VacationService service = new VacationService();
        System.out.println(service.calculate(100_000, 60_000, 150_000));
    }
}