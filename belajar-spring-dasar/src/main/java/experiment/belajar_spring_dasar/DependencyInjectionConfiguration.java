package experiment.belajar_spring_dasar;

import experiment.belajar_spring_dasar.data.Bar;
import experiment.belajar_spring_dasar.data.Foo;
import experiment.belajar_spring_dasar.data.FooBar;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class DependencyInjectionConfiguration {
    @Primary
    @Bean
    public Foo foo1() {
        return new Foo();
    }

    @Bean
    public Foo foo2() {
        return new Foo();
    }

    @Bean
    public Bar bar() {
        return new Bar();
    }

    @Bean
    public FooBar FooBar(@Qualifier("foo2") Foo foo, Bar bar) {
        return new FooBar(foo, bar);
    }
}
