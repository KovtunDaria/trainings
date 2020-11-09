package com.company;

public class Fox extends WildAnimal {

    public Fox(String name) {
        super(name);
    }

    @Override
    Meal getFavouriteMeal() {
        return Meal.BUNNY;
    }
}
