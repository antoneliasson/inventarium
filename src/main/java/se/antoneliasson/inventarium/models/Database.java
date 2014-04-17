package se.antoneliasson.inventarium.models;

import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Database {

    private final Logger log;
    private final Connection connection;

    public Database(String filename) {
        log = LogManager.getLogger();
        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException ex) {
            log.fatal(ex);
            System.exit(1);
        }
        connection = null;
    }

    public Map<String, String> lookupProduct(GTIN id) {
        return new HashMap<>();
    }
}
