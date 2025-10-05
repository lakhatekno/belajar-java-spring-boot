package experiment.belajar_spring_dasar;

import experiment.belajar_spring_dasar.data.MultiFoo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = {
        "experiment.belajar_spring_dasar.service",
        "experiment.belajar_spring_dasar.repository",
        "experiment.belajar_spring_dasar.configuration",
})
@Import(MultiFoo.class)
public class ComponentConfiguration {
}
