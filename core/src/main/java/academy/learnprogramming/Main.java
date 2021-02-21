package academy.learnprogramming;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    private static final Logger log = LoggerFactory.getLogger(Main.class);

    private static final String CONFIG_LOCATION = "beans.xml";

    public static void main(String[] args) {
        log.info("Guess The Number Game");

        // CREATE CONTEXT (CONTAINER)
        ConfigurableApplicationContext context
                = new ClassPathXmlApplicationContext(CONFIG_LOCATION);

        NumberGenerator numberGenerator
                = context.getBean("numberGenerator", NumberGenerator.class);

        // CALL METHOD TO GET A RANDOM NUMBER
        int number = numberGenerator.next();

        // LOG GENERATED NUMBER
        log.info("number = {}", number);

        // CLOSE CONTEXT (CONTAINER)
        context.close();



    }

}
