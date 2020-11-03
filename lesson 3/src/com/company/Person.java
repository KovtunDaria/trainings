package com.company;

import java.util.Random;

//Задание 1. Цифровая персонализация
//- Создать класс Person с двумя полями типа String: firstName, lastName
//- создать один публичный конструктор с аргументами firstName и lastName. В конструкторе инициализировать поля класса значениями из аргументов.
//- Для каждого поля определить только getter'ы (без setter'ов) - getFirstName, getLastName , который возвращают соответствующее поле
//- Создать метод toString() который возвращает человека в формате "Фамилия, Имя"
//
// в методе main
//- Создать массив типа String на 5 элементов - туда записать какие-нибудь реальные имена.
//- Создать массив типа String на 6 элементов - туда записать какие-нибудь реальные фамилии
//- Создать массив типа Person на 50 элементов - туда записать людей со случайными фамилиями из массивов выше
//- Вывести всех людей из массива в формате "Человек №{индекс в массиве} - Фамилия, Имя"
public class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public static void main(String[] args) {
        Random random = new Random();
        final String[] names = new String[]{"Анна", "Баря", "Вера", "Дина", "Града"};
        final String[] surnames = new String[]{"Аова", "Баова", "Ваова", "Даова", "Гаова", "Енисеева"};
        Person[] people = new Person[50];
        for (int i=0; i < people.length; i++) {
            people[i] = new Person(names[random.nextInt(names.length)], surnames[random.nextInt(surnames.length)]);
        }
        printPeople(people);
    }

    static void printPeople(Person[] people) {
        for (int i=0; i < people.length; i++) {
            System.out.print("Человек №" + i + " — ");
            System.out.println(people[i].toString());
        }
    }

    @Override
    public String toString() {
        return  lastName + ", " + firstName;
    }
}
