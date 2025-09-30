package experiment.belajar_spring_dasar;

import experiment.belajar_spring_dasar.data.Bar;
import experiment.belajar_spring_dasar.data.Foo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;

@Slf4j
@Configuration
public class DependsOnConfiguration {

    @Lazy
    @DependsOn(value = "bar")
    @Bean
    public Foo foo() {
        log.info("Create foo");
        return new Foo();
    }

    @Bean
    public Bar bar() {
        log.info("Create bar");
        return new Bar();
    }
}
