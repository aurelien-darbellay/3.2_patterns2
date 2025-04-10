package org.example;

import java.util.ArrayList;
import java.util.List;

public class StockBroker {
    private List<StockAgency> agencies = new ArrayList<>();

    // Register an observer
    public void addAgency(StockAgency agency) {
        agencies.add(agency);
    }

    // Remove an observer
    public void removeAgency(StockAgency agency) {
        agencies.remove(agency);
    }

    // Notify all observers
    private void notifyChange(String change) {
        for (StockAgency agency : agencies) {
            agency.update(change);
        }
    }

    // Simulate stock market going up
    public void marketGoesUp() {
        System.out.println("Market has gone up!");
        notifyChange("up");
    }

    // Simulate stock market going down
    public void marketGoesDown() {
        System.out.println("Market has gone down!");
        notifyChange("down");
    }
}

