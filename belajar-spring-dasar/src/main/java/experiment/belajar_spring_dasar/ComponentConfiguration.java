package experiment.belajar_spring_dasar;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "experiment.belajar_spring_dasar.service",
        "experiment.belajar_spring_dasar.repository",
        "experiment.belajar_spring_dasar.configuration",
})
public class ComponentConfiguration {
}
