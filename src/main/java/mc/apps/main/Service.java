package mc.apps.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Service {
    private final Logger logger = LoggerFactory.getLogger(Service.class);

    final Repository repository;
    public Service(Repository repository) {
        logger.info("service instantiate..add repository instance");
        this.repository = repository;
    }

    public String info() {
        return "Service Using repository : "+ repository.info();
    }
}
