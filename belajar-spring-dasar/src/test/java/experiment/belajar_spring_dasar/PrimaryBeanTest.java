package experiment.belajar_spring_dasar;

import experiment.belajar_spring_dasar.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoUniqueBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PrimaryBeanTest {
    @Test
    void testDuplicate() {
        ApplicationContext context = new AnnotationConfigApplicationContext(PrimaryBeanConfiguration.class);


        Assertions.assertThrows(NoUniqueBeanDefinitionException.class, () -> {
            Foo foo = context.getBean(Foo.class);
        });
    }

    @Test
    void getBean() {
        ApplicationContext context = new AnnotationConfigApplicationContext(PrimaryBeanConfiguration.class);

        Foo f1 = context.getBean("foo1", Foo.class);
        Foo f2 = context.getBean(Foo.class);
        Foo f3 = context.getBean("foo2", Foo.class);

        Assertions.assertSame(f1, f2);
        Assertions.assertNotSame(f3, f2);
        Assertions.assertNotSame(f3, f1);
    }
}
