package academy.learnprogramming;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

public class MessageGeneratorImpl implements MessageGenerator {

    // == CONSTANTS ==
    private static final Logger log = LoggerFactory.getLogger(MessageGeneratorImpl.class);

    // == FIELDS ==
    @Autowired
    private Game game;

    private int guessCount = 10;

    // == INIT METHOD ==
    @PostConstruct
    public void init() {
        log.info("game = {}", game);
    }

    // == PUBLIC METHODS
    @Override
    public String getMainMessage() {
        return "getMainMessage() called";
    }

    @Override
    public String getResultMessage() {
        return "getResultMessage() called";
    }
}