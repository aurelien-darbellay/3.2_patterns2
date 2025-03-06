package org.example.PizzaBuilder;

import java.util.List;

public class HawaianPizzaBuilder implements PizzaBuilder {
    @Override
    public List<String> basicIngredients() {
        return List.of("Tomato", "Mozzarella", "Pineapple", "Ham");
    }

}
