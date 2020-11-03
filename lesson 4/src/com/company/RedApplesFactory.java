package com.company;

public class RedApplesFactory extends AbstractFabric {

    @Override
    Fruit makeFruit() {
        return new Apple(10, "красное");
    }
}
