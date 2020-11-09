package com.company;

import java.util.ArrayList;
import java.util.List;

public abstract class Figure {
    private float xCenter;
    private float yCenter;

    public abstract double square();

    public Figure(float xCenter, float yCenter) {
        this.xCenter = xCenter;
        this.yCenter = yCenter;
    }

    enum Quadrant {I, II, III, IV};

    List<Quadrant> getQuadrant() {
        List<Quadrant> quadrants = new ArrayList<>();
        if (xCenter > 0 && yCenter > 0) {
            quadrants.add(Quadrant.I);
        } else if (xCenter < 0 && yCenter > 0) {
            quadrants.add(Quadrant.II);
        } else if (xCenter < 0 && yCenter < 0) {
            quadrants.add(Quadrant.III);
        } else if (xCenter > 0 && yCenter < 0) {
            quadrants.add(Quadrant.IV);
        } else if (xCenter == 0 && yCenter > 0) {
            quadrants.add(Quadrant.I);
            quadrants.add(Quadrant.II);
        } else if (xCenter == 0 && yCenter < 0) {
            quadrants.add(Quadrant.III);
            quadrants.add(Quadrant.IV);
        } else if (xCenter > 0 && yCenter == 0) {
            quadrants.add(Quadrant.I);
            quadrants.add(Quadrant.IV);
        } else if (xCenter < 0 && yCenter == 0) {
            quadrants.add(Quadrant.II);
            quadrants.add(Quadrant.III);
        } else if (xCenter == 0 && yCenter == 0) {
            quadrants.add(Quadrant.I);
            quadrants.add(Quadrant.II);
            quadrants.add(Quadrant.III);
            quadrants.add(Quadrant.IV);
        } else throw new IllegalArgumentException();
        return quadrants;
    }
}
