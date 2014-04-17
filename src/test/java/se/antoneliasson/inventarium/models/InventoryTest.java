package se.antoneliasson.inventarium.models;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class InventoryTest {
    private Inventory inventory;
    private ItemLookup lookup;
    
    public InventoryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        inventory = new Inventory();
        lookup = new ItemLookup();
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void addProductToInventory() {
        GTIN gtin = new GTIN(12345);
        Product product = lookup.get(gtin);
        inventory.add(product);
        int count = inventory.count(product);
        assertEquals("article count should be 1", 1, count);
    }
}
