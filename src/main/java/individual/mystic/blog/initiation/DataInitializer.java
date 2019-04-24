package individual.mystic.blog.initiation;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Log4j2
@Component
@Profile("demo")
public class DataInitializer implements ApplicationListener<ApplicationReadyEvent> {

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        log.info("<<<<<<<<<<Initialization for Mystic Blog>>>>>>>>>>");
        log.info(">>>>>>>>>>Complete to initialization<<<<<<<<<<");
    }

}
