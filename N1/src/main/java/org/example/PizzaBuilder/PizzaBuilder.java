package org.example.PizzaBuilder;


import java.util.List;

public interface PizzaBuilder {

    PizzaBuilder addIngredient(String ingredient);
    void resetIngredients();
    List<String> ingredients();
    PizzaBuilder setSize(Pizza.Size size);
    Pizza.Size size();
    PizzaBuilder setDough (Pizza.Dough doughType);
    Pizza.Dough dough();

    default Pizza build(){
        Pizza newPizza = new Pizza(size(),dough(),ingredients());
        resetIngredients();
        return newPizza;
    }
}
