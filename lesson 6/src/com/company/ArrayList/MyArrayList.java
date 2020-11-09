package com.company.ArrayList;

import java.util.ArrayList;

//Задание 1. Велосипеды и контейнеры
//
//Создать свой класс MyArrayList, который хранит максимум 10 объектов любого типа (по аналогии с ArrayList).
//Если попытаться добавить больше, чем 10 элементов, то должно выкинуться unchecked исключение - MyArrayStoreException.
//Используйте обощенный класс для этого (generic) с типом T.
//
//- Реализуйте методы:
//1. void add(T) - добавляет элемент  в коллекцию
//2. boolean remove(T) - возвращает true, если элемент был найден и удален
//3. T[] toArray() - возвращает массив из всех текущих элементов
//4. int size()
//5. T get(int) - взять элемент по индексу.
public class MyArrayList<T> {
    private static final int MAX_SIZE = 10;

    final private ArrayList<T> array = new ArrayList<>();

    public void add(T element) throws MyArrayStoreException {
        if (array.size() < MAX_SIZE) {
            array.add(element);
        } else {
            throw new MyArrayStoreException("Не может храниться более чем " + MAX_SIZE);
        }
    }

    public boolean remove(T element) {
        return array.remove(element);
    }

    public T[] toArray() {
        return (T[]) array.toArray();
    }

    public int size() {
        return array.size();
    }

    public T get(int index) {
        return array.get(index);
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "array=" + array +
                '}';
    }
}
