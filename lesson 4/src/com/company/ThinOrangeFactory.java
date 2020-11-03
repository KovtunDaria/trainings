package com.company;

public class ThinOrangeFactory extends AbstractFabric {

    @Override
    Fruit makeFruit() {
        return new Orange(10, positiveRandom(5)+1);
    }
}
