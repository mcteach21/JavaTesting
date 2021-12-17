package mc.apps.mocks;

import mc.apps.main.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DummyService {
    private final Logger logger = LoggerFactory.getLogger(DummyService.class);

    DummyRepository repository;

    public DummyService(DummyRepository repository) {
        this.repository = repository;
        logger.info("DummyService instantiate..Repository = "+this.repository);
    }

    public DummyRepository getRepository() {
        return repository;
    }

    public Object info() {
        return this.repository.info();
    }
}
