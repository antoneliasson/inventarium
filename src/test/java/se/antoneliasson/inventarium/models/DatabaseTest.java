package se.antoneliasson.inventarium.models;

import java.util.Map;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DatabaseTest {
    private Database fixture;
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        fixture = new Database("test.sqlite");
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void findProduct() {
        GTIN gtin = new GTIN(12345);
        Map<String, String> row = fixture.lookupProduct(gtin);
        assertNotNull(row);
    }
}
