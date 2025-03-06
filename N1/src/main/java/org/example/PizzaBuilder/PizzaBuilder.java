package org.example.PizzaBuilder;


import java.util.ArrayList;
import java.util.List;

public interface PizzaBuilder {

    class Builder {
        private final List<String> ingredients;
        private Pizza.Size size;
        private Pizza.Dough doughType;

        Builder(List<String> basicIngredients) {
            this.ingredients = new ArrayList<String>(basicIngredients);
        }

        Builder addIngredient(String ingredient) {
            this.ingredients.add(ingredient);
            return this;
        }

        Builder setSize(Pizza.Size size) {
            this.size = size;
            return this;
        }

        Builder setDough(Pizza.Dough doughType) {
            this.doughType = doughType;
            return this;
        }

        Pizza build() {
            return new Pizza(this.size, this.doughType, this.ingredients);
        }
    }

    List<String> basicIngredients();

    default Builder startBaking() {
        return new Builder(basicIngredients());
    }

    default Pizza makePizza(Pizza.Size size, Pizza.Dough doughType) {
        Builder newPizza = startBaking();
        return newPizza.setSize(size).setDough(doughType).build();
    }

    default Pizza makePizza(List<String> extraIngredients, Pizza.Size size, Pizza.Dough doughType) {
        Builder newPizza = startBaking();
        for (String ingredient : extraIngredients) {
            newPizza.addIngredient(ingredient);
        }
        return newPizza.setSize(size).setDough(doughType).build();
    }
}
