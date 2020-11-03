package com.company;

public class Apple extends Fruit{
    private String color;

    public Apple(int weight, String color) {
        super(weight);
        this.color = switch (color) {
            case "красное", "жёлтое", "зелёное" -> color;
            default -> throw new IllegalArgumentException("Разрешены только следующие цвета: красное, жёлтое, зелёное");
        };
    }

    @Override
    public String toString() {
        return "Это яблоко, цвет: " + color + ", вес: " + weight;
    }
}
