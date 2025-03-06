package org.example;

import org.example.PizzaBuilder.HawaianPizzaBuilder;
import org.example.PizzaBuilder.Pizza;
import org.example.PizzaBuilder.PizzaBuilder;
import org.example.PizzaBuilder.VegetarianPizzaBuilder;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        PizzaBuilder hawaianBuilder = new HawaianPizzaBuilder();
        Pizza smallHawaianAmericanDoe = hawaianBuilder.setSize(Pizza.Size.SMALL).setDough(Pizza.Dough.AMERICAN).build();
        smallHawaianAmericanDoe.print();
        Pizza familyHawaianCrustyDoeExtraBacon = hawaianBuilder.addIngredient("Bacon").setSize(Pizza.Size.FAMILIAR).setDough(Pizza.Dough.CRUSTY).build();
        familyHawaianCrustyDoeExtraBacon.print();
        MestrePizzer aurelien = new MestrePizzer(new VegetarianPizzaBuilder());
        Pizza bakedByAurelienFirst = aurelien.bakePizza(Pizza.Size.SMALL, Pizza.Dough.CLASSIC);
        bakedByAurelienFirst.print();
        Pizza bakedBYAurelienSecond = aurelien.bakePizza(Pizza.Size.MEDIUM, Pizza.Dough.AMERICAN, List.of("Hot Chilli Pepper"));
        bakedBYAurelienSecond.print();
    }
}