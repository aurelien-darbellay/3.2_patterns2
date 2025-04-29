package org.example;

import org.example.PizzaBuilder.HawaianPizzaBuilder;
import org.example.PizzaBuilder.Pizza;
import org.example.PizzaBuilder.PizzaBuilder;


import java.util.List;

public class MestrePizzer {
    public void makeSmalePizzaWithClassicDoe(PizzaBuilder builder){
        builder.setSize(Pizza.Size.SMALL);
        builder.setDoughType(Pizza.Dough.CLASSIC);
        builder.setIngredients();
    }
    public void makeMediumPizzaWithClassicDoe(PizzaBuilder builder){
        builder.setSize(Pizza.Size.MEDIUM);
        builder.setDoughType(Pizza.Dough.CLASSIC);
        builder.setIngredients();
    }
    public void makeFamiliarPizzaWithClassicDoe(PizzaBuilder builder){
        builder.setSize(Pizza.Size.MEDIUM);
        builder.setDoughType(Pizza.Dough.CLASSIC);
        builder.setIngredients();
    }
    public void makeSmalePizzaWithCrustyDoe(PizzaBuilder builder){
        builder.setSize(Pizza.Size.SMALL);
        builder.setDoughType(Pizza.Dough.CRUSTY);
        builder.setIngredients();
    }
    public void makeMediumPizzaWithCrustyDoe(PizzaBuilder builder){
        builder.setSize(Pizza.Size.MEDIUM);
        builder.setDoughType(Pizza.Dough.CRUSTY);
        builder.setIngredients();
    }
    public void makeFamiliarPizzaWithCrustyDoe(PizzaBuilder builder){
        builder.setSize(Pizza.Size.MEDIUM);
        builder.setDoughType(Pizza.Dough.CRUSTY);
        builder.setIngredients();
    }
}
