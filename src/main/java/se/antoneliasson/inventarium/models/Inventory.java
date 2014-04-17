package se.antoneliasson.inventarium.models;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Map<Product, Integer> products;
    
    public Inventory() {
        products = new HashMap<>();
    }
    
    public void add(Product product) {
        
    }
    
    public int count(Product product) {
        return 0;
    }
}
