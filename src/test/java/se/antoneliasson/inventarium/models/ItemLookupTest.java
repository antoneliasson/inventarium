package se.antoneliasson.inventarium.models;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ItemLookupTest {
    ItemLookup fixture;
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        Database db = new Database("test.sqlite");
        fixture = new ItemLookup(db);
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void lookupItem() {
        GTIN gtin = new GTIN(12345);
        Product product = fixture.get(gtin);
        assertNotNull(product);
    }
}
