package experiment.belajar_spring_dasar;

import experiment.belajar_spring_dasar.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RenameBeanTest {
    @Test
    void getBean() {
        ApplicationContext context = new AnnotationConfigApplicationContext(RenameBeanConfiguration.class);

        Foo f1 = context.getBean("Asep Sule", Foo.class);
        Foo f2 = context.getBean(Foo.class);
        Foo f3 = context.getBean("Supri Aspal", Foo.class);

        Assertions.assertSame(f1, f2);
        Assertions.assertNotSame(f3, f2);
        Assertions.assertNotSame(f3, f1);
    }
}
