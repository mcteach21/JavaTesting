package mc.apps.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Database {
    private final Logger logger = LoggerFactory.getLogger(Database.class);

    public Database() {
        logger.info("database instantiate..");
    }

    public boolean isAvailable() {
        logger.info("database is available!");
        return false; // test demo
    }
    public String getName() {
        logger.info("database getName()..");
        return "Demo DB!";
    }
}
