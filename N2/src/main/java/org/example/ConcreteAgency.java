package org.example;

public class ConcreteAgency implements StockAgency {
    private String name;

    public ConcreteAgency(String name) {
        this.name = name;
    }

    @Override
    public void update(String change) {
        System.out.println("[" + name + "] received market update: " + change);
    }
}
