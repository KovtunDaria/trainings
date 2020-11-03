package com.company;

public class LongPineapplesFactory extends AbstractFabric {
    @Override
    Fruit makeFruit() {
        return new Pineapple(10, positiveRandom(11)+10);
    }
}
