package experiment.belajar_spring_dasar;

import experiment.belajar_spring_dasar.data.Foo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BeanFactoryTest {

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setup() {
        applicationContext = new AnnotationConfigApplicationContext(ScanConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testBeanFactory() {
        ObjectProvider<Foo> beanProvider = applicationContext.getBeanProvider(Foo.class);
        List<Foo> collect = beanProvider.stream().collect(Collectors.toList());

        System.out.println(collect);

        Map<String, Foo> beansOfType = applicationContext.getBeansOfType(Foo.class);
        System.out.println(beansOfType);
    }
}
