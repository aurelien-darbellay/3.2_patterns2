package org.example;

import org.example.PizzaBuilder.Pizza;
import org.example.PizzaBuilder.PizzaBuilder;

import java.util.List;

public class MestrePizzer {
    public final PizzaBuilder oven;

    public MestrePizzer(PizzaBuilder oven) {
        this.oven = oven;
    }
    public Pizza bakePizza(Pizza.Size size, Pizza.Dough doughType){
        return oven.setSize(size).setDough(doughType).build();
    }
    public Pizza bakePizza(Pizza.Size size, Pizza.Dough doughType, List<String> extraIngredients){
        for (String ingredient : extraIngredients){
            oven.addIngredient(ingredient);
        }
        return oven.setSize(size).setDough(doughType).build();
    }
}
