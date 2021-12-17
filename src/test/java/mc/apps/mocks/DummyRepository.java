package mc.apps.mocks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DummyRepository {
    private final Logger logger = LoggerFactory.getLogger(DummyRepository.class);

    public DummyRepository() {
        logger.info("DummyRepository instantiate!");
    }
    public String info(){
        return "repo0";
    }
}
