package com.company;

import java.util.Random;

//  Задание 1. Случайности складываются
//- Создать массив на 10 чисел типа int
//- Заполнить массив случайными числами, используя класс Random и функцию nextInt()
//- Вывести массив на экран одной строкой, разделив элементы пробелом
//- Посчитать сумму всех элементов и вывести на экран
//- Найти минимальный элемент и вывести на экран его индекс в массиве и значение
public class Task1 {
    public static void task1() {
        int[] ints = new int[10];
        Random random = new Random();
        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt();
            System.out.print(ints[i] + " ");
        }
        System.out.println();
        int sum = 0;
        for (int el : ints) {
            sum += el;
        }
        System.out.println("Сумма = " + sum);

        int min = ints[0];
        int index = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] < min) {
                min = ints[i];
                index = i;
            }
        }
        System.out.println("Минимальное значение = " + min);
        System.out.println("Индекс элемента с минимальным значением = " + index);
    }
}
