package mc.apps.mocks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class DummyService {
    private final Logger logger = LoggerFactory.getLogger(DummyService.class);

    DummyRepository repository;
    public DummyService(DummyRepository repository) {
        this.repository = repository;
        logger.info("DummyService instantiate..(Repository Injected) : "+(this.repository!=null));
    }

    public DummyRepository getRepository() {
        return this.repository;
    }

    public Object info() {
        return this.repository.info();
    }

    public boolean isOk() {
        return (this.repository!=null);
    }

    public List<Article> list() {
        return this.repository.findAll();
    }
}
