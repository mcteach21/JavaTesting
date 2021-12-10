package mc.apps.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Item {
    private final Logger logger = LoggerFactory.getLogger(Item.class);

    public Item() {
        logger.info("Item instantiate..");
    }
}
