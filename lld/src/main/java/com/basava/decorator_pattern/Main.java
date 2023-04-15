package com.basava.decorator_pattern;

import com.basava.decorator_pattern.base_pizza.BasePizza;
import com.basava.decorator_pattern.base_pizza.MargheritaPizza;
import com.basava.decorator_pattern.base_pizza.SupremePizza;
import com.basava.decorator_pattern.nonveg_decorator.Chicken;
import com.basava.decorator_pattern.nonveg_decorator.Shrimp;
import com.basava.decorator_pattern.toppings_decorator.ExtraCheese;
import com.basava.decorator_pattern.toppings_decorator.Pineapple;

public class Main {
    public static void main(String[] args) {
        BasePizza pizza1 = new ExtraCheese(new MargheritaPizza());
        System.out.println("Margherita with extra cheese: " + pizza1.cost());

        BasePizza pizza2 = new Pineapple(new Chicken(new SupremePizza()));
        System.out.println("Chicken Supreme with pineapple topping: " + pizza2.cost());

        BasePizza pizza3 = new ExtraCheese(new Shrimp(new Chicken(new SupremePizza())));
        System.out.println("Chicken Supreme with shrimp and extra cheese: " + pizza3.cost());
    }
}
