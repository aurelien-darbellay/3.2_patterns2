package org.example.PizzaBuilder;

import java.util.List;
import java.util.Objects;

public class Pizza {
    public enum Dough {
        CRUSTY,CLASSIC
    }
    public enum Size {
        SMALL(16),MEDIUM(22),FAMILIAR(36);
        private final int diameter;
        Size(int diameter){
            this.diameter = diameter;
        }
        public int getDiameter(){
            return this.diameter;
        }
    }
    private Size size;
    private Dough doughType;
    private List<String> toppings;
    public Pizza(){};
    public Pizza(Size size, Dough doughType, List<String> toppings) {
        this.size = size;
        this.doughType = doughType;
        this.toppings = toppings;
    }

    // Getters and Setters
    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Dough getDoughType() {
        return doughType;
    }

    public void setDoughType(Dough doughType) {
        this.doughType = doughType;
    }

    public List<String> getToppings() {
        return toppings;
    }

    public void setToppings(List<String> toppings) {
        this.toppings = toppings;
    }

    //Identity
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pizza pizza = (Pizza) o;
        return size == pizza.size && doughType == pizza.doughType && Objects.equals(toppings, pizza.toppings);
    }
    @Override
    public int hashCode() {
        return Objects.hash(size, doughType, toppings);
    }
    //Exposition
    @Override
    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", doughType=" + doughType +
                ", toppings=" + String.join(",",toppings) +
                '}';
    }
    public void print(){
        System.out.println(this.toString());
    }
}
