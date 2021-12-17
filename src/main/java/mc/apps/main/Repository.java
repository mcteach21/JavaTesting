package mc.apps.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Repository {
    private final Logger logger = LoggerFactory.getLogger(Repository.class);
//    final Database database;

//    public Repository(Database database){
//        this.database = database;
//        logger.info("Repository instantiate..database (mock) : "+database);
//    }

    public Repository(){
        logger.info("Repository instantiate..");//database (mock) : "+database);
    }

    public String info() {
        return "Demo Repository";
    }

    public void doSomething() {
        logger.info("I'm doing something..");
    }
}
