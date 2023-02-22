package ir.pdn.enterprise.wrapper;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.ApplicationPidFileWriter;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(exclude = {})
public class Application {


    protected static final Logger logger = LoggerFactory.getLogger(Application.class);
    public static void main(String[] args) {

        logger.info("Started app");
        SpringApplication app = new SpringApplication(Application.class);
        app.addListeners(new ApplicationPidFileWriter());
        ConfigurableApplicationContext context=app.run(args);
        logger.info("quitting , total bean count: "+context.getBeanDefinitionCount());
    }

}

