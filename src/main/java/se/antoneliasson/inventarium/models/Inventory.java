package se.antoneliasson.inventarium.models;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private final Database db;
    private final Map<Product, Integer> products;
    
    public Inventory(Database db) {
        this.db = db;
        products = new HashMap<>();
    }
    
    public void add(Product product) {
        
    }
    
    public int count(Product product) {
        return 0;
    }
}
