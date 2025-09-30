package experiment.belajar_spring_dasar;

import experiment.belajar_spring_dasar.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ScopeTest {
    private ApplicationContext context;

    @BeforeEach
    void setup() {
        context = new AnnotationConfigApplicationContext(ScopeConfiguration.class);
    }

    @Test
    void testPrototypeScope() {
        Foo f1 = context.getBean(Foo.class);
        Foo f2 = context.getBean(Foo.class);
        Foo f3 = context.getBean(Foo.class);

        Assertions.assertNotSame(f1, f2);
        Assertions.assertNotSame(f1, f3);
        Assertions.assertNotSame(f3, f2);
    }
}
