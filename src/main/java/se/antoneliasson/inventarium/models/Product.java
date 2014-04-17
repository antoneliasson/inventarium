package se.antoneliasson.inventarium.models;

public class Product {
    private final String name;
    private final String brand;
    private final GTIN gtin;
    
    public Product(GTIN gtin, String name, String brand) {
        this.gtin = gtin;
        this.name = name;
        this.brand = brand;
    }
}
