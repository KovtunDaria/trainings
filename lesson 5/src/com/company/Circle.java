package com.company;

public class Circle extends Figure {

    private float radius;

    public Circle(float xCenter, float yCenter, float radius) {
        super(xCenter, yCenter);
        if (radius >= 0 && radius <= 10) {
            this.radius = radius;
        } else throw new IllegalArgumentException("Радиус должен быть от 0 до 10");
    }

    @Override
    public double square() {
        return Math.PI * radius * radius;
    }
}
