package com.company;

import com.company.ArrayList.MyArrayList;
import com.company.ArrayList.MyArrayStoreException;
import com.company.Bicycle.Bicycle;

import java.util.ArrayList;
import java.util.Random;
//- Создайте 11 случайных велосипедов и попытайтесь их добавить их в новый экземпляр MyArrayList.
// Если какой-то велосипед добавить не получилось - то в лог выведите какой велосипед не добавился.
//- Проверьте, что все методы работают правильно:
//  1. Возьмите случайное число от 0 до 50.
//  2. Удалите из коллекции все велосипеды со скоростью меньше этого случайного числа.

//- Теперь создайте новый экземпляр MyArrayList
//- Добавьте в него 10 случайных чисел от 1 до 10
//- удалите все четные числа
//- Выведите оставшиеся числа на экран.
public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("1. Велосипеды");
        MyArrayList<Bicycle> bicycleList = new MyArrayList<>();
        String[] modelNames = {"Atom", "Navigator", "Forward", "Slash", "Dasha", "Shkolnik"};
        Bicycle[] bicycles = new Bicycle[11];
        for (int i = 0; i < 11; i++) {
            bicycles[i] = new Bicycle(modelNames[random.nextInt(modelNames.length)], random.nextInt(46) + 5);
            try {
                bicycleList.add(bicycles[i]);
            } catch (MyArrayStoreException e) {
                System.err.println("Нельзя добавить велосипед под номером " + i + ": " + bicycles[i].toString());
            }
        }
        System.out.println("Количество велосипедов в списке: " + bicycleList.size());

        int randomDigit = new Random().nextInt(51);
        System.out.println("Удаляются все велосипеды с максимальной скоростью менее чем " + randomDigit + " км/ч");
        for (int i = 0; i < bicycleList.size(); i++) {
            if (bicycles[i].getMaxSpeed() < randomDigit) {
                bicycleList.remove(bicycles[i]);
                System.out.println("Элемент \"" + bicycles[i] + "\" был удалён");
            }
        }
        System.out.println("Количество велосипедов в списке после удаления элементов: " + bicycleList.size());
        System.out.println(bicycleList.toString());

        System.out.println("\n2. Числа");
        MyArrayList<Integer> digits = new MyArrayList<>();
        for (int i = 0; i < 10; i++) {
            int digit = new Random().nextInt(10) + 1;
            try {
                digits.add(digit);
            } catch (MyArrayStoreException e) {
                e.printStackTrace();
            }
        }
        System.out.println(digits);
        System.out.println("Удаляются чётные числа");
        ArrayList<Integer> toRemove = new ArrayList<>();
        for (int i = 0; i < digits.size(); i++) {
            int digit = digits.get(i);
            if (digit % 2 == 0) {
                System.out.println("Удаляется " + i + "-й элемент: " + digit);
                toRemove.add(digit);
            }
        }
        for (Integer number : toRemove) {
            digits.remove(number);
        }
        System.out.println("Список после удаления элементов: " + digits);
    }
}