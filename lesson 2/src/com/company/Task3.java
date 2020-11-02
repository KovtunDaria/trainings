package com.company;

//  Задание 3. Противоположности притигиваются
//- Создайте два массива на 7 элементов.
//- Используюте функцию Random.nextInt() чтобы полностью заполнить два массива: в первом массиве должно оказаться ровно 7 положительных чисел, во втором - ровно 7 отрицательных.
//  Подсказка: используйте цикл while во время генерации случайных чисел и проверку на заполненность массива, прежде, чем записывать туда элемент.
//- Выведите оба массива на экран
//- Создайте новый массив на 7 элементов.
//  Значением на каждой позиции является суммой значений на позициях с тем же индексом из положительного и отрицательного массива.

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void task3() {
        int[] positives = new int[7];
        int[] negatives = new int[7];
        Random random = new Random();

        int positiveIndex = 0;
        int negativeIndex = 0;
        while (positiveIndex < positives.length || negativeIndex < negatives.length) {
            int value = random.nextInt();
            if (value > 0 && positiveIndex < positives.length) {
                positives[positiveIndex] = value;
                positiveIndex++;
            } else if (negativeIndex < negatives.length) {
                negatives[negativeIndex] = value;
                negativeIndex++;
            }
        }

        System.out.println(Arrays.toString(positives));
        System.out.println(Arrays.toString(negatives));

        int[] sumArray = new int[7];
        for (int el : sumArray) {
            sumArray[el] = positives[el] + negatives[el];
        }
    }
}
