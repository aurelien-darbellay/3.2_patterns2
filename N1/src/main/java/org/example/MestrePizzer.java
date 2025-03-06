package org.example;

import org.example.PizzaBuilder.Pizza;
import org.example.PizzaBuilder.PizzaBuilder;

import java.util.List;

public class MestrePizzer {
    public final PizzaBuilder oven;

    public MestrePizzer(PizzaBuilder oven) {
        this.oven = oven;
    }

    public Pizza bakePizza(Pizza.Size size, Pizza.Dough doughType) {
        return oven.makePizza(size, doughType);
    }

    public Pizza bakePizza(Pizza.Size size, Pizza.Dough doughType, List<String> extraIngredients) {
        return oven.makePizza(extraIngredients, size, doughType);
    }
}
