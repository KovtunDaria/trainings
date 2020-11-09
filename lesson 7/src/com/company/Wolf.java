package com.company;

public class Wolf extends WildAnimal {

    public Wolf(String name) {
        super(name);
    }

    @Override
    Meal getFavouriteMeal() {
        return Meal.MEAT;
    }
}
