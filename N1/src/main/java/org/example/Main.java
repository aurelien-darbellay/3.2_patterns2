package org.example;

import org.example.PizzaBuilder.HawaianPizzaBuilder;
import org.example.PizzaBuilder.Pizza;
import org.example.PizzaBuilder.PizzaBuilder;
import org.example.PizzaBuilder.VegetarianPizzaBuilder;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        PizzaBuilder hawaianOven = new HawaianPizzaBuilder();
        Pizza hawaian1 = hawaianOven.makePizza(Pizza.Size.SMALL, Pizza.Dough.AMERICAN);
        Pizza hawaian2 = hawaianOven.makePizza(List.of("Mushroom"), Pizza.Size.MEDIUM, Pizza.Dough.CRUSTY);
        MestrePizzer vegetarianPizzaiolo = new MestrePizzer(new VegetarianPizzaBuilder());
        Pizza veggie1 = vegetarianPizzaiolo.bakePizza(Pizza.Size.FAMILIAR, Pizza.Dough.CLASSIC);
        Pizza veggie2 = vegetarianPizzaiolo.bakePizza(Pizza.Size.SMALL, Pizza.Dough.CRUSTY, List.of("Red Hot Chilli Pepper"));
        hawaian1.print();
        hawaian2.print();
        veggie1.print();
        veggie2.print();
    }
}