package se.antoneliasson.inventarium.models;

import java.util.Map;

public class ItemLookup {
    private final Database db;
    
    public ItemLookup(Database db) {
        this.db = db;
    }
    
    public Product get(GTIN gtin) {
        Map<String, String> row = db.lookupProduct(gtin);
        return new Product(gtin, row.get("name"), row.get("brand"));
    }
}
