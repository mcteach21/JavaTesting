package mc.apps.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Service {
    private final Logger logger = LoggerFactory.getLogger(Service.class);

    private Database database;
    public Service(Database database) {
        logger.info("service instantiate..add database instance");
        this.database = database;
    }

    public String info() {
        return database.getName();
    }

    @Override
    public String toString() {
        return "Service Using database : " + database.getName();
    }
}
