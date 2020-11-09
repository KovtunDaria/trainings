package com.company;

public class Rectangle extends Figure {
    private float width;
    private float height;

    public Rectangle(float xCenter, float yCenter, float width, float height) {
        super(xCenter, yCenter);
        if (width >= 0 && width <= 20) {
            this.width = width;
        } else throw new IllegalArgumentException("Ширина должна быть от 0 до 20");

        if (height >= 0 && height <= 20) {
            this.height = height;
        } else throw new IllegalArgumentException("Высота должна быть от 0 до 20");
    }

    @Override
    public double square() {
        return width * height;
    }
}
