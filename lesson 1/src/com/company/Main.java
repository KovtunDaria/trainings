package com.company;

import java.util.Scanner;
// Написать программу, в которой есть две переменные типа Integer со значениями.
// Значения можно указать в коде программы или ввести с клавиатуры или взять из аргументов.
// Если первое число больше второго – написать на экран « Число %s больше %s”
// Если первое число меньше второго – написать на экран «Число %s меньше %s”
// В любом случае, вывести на экран сумму чисел.
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer firstNumber = sc.nextInt();
        Integer secondNumber = sc.nextInt();
        if (firstNumber >= secondNumber) {
            System.out.println("Число " + firstNumber + " больше, чем " + secondNumber);
        } else {
            System.out.println("Число " + firstNumber + " меньше, чем " + secondNumber);
        }
        sc.close();
        System.out.println("Сумма чисел: " + (firstNumber + secondNumber));
    }
}
