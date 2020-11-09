package com.company;

public class Dog extends PetAnimal {

    public Dog(String name) {
        super(name);
    }

    @Override
    Meal getFavouriteMeal() {
        return Meal.BONE;
    }
}
