package org.example;


import org.example.PizzaBuilder.HawaianPizza;
import org.example.PizzaBuilder.HawaianPizzaBuilder;
import org.example.PizzaBuilder.VegetarianPizza;
import org.example.PizzaBuilder.VegetarianPizzaBuilder;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        MestrePizzer pizzaiolo = new MestrePizzer();

        HawaianPizzaBuilder hawaianPizzaBuilder = new HawaianPizzaBuilder();
        pizzaiolo.makeMediumPizzaWithClassicDoe(hawaianPizzaBuilder);
        HawaianPizza mediumHawaianPizzaClassicDoe = hawaianPizzaBuilder.bake();

        VegetarianPizzaBuilder vegetarianPizzaBuilder = new VegetarianPizzaBuilder();
        pizzaiolo.makeFamiliarPizzaWithCrustyDoe(vegetarianPizzaBuilder);
        VegetarianPizza familiarVegetarianPizzaCrusyDoe = vegetarianPizzaBuilder.bake();
    }
}