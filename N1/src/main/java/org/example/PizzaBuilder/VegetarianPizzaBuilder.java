package org.example.PizzaBuilder;

import java.util.List;

public class VegetarianPizzaBuilder implements PizzaBuilder {

    @Override
    public List<String> basicIngredients() {
        return List.of("Tomato", "Mozzarella", "Eggplant", "Mushroom", "Zucchini");
    }
}
