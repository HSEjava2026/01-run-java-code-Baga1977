package ru.hse.lab1.second;

/**
 * Класс, представляющий человека.
 * @author Соколов Б.А.
 * @version 1.0
 * @since 2026
 */
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
}