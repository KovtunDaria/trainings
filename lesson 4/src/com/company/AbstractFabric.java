package com.company;

import java.util.Arrays;
import java.util.Random;

//2. Фруктовая абстрактность
//Создать класс AbstractFabric с одним абстрактным методом makeFruit(), который возвращает фрукт.
//Создайте следующие подклассы:
//
//ThinOrangeFactory - которая создает только апельсины с толщиной кожуры от 1 до 5
//RedApplesFactory - которая создает только красные яблоки
//GreenApplesFactory - которая создает только зеленые яблоки.
//LongPineapplesFactory - которая создает только ананасы с длиной хвоста больше 10
//
//Создайте массив на 10 элементов и поместите туда 10 случайных фабрик одного из 4 описанных выше типов.
//Создайте массив типа Fruit на 20 элементов и заполните его фруктами из всех  фабрик - по 2 фрукта от одной фабрики.
public abstract class AbstractFabric {
    protected static Random random = new Random();

    abstract Fruit makeFruit();

    static int positiveRandom(int number) {
        return Math.abs(random.nextInt(number));
    }

    public static void main(String[] args) {
        AbstractFabric[] fabrics = new AbstractFabric[10];
        for (int i = 0; i < fabrics.length; i++) {
            fabrics[i] = getRandomFabric();
        }
        Fruit[] fruits = new Fruit[20];
        for (int i = 0; i < fabrics.length; i++) {
            fruits[i] = fabrics[i].makeFruit();
            fruits[i+10] = fabrics[i].makeFruit();
        }
        System.out.println(Arrays.toString(fruits));
    }

    static AbstractFabric getRandomFabric() {
        return switch (positiveRandom(4)) {
            case 0 -> new ThinOrangeFactory();
            case 1 -> new GreenApplesFactory();
            case 2 -> new RedApplesFactory();
            case 3 -> new LongPineapplesFactory();
            default -> null;
        };
    }
}
