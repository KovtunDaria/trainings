package com.company;

public class Orange extends Fruit {
    private int peelThickness;

    public Orange(int weight, int peelThickness) {
        super(weight);
        if (!(peelThickness >= 0 && peelThickness <= 20)) {
            throw new IllegalArgumentException("Толщина должна быть от 0 до 20");
        }
        this.peelThickness = peelThickness;
    }

    @Override
    public String toString() {
        return "Это апельсин, толщина кожурки: " + peelThickness + ", вес: " + weight;
    }
}
