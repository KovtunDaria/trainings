package com.company;

public class GreenApplesFactory extends AbstractFabric {

    @Override
    Fruit makeFruit() {
        return new Apple(10, "зелёное");
    }
}
