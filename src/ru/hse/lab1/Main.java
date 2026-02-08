package ru.hse.lab1;

import ru.hse.lab1.second.Person;

/**
 * Главный класс приложения.
 * @author Соколов Б.А.
 * @version 1.0
 * @since 2026
 */
public class Main {
    public static void main(String[] args) {
        Person person = new Person("Иван", 20);
        System.out.println("Имя: " + person.getName());
        System.out.println("Возраст: " + person.getAge());
    }
}