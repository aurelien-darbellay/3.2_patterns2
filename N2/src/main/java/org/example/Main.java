package org.example;

public class Main {
    public static void main(String[] args) {
        StockBroker broker = new StockBroker();

        StockAgency agency1 = new ConcreteAgency("Wall Street Agency");
        StockAgency agency2 = new ConcreteAgency("Downtown Investors");

        broker.addAgency(agency1);
        broker.addAgency(agency2);

        broker.marketGoesUp();
        broker.marketGoesDown();
    }
}