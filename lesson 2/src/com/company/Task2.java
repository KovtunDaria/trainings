package com.company;

import java.util.Arrays;
import java.util.Random;
//  Задание 2. Случайности расходятся
//- Создать массив на 5 элементов типа int и вывести на экран
//- Разделить на два других - в первом массиве только четные числа, во втором - только нечетные. Оба массива вывести на экран.
//- Найти среднее значение в каждом массива и вывести их на экран

public class Task2 {
    public static void task2() {
        int[] ints = new int[5];
        for (int i = 0; i < ints.length; i++) {
            Random random = new Random();
            ints[i] = random.nextInt();
        }
        System.out.println(Arrays.toString(ints));

        int evens = 0;
        int odds = 0;
        for (int el : ints) {
            if (el % 2 != 0) {
                odds++;
            } else {
                evens++;
            }
        }

        int[] evenInts = new int[evens];
        int[] oddInts = new int[odds];

        for (int el : ints) {
            if (el % 2 != 0) {
                oddInts[odds-1] = el;
                odds--;
            } else {
                evenInts[evens-1] = el;
                evens--;
            }
        }

        System.out.println(Arrays.toString(oddInts));
        System.out.println(Arrays.toString(evenInts));

        int oSum = 0;
        for (int el : oddInts) {
            oSum += el;
        }
        float averageOddInts = (float)oSum/oddInts.length;
        System.out.println("Среднее нечётных = " + averageOddInts);

        int eSum = 0;
        for (int el : evenInts) {
            eSum += el;
        }
        float averageEvenInts = (float)eSum/evenInts.length;
        System.out.println("Среднее чётных = " + averageEvenInts);
    }

}
