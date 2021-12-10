package mc.apps.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Repository {
    private final Logger logger = LoggerFactory.getLogger(Repository.class);

    final Item item;
    final Database database;

    public Repository(Item itemMock, Database databaseMock){
        logger.info("Repository instantiate.."+databaseMock.getName());
        this.item = itemMock;
        this.database = databaseMock;
    }

//    public Repository() {
//        logger.info("Repository instantiate..");
//    }

    public boolean isOk() {
        return true;
    }

    public void doSomething() {
        logger.info("I'm doing something..");
    }
}
