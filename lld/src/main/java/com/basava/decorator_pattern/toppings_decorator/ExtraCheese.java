package com.basava.decorator_pattern.toppings_decorator;

import com.basava.decorator_pattern.base_pizza.BasePizza;

public class ExtraCheese extends ToppingsDecorator{
    private final BasePizza pizza;

    public ExtraCheese(BasePizza pizza){
        this.pizza = pizza;
    }

    @Override
    public double cost() {
        return this.pizza.cost() + 15.;
    }
}
