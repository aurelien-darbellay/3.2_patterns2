package org.example.PizzaBuilder;

import java.util.List;

public class HawaianPizzaBuilder extends PizzaBuilder {
    private List<String> ingredients;
    @Override
    public void setIngredients() {
        this.ingredients = List.of("Mozzarella","Tomato","Ham","Pineapple");
    }
    public HawaianPizza bake(){
        return new HawaianPizza(super.size,super.doughType,this.ingredients);
    }
}
