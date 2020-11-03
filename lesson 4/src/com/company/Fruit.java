package com.company;

import java.util.Arrays;
import java.util.Random;
//1. Фруктовая неоднозначность
//Создать класс Fruit со свойством "вес" типа int и методом toString
//Создать наследники:
//Apple - с дополнительным свойством цвет (красное, зеленое, желтое) - String
//Orange - с дополнительном свойством толщина кожуры - int от 0 до 20
//Pineapple - с дополнительным свойством - высота хвоста - int, от 5 до 20
//
//переопределить во всех фруктах toString, чтобы выводил все свойства фрукта и тип фрукта (яблоко, апельсин, ананас)
//
//Создать метод getRandomFruit - которое возвращает случаный фрукт со случайными характеристиками.
//Создать массив типа Fruit, заполнить его 4 разными случаными фруктами и вывести их на экран
public class Fruit {
    protected int weight;
    static Random random = new Random();

    protected Fruit(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "weight=" + weight +
                '}';
    }

    static Fruit getRandomFruit() {
        return switch (Math.abs(random.nextInt()) % 3) {
            case 0 -> apple();
            case 1 -> orange();
            case 2 -> pineapple();
            default -> null;
        };
    }

    static Fruit apple() {
        String color = switch (Math.abs(random.nextInt()) % 3) {
            case 0 -> "красное";
            case 1 -> "жёлтое";
            case 2 -> "зелёное";
            default -> throw new IllegalArgumentException();
        };
        return new Apple(Math.abs(random.nextInt()), color);
    }

    static Fruit orange() {
        return new Orange(Math.abs(random.nextInt()), Math.abs(random.nextInt(20)));
    }

    static Fruit pineapple() {
        return new Pineapple(Math.abs(random.nextInt()), Math.abs(random.nextInt(16)+5));
    }

    public static void main(String[] args) {
        Fruit[] fruits = new Fruit[4];

        for (int i=0; i < fruits.length; i++) {
            fruits[i] = Fruit.getRandomFruit();
        }
        System.out.println(Arrays.toString(fruits));
    }


}
