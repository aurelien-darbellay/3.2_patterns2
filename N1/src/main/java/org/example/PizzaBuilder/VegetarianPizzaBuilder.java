package org.example.PizzaBuilder;

import java.util.List;

public class VegetarianPizzaBuilder extends PizzaBuilder {
    private List<String> ingredients;
    @Override
    public void setIngredients() {
        this.ingredients = List.of("Mozzarella","Tomato","EggPlant","Zucchini");
    }
    public VegetarianPizza bake(){
        return new VegetarianPizza(super.size,super.doughType,this.ingredients);
    }
}
