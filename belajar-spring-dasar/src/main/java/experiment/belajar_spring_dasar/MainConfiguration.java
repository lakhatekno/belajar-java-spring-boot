package experiment.belajar_spring_dasar;

import experiment.belajar_spring_dasar.configuration.BarConfiguration;
import experiment.belajar_spring_dasar.configuration.FooConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = {
        FooConfiguration.class,
        BarConfiguration.class
})
public class MainConfiguration {
}
