package com.basava.structural.decorator_pattern.nonveg_decorator;

import com.basava.structural.decorator_pattern.base_pizza.BasePizza;

public class Shrimp extends BasePizza {
    private final BasePizza pizza;

    public Shrimp(BasePizza pizza){
        this.pizza = pizza;
    }

    @Override
    public double cost() {
        return this.pizza.cost() + 150.;
    }
}
