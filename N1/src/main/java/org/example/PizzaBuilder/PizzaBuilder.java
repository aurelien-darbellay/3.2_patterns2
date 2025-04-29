package org.example.PizzaBuilder;


abstract public class PizzaBuilder {
    protected Pizza.Size size;
    protected Pizza.Dough doughType;
    public void setDoughType(Pizza.Dough doughType) {
        this.doughType = doughType;
    }
    public void setSize(Pizza.Size size) {
        this.size = size;
    }
    abstract public void setIngredients();
}
