package experiment.belajar_spring_dasar;

import experiment.belajar_spring_dasar.data.Foo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Slf4j
@Configuration
public class PrimaryBeanConfiguration {
    @Primary
    @Bean
    public Foo foo1() {
        Foo foo = new Foo();
        log.info("Creating new foo 1");
        return foo;
    }

    @Bean
    public Foo foo2() {
        Foo foo = new Foo();
        log.info("Creating new foo 2");
        return foo;
    }
}
