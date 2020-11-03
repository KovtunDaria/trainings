package com.company;

public class Pineapple extends Fruit {
    private int tail;

    public Pineapple(int weight, int tail) {
        super(weight);
        if (!(tail >= 5 && tail <= 20)) {
            throw new IllegalArgumentException("Высота должна быть от 5 до 20");
        }
        this.tail = tail;
    }

    @Override
    public String toString() {
        return "Это ананас, высота его хвостика: " + tail + ", вес: " + weight;
    }
}
