package com.company;

public class Cat extends PetAnimal {

    public Cat(String name) {
        super(name);
    }

    @Override
    Meal getFavouriteMeal() {
        return Meal.FISH;
    }
}
