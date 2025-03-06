package org.example.PizzaBuilder;

import java.util.ArrayList;
import java.util.List;

public class VegetarianPizzaBuilder implements PizzaBuilder {

    private final List<String> ingredients = new ArrayList<>(List.of("Tomato","Mozzarella","Mushrooms","Eggplants","Zucchini"));
    private Pizza.Size size;
    private Pizza.Dough doughType;

    @Override
    public PizzaBuilder addIngredient(String ingredient) {
        this.ingredients.add(ingredient);
        return this;
    }

    @Override
    public void resetIngredients() {
            this.ingredients.clear();
            this.ingredients.addAll(List.of("Tomato","Mozzarella","Pineapple","Ham"));
    }

    @Override
    public List<String> ingredients() {
        return this.ingredients;
    }

    @Override
    public PizzaBuilder setSize(Pizza.Size size) {
        this.size = size;
        return this;
    }

    @Override
    public Pizza.Size size() {
        return this.size;
    }

    @Override
    public PizzaBuilder setDough(Pizza.Dough doughType) {
        this.doughType = doughType;
        return this;
    }

    @Override
    public Pizza.Dough dough() {
        return this.doughType;
    }
}
