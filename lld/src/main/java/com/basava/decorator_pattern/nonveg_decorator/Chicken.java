package com.basava.decorator_pattern.nonveg_decorator;

import com.basava.decorator_pattern.base_pizza.BasePizza;

public class Chicken extends NonvegDecorator {
    private final BasePizza pizza;

    public Chicken(BasePizza pizza){
        this.pizza = pizza;
    }

    @Override
    public double cost() {
        return this.pizza.cost() + 100.;
    }
}
