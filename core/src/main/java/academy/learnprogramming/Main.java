package academy.learnprogramming;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    private static final Logger log = LoggerFactory.getLogger(Main.class);


    public static void main(String[] args) {
        log.info("Guess The Number Game");

        // CREATE CONTEXT (CONTAINER)
        ConfigurableApplicationContext context
                = new AnnotationConfigApplicationContext(AppConfig.class);

        // GET NUMBER GENERATOR BEAN FROM CONTEXT (CONTAINER)
        NumberGenerator numberGenerator
                = context.getBean(NumberGenerator.class);

        // CALL METHOD TO GET A RANDOM NUMBER
        int number = numberGenerator.next();

        // LOG GENERATED NUMBER
        log.info("number = {}", number);

        // GET GAME BEAN FROM CONTEXT (CONTAINER)
        Game game = context.getBean(Game.class);

        // CLOSE CONTEXT (CONTAINER)
        context.close();



    }

}
