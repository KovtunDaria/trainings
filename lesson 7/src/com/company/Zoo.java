package com.company;

import java.util.Collection;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Zoo {
    private Random random = new Random();
    private Set<WildAnimal> wildAnimals;
    private Set<PetAnimal> petAnimals;

    public Zoo() {
        this.wildAnimals = fillCollectionWithWildAnimals(new HashSet<>());
        this.petAnimals = fillCollectionWithPetAnimals(new HashSet<>());
    }

    public Set<WildAnimal> fillCollectionWithWildAnimals(Set<WildAnimal> wildAnimals) {
        String[] wolves = {"Игорь", "Алексей", "Антон", "Иннокентий", "Любим", "Олег", "Артём", "Святозар", "Степан", "Александр"};
        String[] foxes = {"Алиса", "Лена", "Лола", "Лиля", "Луиза", "Лада", "Леона", "Лейла", "Лала", "Лили"};
        int animalCount = random.nextInt(8) + 3; //от 3 до 10
        boolean animalType = random.nextBoolean();
        for (int i = 0; i < animalCount; i++) {
            if (animalType) {
                wildAnimals.add(new Wolf(wolves[random.nextInt(wolves.length)]));
            } else {
                wildAnimals.add(new Fox(foxes[random.nextInt(foxes.length)]));
            }
        }
        return wildAnimals;
    }

    public Set<PetAnimal> fillCollectionWithPetAnimals(Set<PetAnimal> petAnimals) {
        String[] cats = {"Мурка", "Пушок", "Снежок", "Малинка", "Рыжик"};
        String[] dogs = {"Шарик", "Борька", "Бобик", "Арбуз", "Мухтар"};
        int animalCount = random.nextInt(5) + 1; //от 1 до 5
        boolean animalType = random.nextBoolean();
        for (int i = 0; i < animalCount; i++) {
            if (animalType) {
                petAnimals.add(new Cat(cats[random.nextInt(cats.length)]));
            } else {
                petAnimals.add(new Dog(dogs[random.nextInt(dogs.length)]));
            }
        }
        return petAnimals;
    }

    private void printAnimalsFromCollection(Collection<? extends Animal> animals) {
        System.out.println(animals);
    }

    public void printAllAnimals() {
        printAnimalsFromCollection(wildAnimals);
        printAnimalsFromCollection(petAnimals);
    }
}
