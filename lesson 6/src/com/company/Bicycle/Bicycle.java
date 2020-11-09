package com.company.Bicycle;

import java.util.Objects;

//- Создайте класс Bicycle, определите у него свойства String modelName; int maxSpeed (от 5 до 50км\ч);
//- Переопределите equals и hashCode, который используют оба свойства велосипеда.

public class Bicycle {
    private final String modelName;
    private int maxSpeed;

    public Bicycle(String modelName, int maxSpeed) {
        this.modelName = modelName;
        try {
            if (maxSpeed >= 5 && maxSpeed <= 50) {
                this.maxSpeed = maxSpeed;
            } else {
                throw new BicycleSpeedException("");
            }
        } catch (BicycleSpeedException e) {
            System.out.println("Скорость должна быть от 5 до 50 (в км/ч)");
        }
    }

    public String getModelName() {
        return modelName;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String toString() {
        return "Bicycle: " + "modelName '" + modelName + "',  max speed " + maxSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Bicycle)) {
            return false;
        }
        Bicycle bicycle = (Bicycle) o;
        return bicycle.maxSpeed == maxSpeed && bicycle.modelName.equals(modelName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelName, maxSpeed);
    }

}
