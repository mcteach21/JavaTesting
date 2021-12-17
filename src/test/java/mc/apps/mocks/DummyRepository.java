package mc.apps.mocks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class DummyRepository {
    private final Logger logger = LoggerFactory.getLogger(DummyRepository.class);

    public DummyRepository() {
        logger.info("DummyRepository instantiate!");
    }
    public String info(){
        return "repo";
    }

    public List<Article> findAll() {
        return new ArrayList<Article>();
    }
}
